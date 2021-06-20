package eapli.base.gramaticas.script.Compilacao_Scripts;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * The interface Linguagem script visitor.
 *
 * @param <T> the type parameter
 */
public interface LinguagemScriptVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit start t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitStart(LinguagemScriptParser.StartContext ctx);

    /**
     * Visit expr t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitExpr(LinguagemScriptParser.ExprContext ctx);

    /**
     * Visit declaracoes t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitDeclaracoes(LinguagemScriptParser.DeclaracoesContext ctx);

    /**
     * Visit declaracao variaveis t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitDeclaracaoVariaveis(LinguagemScriptParser.DeclaracaoVariaveisContext ctx);

    /**
     * Visit tipo t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitTipo(LinguagemScriptParser.TipoContext ctx);

    /**
     * Visit lista de variaveis t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitLista_de_variaveis(LinguagemScriptParser.Lista_de_variaveisContext ctx);

    /**
     * Visit variavel t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitVariavel(LinguagemScriptParser.VariavelContext ctx);

    /**
     * Visit identificador t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitIdentificador(LinguagemScriptParser.IdentificadorContext ctx);

    /**
     * Visit valor t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitValor(LinguagemScriptParser.ValorContext ctx);

    /**
     * Visit string t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitString(LinguagemScriptParser.StringContext ctx);

    /**
     * Visit numeros t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitNumeros(LinguagemScriptParser.NumerosContext ctx);

    /**
     * Visit palavra t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitPalavra(LinguagemScriptParser.PalavraContext ctx);

    /**
     * Visit inteiro t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitInteiro(LinguagemScriptParser.InteiroContext ctx);

    /**
     * Visit real t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitReal(LinguagemScriptParser.RealContext ctx);

    /**
     * Visit caractere t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitCaractere(LinguagemScriptParser.CaractereContext ctx);

    /**
     * Visit alfa t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitAlfa(LinguagemScriptParser.AlfaContext ctx);

    /**
     * Visit alfas t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitAlfas(LinguagemScriptParser.AlfasContext ctx);

    /**
     * Visit potencias t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitPotencias(LinguagemScriptParser.PotenciasContext ctx);

    /**
     * Visit base t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitBase(LinguagemScriptParser.BaseContext ctx);

    /**
     * Visit expoente t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitExpoente(LinguagemScriptParser.ExpoenteContext ctx);

    /**
     * Visit contas t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitContas(LinguagemScriptParser.ContasContext ctx);

    /**
     * Visit variavel conta t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitVariavel_conta(LinguagemScriptParser.Variavel_contaContext ctx);

    /**
     * Visit conta soma t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitContaSoma(LinguagemScriptParser.ContaSomaContext ctx);

    /**
     * Visit conta mul t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitContaMul(LinguagemScriptParser.ContaMulContext ctx);

    /**
     * Visit valor conta t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitValorConta(LinguagemScriptParser.ValorContaContext ctx);

    /**
     * Visit conta sub t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitContaSub(LinguagemScriptParser.ContaSubContext ctx);

    /**
     * Visit conta div t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitContaDiv(LinguagemScriptParser.ContaDivContext ctx);

    /**
     * Visit conta fim intrucao t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitContaFimIntrucao(LinguagemScriptParser.ContaFimIntrucaoContext ctx);

    /**
     * Visit alternativa t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitAlternativa(LinguagemScriptParser.AlternativaContext ctx);

    /**
     * Visit parenteses t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitParenteses(LinguagemScriptParser.ParentesesContext ctx);

    /**
     * Visit comparacao t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitComparacao(LinguagemScriptParser.ComparacaoContext ctx);

    /**
     * Visit comparador t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitComparador(LinguagemScriptParser.ComparadorContext ctx);

    /**
     * Visit ciclo t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitCiclo(LinguagemScriptParser.CicloContext ctx);

    /**
     * Visit forloop t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitForloop(LinguagemScriptParser.ForloopContext ctx);

    /**
     * Visit incremento t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitIncremento(LinguagemScriptParser.IncrementoContext ctx);

    /**
     * Visit decremento t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitDecremento(LinguagemScriptParser.DecrementoContext ctx);

    /**
     * Visit for each t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitForEach(LinguagemScriptParser.ForEachContext ctx);

    /**
     * Visit funcoes especiais t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitFuncoesEspeciais(LinguagemScriptParser.FuncoesEspeciaisContext ctx);

    /**
     * Visit nome ficheiro t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitNome_ficheiro(LinguagemScriptParser.Nome_ficheiroContext ctx);

    /**
     * Visit enviar email t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitEnviarEmail(LinguagemScriptParser.EnviarEmailContext ctx);

    /**
     * Visit lista destinatarios t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitListaDestinatarios(LinguagemScriptParser.ListaDestinatariosContext ctx);

    /**
     * Visit assunto t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitAssunto(LinguagemScriptParser.AssuntoContext ctx);

    /**
     * Visit mensagem t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitMensagem(LinguagemScriptParser.MensagemContext ctx);

    /**
     * Visit palavras t.
     *
     * @param ctx the ctx
     * @return the t
     */
    T visitPalavras(LinguagemScriptParser.PalavrasContext ctx);
}