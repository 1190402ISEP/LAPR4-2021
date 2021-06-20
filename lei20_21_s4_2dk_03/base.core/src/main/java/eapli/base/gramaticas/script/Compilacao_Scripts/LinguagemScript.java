package eapli.base.gramaticas.script.Compilacao_Scripts;

import eapli.base.utils.email.EnvioEmail;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * The type Linguagem script.
 */
public class LinguagemScript {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        LinguagemScriptLexer lexer = null;
        try {
            lexer = new LinguagemScriptLexer(CharStreams.fromFileName("testeScript.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LinguagemScriptParser parser = new LinguagemScriptParser(tokens);
        ParseTree tree = parser.start();
        EvalScriptVisitor eval = new EvalScriptVisitor();
        EvalScriptListener eval2 = new EvalScriptListener();
    }

}

/**
 * The type Eval script visitor.
 */
class EvalScriptVisitor extends LinguagemScriptBaseVisitor<Value> {

    private Map<String, Value> memory = new HashMap<>();
    private Value value = null;

    //declaracoes variaveis

    @Override
    public Value visitDeclaracaoVariaveis(LinguagemScriptParser.DeclaracaoVariaveisContext ctx) {
        Value left = this.visit(ctx.left);
        Value right = this.visit(ctx.right);

        if (!left.isString() || !right.isString())
            throw new ParseCancellationException("Não foi possivel declarar a variável");

        return value;
    }

    //andamentos --inicio

    @Override
    public Value visitIncremento(LinguagemScriptParser.IncrementoContext ctx) {
        Value left = this.visit(ctx.first);
        String andamento1 = ctx.second.getText();
        String andamento2 = ctx.second.getText();

        if (!left.isString() || !andamento1.equals("+") || !andamento2.equals("+"))
            throw new ParseCancellationException("Não foi possivel incrementar");

        return value;
    }

    @Override
    public Value visitDecremento(LinguagemScriptParser.DecrementoContext ctx) {
        Value left = this.visit(ctx.first);
        String andamento1 = ctx.second.getText();
        String andamento2 = ctx.second.getText();

        if (!left.isString() || !andamento1.equals("-") || !andamento2.equals("-"))
            throw new ParseCancellationException("Não foi possivel decrementar");

        return value;
    }

    //andamentos --fim

    //potencias
    @Override
    public Value visitPotencias(LinguagemScriptParser.PotenciasContext ctx) {
        Value left = this.visit(ctx.left);
        Value right = this.visit(ctx.right);

        if (left.isString() || right.isString())
            throw new ParseCancellationException("Não foi possivel fazer a operação");

        return new Value(Math.pow(left.asDouble(), right.asDouble()));
    }

    //comparacao
    @Override
    public Value visitComparacao(LinguagemScriptParser.ComparacaoContext ctx) {

        Value left = this.visit(ctx.left);
        Value right = this.visit(ctx.right);

        if (left.isString() || right.isString())
            throw new ParseCancellationException("Não foi possivel fazer a operação");

        switch (ctx.comparador().getRuleIndex()) {
            case LinguagemScriptParser.MENOR:
                return new Value(left.asDouble() < right.asDouble());
            case LinguagemScriptParser.MENOR_IGUAL:
                return new Value(left.asDouble() <= right.asDouble());
            case LinguagemScriptParser.MAIOR:
                return new Value(left.asDouble() > right.asDouble());
            case LinguagemScriptParser.MAIOR_IGUAL:
                return new Value(left.asDouble() >= right.asDouble());
            case LinguagemScriptParser.IGUAL:
                return new Value(left.asDouble() == right.asDouble());
            case LinguagemScriptParser.DIFERENTE:
                return new Value(left.asDouble() != right.asDouble());
            default:
                throw new ParseCancellationException("Operação não reconhecida");
        }
    }

    //nome ficheiro
    @Override
    public Value visitNome_ficheiro(LinguagemScriptParser.Nome_ficheiroContext ctx) {
        String nome = ctx.palavra().getText();
        Value extensao = new Value(ctx.EXTENSAO().getText().replaceAll("\"", ""));
        return memory.put(nome, extensao);
    }

    //as funcoes das contas --inicio

    @Override
    public Value visitContaMul(LinguagemScriptParser.ContaMulContext ctx) {
        Value left = this.visit(ctx.left);
        Value right = this.visit(ctx.right);

        if (left.isString() || right.isString())
            throw new ParseCancellationException("Não foi possivel fazer a operação");

        return new Value(left.asDouble() * right.asDouble());

    }

    @Override
    public Value visitContaDiv(LinguagemScriptParser.ContaDivContext ctx) {
        Value left = this.visit(ctx.left);
        Value right = this.visit(ctx.right);

        if (left.isString() || right.isString())
            throw new ParseCancellationException("Não foi possivel fazer a operação");

        return new Value(left.asDouble() / right.asDouble());

    }

    @Override
    public Value visitContaSoma(LinguagemScriptParser.ContaSomaContext ctx) {
        Value left = this.visit(ctx.left);
        Value right = this.visit(ctx.right);

        if (left.isDouble() && right.isDouble())
            return new Value(left.asDouble() + right.asDouble());

        if (left.isInteger() && right.isInteger())
            return new Value(left.asInteger() + right.asInteger());

        if (left.isString() || right.isString())
            return new Value(left.asString() + right.asString());

        throw new ParseCancellationException("Não foi possivel fazer a operação");

    }

    @Override
    public Value visitContaSub(LinguagemScriptParser.ContaSubContext ctx) {
        Value left = this.visit(ctx.left);
        Value right = this.visit(ctx.right);

        if (left.isDouble() && right.isDouble())
            return new Value(left.asDouble() - right.asDouble());

        if (left.isInteger() && right.isInteger())
            return new Value(left.asInteger() - right.asInteger());

        if (left.isString() || right.isString())
            throw new ParseCancellationException("Não foi possivel fazer a operação");

        throw new ParseCancellationException("Operação não reconhecida");

    }

    //as funcoes das contas --fim

    //as funcoes do email--inicio

    @Override
    public Value visitEnviarEmail(LinguagemScriptParser.EnviarEmailContext ctx) {
        Value emailDestino = this.visit(ctx.left);
        String email = emailDestino.toString();
        String assunto = this.visit(ctx.middle).asString().replaceAll("\"", "");
        String mensagem = this.visit(ctx.right).asString().replaceAll("\"", "");
        EnvioEmail.enviarMail(assunto, mensagem, email); //como temos no projeto
        return value;
    }

    //as funcoes do email--fim

}

/**
 * The type Eval script listener.
 */
class EvalScriptListener extends LinguagemScriptBaseListener {

    private final Stack<Value> stack = new Stack<>();

    @Override
    public void enterValor(LinguagemScriptParser.ValorContext ctx) {

        Value value1 = stack.pop();

        if (value1.isInteger() || value1.isString()) {//value1
            stack.push(value1);

        }
    }

    //as funcoes das contas --inicio

    @Override
    public void exitContaSoma(LinguagemScriptParser.ContaSomaContext ctx) {
        Value right = stack.pop();
        Value left = stack.pop();

        int result;

        result = left.asInteger() + right.asInteger();

        stack.push(new Value(result));
    }

    @Override
    public void exitContaSub(LinguagemScriptParser.ContaSubContext ctx) {
        Value right = stack.pop();
        Value left = stack.pop();

        int result;

        result = left.asInteger() - right.asInteger();

        stack.push(new Value(result));
    }

    @Override
    public void exitContaDiv(LinguagemScriptParser.ContaDivContext ctx) {
        Value right = stack.pop();
        Value left = stack.pop();

        int result;

        result = left.asInteger() / right.asInteger();

        stack.push(new Value(result));
    }

    @Override
    public void exitContaMul(LinguagemScriptParser.ContaMulContext ctx) {
        Value right = stack.pop();
        Value left = stack.pop();

        int result;

        result = left.asInteger() * right.asInteger();

        stack.push(new Value(result));
    }

    //as funcoes das contas --fim

    //as funcoes do email--inicio

    @Override
    public void exitEnviarEmail(LinguagemScriptParser.EnviarEmailContext ctx) {

        Value mensagem1 = stack.pop();
        Value assunto1 = stack.pop();
        Value email1 = stack.pop();
        String mensagem = mensagem1.asString();
        String assunto = assunto1.asString();
        String email = email1.asString();

        EnvioEmail.enviarMail(assunto, mensagem, email);
    }
    //as funcoes do email--fim

    //andamentos --inicio

    @Override
    public void exitIncremento(LinguagemScriptParser.IncrementoContext ctx) {
        Value first = stack.pop();
        int result = first.asInteger();

        result = result + 1;

        stack.push(new Value(result));
    }

    @Override
    public void exitDecremento(LinguagemScriptParser.DecrementoContext ctx) {
        Value first = stack.pop();
        int result = first.asInteger();

        result = result - 1;

        stack.push(new Value(result));
    }

    //andamentos --fim

    //potencias
    @Override
    public void exitPotencias(LinguagemScriptParser.PotenciasContext ctx) {
        Value right1 = stack.pop();
        int right = right1.asInteger();
        Value left1 = stack.pop();
        int left = left1.asInteger();

        int result;

        result = (int) Math.round(Math.pow(left, right));

        stack.push(new Value(result));
    }

    //declaracao de variaveis

    @Override
    public void enterDeclaracaoVariaveis(LinguagemScriptParser.DeclaracaoVariaveisContext ctx) {
        Value left1 = stack.pop();
        Value right1 = stack.pop();

        String left = left1.asString();
        String right = right1.asString();

        if (left1.isInteger() || right1.isInteger())
            throw new ParseCancellationException("Não foi possivel declarar a variável");

        if (left1.isDouble() || right1.isDouble())
            throw new ParseCancellationException("Não foi possivel declarar a variável");

        if (left1.isElemento() || right1.isElemento())
            throw new ParseCancellationException("Não foi possivel declarar a variável");

    }

    //comparacao

    @Override
    public void exitComparacao(LinguagemScriptParser.ComparacaoContext ctx) {
        Value left = stack.pop();
        Value right = stack.pop();

        if (left.isString())
            throw new ParseCancellationException("Não foi possivel fazer a operação");
        if (right.isString())
            throw new ParseCancellationException("Não foi possivel fazer a operação");

        switch (ctx.comparador().getRuleIndex()) {
            case LinguagemScriptParser.MENOR:
                stack.push(new Value(left.asDouble() < right.asDouble()));
            case LinguagemScriptParser.MENOR_IGUAL:
                stack.push(new Value(left.asDouble() <= right.asDouble()));
            case LinguagemScriptParser.MAIOR:
                stack.push(new Value(left.asDouble() > right.asDouble()));
            case LinguagemScriptParser.MAIOR_IGUAL:
                stack.push(new Value(left.asDouble() >= right.asDouble()));
            case LinguagemScriptParser.IGUAL:
                stack.push(new Value(left.asDouble() == right.asDouble()));
            case LinguagemScriptParser.DIFERENTE:
                stack.push(new Value(left.asDouble() != right.asDouble()));
            default:
                throw new ParseCancellationException("Operação não reconhecida");
        }
    }

    //nome ficheiro

    @Override
    public void enterNome_ficheiro(LinguagemScriptParser.Nome_ficheiroContext ctx) {
        Value extensao = stack.pop();
        Value nome = stack.pop();

        if (extensao.toString() != "XML" && extensao.toString() != "CSV")
            throw new ParseCancellationException("Esta extensao não é possivel");

        if (!nome.isString())
            throw new ParseCancellationException("Este nome não é possivel");

    }
}

