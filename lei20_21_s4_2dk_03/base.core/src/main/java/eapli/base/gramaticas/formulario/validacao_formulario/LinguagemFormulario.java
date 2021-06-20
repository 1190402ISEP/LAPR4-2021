package eapli.base.gramaticas.formulario.validacao_formulario;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.Calendar;
import java.util.Stack;

public class LinguagemFormulario {
    public static void main(String[] args) throws IOException {

        System.out.println("Resultado com visitor: \n\n");
        parseWithVisitor();
        System.out.println("---------------------------\n\n");
        System.out.println("Resultado com listener: \n\n");
        parseWithListener();

    }

    public static void parseWithVisitor()throws IOException{

        LinguagemFormularioLexer lexer = null;
        try {
            lexer = new LinguagemFormularioLexer(CharStreams.fromFileName("testeFormulario.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LinguagemFormularioParser parser = new LinguagemFormularioParser(tokens);
        ParseTree tree = parser.start();
        EvalFormularioVisitor eval1 = new EvalFormularioVisitor();
        int value = eval1.visit(tree).asInteger();
        System.out.println(value);
    }

    public static void parseWithListener()throws IOException{

        LinguagemFormularioLexer lexer = null;
        try {
            lexer = new LinguagemFormularioLexer(CharStreams.fromFileName("testeFormulario.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LinguagemFormularioParser parser = new LinguagemFormularioParser(tokens);
        ParseTree tree = parser.start();
        ParseTreeWalker walker = new ParseTreeWalker();
        EvalFormularioListener eval2 = new EvalFormularioListener();
        walker.walk(eval2,tree);
        System.out.println(eval2.getResult());
    }

}


class EvalFormularioVisitor extends LinguagemFormularioBaseVisitor<Value> {

    @Override
    public Value visitVerificarData(LinguagemFormularioParser.VerificarDataContext ctx) {
        Value dataInicio = this.visit(ctx.dataInicio);
        Value dataFim = this.visit(ctx.dataFim);
        Value tAusencia = this.visit(ctx.ausencia);
        Value juts = this.visit(ctx.just);
        Calendar dInicio = gerarDataInput(dataInicio);
        Calendar dFim = gerarDataInput(dataFim);

        if (dInicio.compareTo(dFim) > 0) {
            throw new ParseCancellationException("Não foi possivel fazer a operação");
        }

        if (tAusencia.toString().equalsIgnoreCase("Justificada") && juts == null) {
            throw new ParseCancellationException("Não foi possivel fazer a operação");
        }

        return new Value(dataInicio + "-" + dataFim);
    }

    @Override
    public Value visitVerificarDataSemJust(LinguagemFormularioParser.VerificarDataSemJustContext ctx) {
        Value dataInicio = this.visit(ctx.dataInicio);
        Value dataFim = this.visit(ctx.dataFim);
        Calendar dInicio = gerarDataInput(dataInicio);
        Calendar dFim = gerarDataInput(dataFim);

        if (dInicio.compareTo(dFim) > 0) {
            throw new ParseCancellationException("Não foi possivel fazer a operação");
        }

        return new Value(dataInicio + "-" + dataFim);
    }

    public Calendar gerarDataInput(Value value) {
        String[] data = value.toString().split("/");
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(data[2].trim()), Integer.parseInt(data[1].trim()), Integer.parseInt(data[0].trim()));
        return c;
    }

    @Override
    public Value visitFuncaoDesconto(LinguagemFormularioParser.FuncaoDescontoContext ctx) {
        Value perc = this.visit(ctx.percentagem);
        Value valor = this.visit(ctx.valor);

        if (perc != null && valor != null) {
            throw new ParseCancellationException("Não foi possivel fazer a operação");
        } else if (perc == null && valor == null) {
            throw new ParseCancellationException("Não foi possivel fazer a operação");
        } else if (perc != null) {
            return new Value(perc);
        }
        return new Value(valor);
    }


    @Override
    public Value visitFuncaoFerias(LinguagemFormularioParser.FuncaoFeriasContext ctx) {
        Value feriasTotais = this.visit(ctx.feriasT);
        Value diasGozados = this.visit(ctx.diasJG);
        Value diasGozadosPeridoSolicitado = this.visit(ctx.diasGPS);
        int feriasTotais1 = feriasTotais.asInteger();
        int diasGozados1 = diasGozados.asInteger();
        int diasGozadosPeridoSolicitado1 = diasGozadosPeridoSolicitado.asInteger();

        if(diasGozados1+diasGozadosPeridoSolicitado1!=feriasTotais1){
            throw new ParseCancellationException("Os dias totais não são o espectado!");
        }
        return new Value(null);
    }


}

class EvalFormularioListener<T> extends LinguagemFormularioBaseListener<Value> {

    /*@Override
    public void exitContaSoma(LinguagemScriptParser.ContaSomaContext ctx) {
        int right = stack.pop();
        int left = stack.pop();
        int result;

        result = left + right;

        stack.push(result);
    }*/

    /*A STACK TEM COMPORTAMENTO LAST IN FIRST OUT*/
    private final Stack<T> stack = new Stack<T>();

    public T getResult(){
        return stack.peek();
    }

    @Override public void enterVerificarData(LinguagemFormularioParser.VerificarDataContext ctx) {

        Value dataInicio = (Value) stack.push((T) ctx.dataInicio);
        Value dataFim = (Value) stack.push((T)ctx.dataFim);
        Value tempoDeAusencia = (Value) stack.push((T)ctx.ausencia);
        Value justificacao = (Value) stack.push((T)ctx.just);
        Calendar dInicio = gerarDataInput(dataInicio);
        stack.push((T)dInicio);
        Calendar dFim = gerarDataInput(dataFim);
        stack.push((T)dFim);

    }

    @Override public void exitVerificarData(LinguagemFormularioParser.VerificarDataContext ctx) {

        if(stack.pop() == null){
            throw new ParseCancellationException("Não foram enviadas datas válidas para a stack!");
        }

        Calendar dFim = (Calendar) stack.pop();
        Calendar dInicio = (Calendar) stack.pop();
        Value justificacao = (Value) stack.pop();
        Value tempoDeAusencia = (Value) stack.pop();
        Value dataFim = (Value) stack.pop();
        Value dataInicio = (Value) stack.pop();

        if (dInicio.compareTo(dFim) > 0) {
            throw new ParseCancellationException("Não foi possivel fazer a operação");
        }

        if (tempoDeAusencia.toString().equalsIgnoreCase("Justificada") && justificacao == null) {
            throw new ParseCancellationException("Não foi possivel fazer a operação");
        }

        System.out.println(dataInicio + "-" + dataFim);

    }

    @Override public void enterVerificarDataSemJust(LinguagemFormularioParser.VerificarDataSemJustContext ctx) {

        Value dataInicio = (Value) stack.push((T) ctx.dataInicio);
        Value dataFim = (Value) stack.push((T) ctx.dataFim);
        Calendar dInicio = gerarDataInput(dataInicio);
        stack.push((T)dInicio);
        Calendar dFim = gerarDataInput(dataFim);
        stack.push((T)dFim);

    }

    @Override public void exitVerificarDataSemJust(LinguagemFormularioParser.VerificarDataSemJustContext ctx) {

        if(stack.pop() == null){
            throw new ParseCancellationException("Não foram enviadas datas válidas para a stack!");
        }

        Calendar dFim = (Calendar) stack.pop();
        Calendar dInicio = (Calendar) stack.pop();
        Value dataFim = (Value) stack.pop();
        Value dataInicio = (Value) stack.pop();

        if (dInicio.compareTo(dFim) > 0) {
            throw new ParseCancellationException("Não foi possivel fazer a operação");
        }

        System.out.println(dataInicio + "-" + dataFim);

    }

    @Override public void enterFuncaoDesconto(LinguagemFormularioParser.FuncaoDescontoContext ctx) {

        Value perc  = (Value) stack.push((T)ctx.percentagem);
        Value valor = (Value) stack.push((T)ctx.valor);

    }

    @Override public void exitFuncaoDesconto(LinguagemFormularioParser.FuncaoDescontoContext ctx) {

        if(stack.pop() == null){
            throw new ParseCancellationException("Não foram enviados dados válidos para a stack!");
        }

        Value valor = (Value) stack.pop();
        Value perc  = (Value) stack.pop();

        if (perc != null && valor != null) {
            throw new ParseCancellationException("Não foi possivel fazer a operação");
        } else if (perc == null && valor == null) {
            throw new ParseCancellationException("Não foi possivel fazer a operação");
        } else if (perc != null) {
            System.out.println(perc);
        }

        System.out.println(valor.toString());

    }

    public Calendar gerarDataInput(Value value) {
        String[] data = value.toString().split("/");
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(data[2].trim()), Integer.parseInt(data[1].trim()), Integer.parseInt(data[0].trim()));
        return c;
    }

}