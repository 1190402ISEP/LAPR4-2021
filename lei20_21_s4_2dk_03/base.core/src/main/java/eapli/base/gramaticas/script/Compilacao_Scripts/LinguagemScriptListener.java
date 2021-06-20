package eapli.base.gramaticas.script.Compilacao_Scripts;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * The interface Linguagem script listener.
 */
public interface LinguagemScriptListener extends ParseTreeListener {
    /**
     * Enter start.
     *
     * @param ctx the ctx
     */
    void enterStart(LinguagemScriptParser.StartContext ctx);

    /**
     * Exit start.
     *
     * @param ctx the ctx
     */
    void exitStart(LinguagemScriptParser.StartContext ctx);

    /**
     * Enter expr.
     *
     * @param ctx the ctx
     */
    void enterExpr(LinguagemScriptParser.ExprContext ctx);

    /**
     * Exit expr.
     *
     * @param ctx the ctx
     */
    void exitExpr(LinguagemScriptParser.ExprContext ctx);

    /**
     * Enter declaracoes.
     *
     * @param ctx the ctx
     */
    void enterDeclaracoes(LinguagemScriptParser.DeclaracoesContext ctx);

    /**
     * Exit declaracoes.
     *
     * @param ctx the ctx
     */
    void exitDeclaracoes(LinguagemScriptParser.DeclaracoesContext ctx);

    /**
     * Enter declaracao variaveis.
     *
     * @param ctx the ctx
     */
    void enterDeclaracaoVariaveis(LinguagemScriptParser.DeclaracaoVariaveisContext ctx);

    /**
     * Exit declaracao variaveis.
     *
     * @param ctx the ctx
     */
    void exitDeclaracaoVariaveis(LinguagemScriptParser.DeclaracaoVariaveisContext ctx);

    /**
     * Enter tipo.
     *
     * @param ctx the ctx
     */
    void enterTipo(LinguagemScriptParser.TipoContext ctx);

    /**
     * Exit tipo.
     *
     * @param ctx the ctx
     */
    void exitTipo(LinguagemScriptParser.TipoContext ctx);

    /**
     * Enter lista de variaveis.
     *
     * @param ctx the ctx
     */
    void enterLista_de_variaveis(LinguagemScriptParser.Lista_de_variaveisContext ctx);

    /**
     * Exit lista de variaveis.
     *
     * @param ctx the ctx
     */
    void exitLista_de_variaveis(LinguagemScriptParser.Lista_de_variaveisContext ctx);

    /**
     * Enter variavel.
     *
     * @param ctx the ctx
     */
    void enterVariavel(LinguagemScriptParser.VariavelContext ctx);

    /**
     * Exit variavel.
     *
     * @param ctx the ctx
     */
    void exitVariavel(LinguagemScriptParser.VariavelContext ctx);

    /**
     * Enter identificador.
     *
     * @param ctx the ctx
     */
    void enterIdentificador(LinguagemScriptParser.IdentificadorContext ctx);

    /**
     * Exit identificador.
     *
     * @param ctx the ctx
     */
    void exitIdentificador(LinguagemScriptParser.IdentificadorContext ctx);

    /**
     * Enter valor.
     *
     * @param ctx the ctx
     */
    void enterValor(LinguagemScriptParser.ValorContext ctx);

    /**
     * Exit valor.
     *
     * @param ctx the ctx
     */
    void exitValor(LinguagemScriptParser.ValorContext ctx);

    /**
     * Enter string.
     *
     * @param ctx the ctx
     */
    void enterString(LinguagemScriptParser.StringContext ctx);

    /**
     * Exit string.
     *
     * @param ctx the ctx
     */
    void exitString(LinguagemScriptParser.StringContext ctx);

    /**
     * Enter numeros.
     *
     * @param ctx the ctx
     */
    void enterNumeros(LinguagemScriptParser.NumerosContext ctx);

    /**
     * Exit numeros.
     *
     * @param ctx the ctx
     */
    void exitNumeros(LinguagemScriptParser.NumerosContext ctx);

    /**
     * Enter palavra.
     *
     * @param ctx the ctx
     */
    void enterPalavra(LinguagemScriptParser.PalavraContext ctx);

    /**
     * Exit palavra.
     *
     * @param ctx the ctx
     */
    void exitPalavra(LinguagemScriptParser.PalavraContext ctx);

    /**
     * Enter inteiro.
     *
     * @param ctx the ctx
     */
    void enterInteiro(LinguagemScriptParser.InteiroContext ctx);

    /**
     * Exit inteiro.
     *
     * @param ctx the ctx
     */
    void exitInteiro(LinguagemScriptParser.InteiroContext ctx);

    /**
     * Enter real.
     *
     * @param ctx the ctx
     */
    void enterReal(LinguagemScriptParser.RealContext ctx);

    /**
     * Exit real.
     *
     * @param ctx the ctx
     */
    void exitReal(LinguagemScriptParser.RealContext ctx);

    /**
     * Enter caractere.
     *
     * @param ctx the ctx
     */
    void enterCaractere(LinguagemScriptParser.CaractereContext ctx);

    /**
     * Exit caractere.
     *
     * @param ctx the ctx
     */
    void exitCaractere(LinguagemScriptParser.CaractereContext ctx);

    /**
     * Enter alfa.
     *
     * @param ctx the ctx
     */
    void enterAlfa(LinguagemScriptParser.AlfaContext ctx);

    /**
     * Exit alfa.
     *
     * @param ctx the ctx
     */
    void exitAlfa(LinguagemScriptParser.AlfaContext ctx);

    /**
     * Enter alfas.
     *
     * @param ctx the ctx
     */
    void enterAlfas(LinguagemScriptParser.AlfasContext ctx);

    /**
     * Exit alfas.
     *
     * @param ctx the ctx
     */
    void exitAlfas(LinguagemScriptParser.AlfasContext ctx);

    /**
     * Enter potencias.
     *
     * @param ctx the ctx
     */
    void enterPotencias(LinguagemScriptParser.PotenciasContext ctx);

    /**
     * Exit potencias.
     *
     * @param ctx the ctx
     */
    void exitPotencias(LinguagemScriptParser.PotenciasContext ctx);

    /**
     * Enter base.
     *
     * @param ctx the ctx
     */
    void enterBase(LinguagemScriptParser.BaseContext ctx);

    /**
     * Exit base.
     *
     * @param ctx the ctx
     */
    void exitBase(LinguagemScriptParser.BaseContext ctx);

    /**
     * Enter expoente.
     *
     * @param ctx the ctx
     */
    void enterExpoente(LinguagemScriptParser.ExpoenteContext ctx);

    /**
     * Exit expoente.
     *
     * @param ctx the ctx
     */
    void exitExpoente(LinguagemScriptParser.ExpoenteContext ctx);

    /**
     * Enter contas.
     *
     * @param ctx the ctx
     */
    void enterContas(LinguagemScriptParser.ContasContext ctx);

    /**
     * Exit contas.
     *
     * @param ctx the ctx
     */
    void exitContas(LinguagemScriptParser.ContasContext ctx);

    /**
     * Enter variavel conta.
     *
     * @param ctx the ctx
     */
    void enterVariavel_conta(LinguagemScriptParser.Variavel_contaContext ctx);

    /**
     * Exit variavel conta.
     *
     * @param ctx the ctx
     */
    void exitVariavel_conta(LinguagemScriptParser.Variavel_contaContext ctx);

    /**
     * Enter conta soma.
     *
     * @param ctx the ctx
     */
    void enterContaSoma(LinguagemScriptParser.ContaSomaContext ctx);

    /**
     * Exit conta soma.
     *
     * @param ctx the ctx
     */
    void exitContaSoma(LinguagemScriptParser.ContaSomaContext ctx);

    /**
     * Enter conta mul.
     *
     * @param ctx the ctx
     */
    void enterContaMul(LinguagemScriptParser.ContaMulContext ctx);

    /**
     * Exit conta mul.
     *
     * @param ctx the ctx
     */
    void exitContaMul(LinguagemScriptParser.ContaMulContext ctx);

    /**
     * Enter valor conta.
     *
     * @param ctx the ctx
     */
    void enterValorConta(LinguagemScriptParser.ValorContaContext ctx);

    /**
     * Exit valor conta.
     *
     * @param ctx the ctx
     */
    void exitValorConta(LinguagemScriptParser.ValorContaContext ctx);

    /**
     * Enter conta sub.
     *
     * @param ctx the ctx
     */
    void enterContaSub(LinguagemScriptParser.ContaSubContext ctx);

    /**
     * Exit conta sub.
     *
     * @param ctx the ctx
     */
    void exitContaSub(LinguagemScriptParser.ContaSubContext ctx);

    /**
     * Enter conta div.
     *
     * @param ctx the ctx
     */
    void enterContaDiv(LinguagemScriptParser.ContaDivContext ctx);

    /**
     * Exit conta div.
     *
     * @param ctx the ctx
     */
    void exitContaDiv(LinguagemScriptParser.ContaDivContext ctx);

    /**
     * Enter conta fim intrucao.
     *
     * @param ctx the ctx
     */
    void enterContaFimIntrucao(LinguagemScriptParser.ContaFimIntrucaoContext ctx);

    /**
     * Exit conta fim intrucao.
     *
     * @param ctx the ctx
     */
    void exitContaFimIntrucao(LinguagemScriptParser.ContaFimIntrucaoContext ctx);

    /**
     * Enter alternativa.
     *
     * @param ctx the ctx
     */
    void enterAlternativa(LinguagemScriptParser.AlternativaContext ctx);

    /**
     * Exit alternativa.
     *
     * @param ctx the ctx
     */
    void exitAlternativa(LinguagemScriptParser.AlternativaContext ctx);

    /**
     * Enter parenteses.
     *
     * @param ctx the ctx
     */
    void enterParenteses(LinguagemScriptParser.ParentesesContext ctx);

    /**
     * Exit parenteses.
     *
     * @param ctx the ctx
     */
    void exitParenteses(LinguagemScriptParser.ParentesesContext ctx);

    /**
     * Enter comparacao.
     *
     * @param ctx the ctx
     */
    void enterComparacao(LinguagemScriptParser.ComparacaoContext ctx);

    /**
     * Exit comparacao.
     *
     * @param ctx the ctx
     */
    void exitComparacao(LinguagemScriptParser.ComparacaoContext ctx);

    /**
     * Enter comparador.
     *
     * @param ctx the ctx
     */
    void enterComparador(LinguagemScriptParser.ComparadorContext ctx);

    /**
     * Exit comparador.
     *
     * @param ctx the ctx
     */
    void exitComparador(LinguagemScriptParser.ComparadorContext ctx);

    /**
     * Enter ciclo.
     *
     * @param ctx the ctx
     */
    void enterCiclo(LinguagemScriptParser.CicloContext ctx);

    /**
     * Exit ciclo.
     *
     * @param ctx the ctx
     */
    void exitCiclo(LinguagemScriptParser.CicloContext ctx);

    /**
     * Enter forloop.
     *
     * @param ctx the ctx
     */
    void enterForloop(LinguagemScriptParser.ForloopContext ctx);

    /**
     * Exit forloop.
     *
     * @param ctx the ctx
     */
    void exitForloop(LinguagemScriptParser.ForloopContext ctx);

    /**
     * Enter incremento.
     *
     * @param ctx the ctx
     */
    void enterIncremento(LinguagemScriptParser.IncrementoContext ctx);

    /**
     * Exit incremento.
     *
     * @param ctx the ctx
     */
    void exitIncremento(LinguagemScriptParser.IncrementoContext ctx);

    /**
     * Enter decremento.
     *
     * @param ctx the ctx
     */
    void enterDecremento(LinguagemScriptParser.DecrementoContext ctx);

    /**
     * Exit decremento.
     *
     * @param ctx the ctx
     */
    void exitDecremento(LinguagemScriptParser.DecrementoContext ctx);

    /**
     * Enter for each.
     *
     * @param ctx the ctx
     */
    void enterForEach(LinguagemScriptParser.ForEachContext ctx);

    /**
     * Exit for each.
     *
     * @param ctx the ctx
     */
    void exitForEach(LinguagemScriptParser.ForEachContext ctx);

    /**
     * Enter funcoes especiais.
     *
     * @param ctx the ctx
     */
    void enterFuncoesEspeciais(LinguagemScriptParser.FuncoesEspeciaisContext ctx);

    /**
     * Exit funcoes especiais.
     *
     * @param ctx the ctx
     */
    void exitFuncoesEspeciais(LinguagemScriptParser.FuncoesEspeciaisContext ctx);

    /**
     * Enter nome ficheiro.
     *
     * @param ctx the ctx
     */
    void enterNome_ficheiro(LinguagemScriptParser.Nome_ficheiroContext ctx);

    /**
     * Exit nome ficheiro.
     *
     * @param ctx the ctx
     */
    void exitNome_ficheiro(LinguagemScriptParser.Nome_ficheiroContext ctx);

    /**
     * Enter enviar email.
     *
     * @param ctx the ctx
     */
    void enterEnviarEmail(LinguagemScriptParser.EnviarEmailContext ctx);

    /**
     * Exit enviar email.
     *
     * @param ctx the ctx
     */
    void exitEnviarEmail(LinguagemScriptParser.EnviarEmailContext ctx);

    /**
     * Enter lista destinatarios.
     *
     * @param ctx the ctx
     */
    void enterListaDestinatarios(LinguagemScriptParser.ListaDestinatariosContext ctx);

    /**
     * Exit lista destinatarios.
     *
     * @param ctx the ctx
     */
    void exitListaDestinatarios(LinguagemScriptParser.ListaDestinatariosContext ctx);

    /**
     * Enter assunto.
     *
     * @param ctx the ctx
     */
    void enterAssunto(LinguagemScriptParser.AssuntoContext ctx);

    /**
     * Exit assunto.
     *
     * @param ctx the ctx
     */
    void exitAssunto(LinguagemScriptParser.AssuntoContext ctx);

    /**
     * Enter mensagem.
     *
     * @param ctx the ctx
     */
    void enterMensagem(LinguagemScriptParser.MensagemContext ctx);

    /**
     * Exit mensagem.
     *
     * @param ctx the ctx
     */
    void exitMensagem(LinguagemScriptParser.MensagemContext ctx);

    /**
     * Enter palavras.
     *
     * @param ctx the ctx
     */
    void enterPalavras(LinguagemScriptParser.PalavrasContext ctx);

    /**
     * Exit palavras.
     *
     * @param ctx the ctx
     */
    void exitPalavras(LinguagemScriptParser.PalavrasContext ctx);
}