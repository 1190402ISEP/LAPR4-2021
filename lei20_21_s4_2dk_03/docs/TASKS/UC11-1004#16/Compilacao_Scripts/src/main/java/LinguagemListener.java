// Generated from E:/Nova pasta/LPROG/src/main/java\Linguagem.g4 by ANTLR 4.9.1
 // classes a incluir
    import java.util.*;
    import java.lang.*;
    import java.io.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LinguagemParser}.
 */
public interface LinguagemListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(LinguagemParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(LinguagemParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LinguagemParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LinguagemParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(LinguagemParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(LinguagemParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(LinguagemParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(LinguagemParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(LinguagemParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(LinguagemParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#lista_de_variaveis}.
	 * @param ctx the parse tree
	 */
	void enterLista_de_variaveis(LinguagemParser.Lista_de_variaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#lista_de_variaveis}.
	 * @param ctx the parse tree
	 */
	void exitLista_de_variaveis(LinguagemParser.Lista_de_variaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(LinguagemParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(LinguagemParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(LinguagemParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(LinguagemParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(LinguagemParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(LinguagemParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#palavra}.
	 * @param ctx the parse tree
	 */
	void enterPalavra(LinguagemParser.PalavraContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#palavra}.
	 * @param ctx the parse tree
	 */
	void exitPalavra(LinguagemParser.PalavraContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#inteiro}.
	 * @param ctx the parse tree
	 */
	void enterInteiro(LinguagemParser.InteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#inteiro}.
	 * @param ctx the parse tree
	 */
	void exitInteiro(LinguagemParser.InteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(LinguagemParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(LinguagemParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#caractere}.
	 * @param ctx the parse tree
	 */
	void enterCaractere(LinguagemParser.CaractereContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#caractere}.
	 * @param ctx the parse tree
	 */
	void exitCaractere(LinguagemParser.CaractereContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#alfa}.
	 * @param ctx the parse tree
	 */
	void enterAlfa(LinguagemParser.AlfaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#alfa}.
	 * @param ctx the parse tree
	 */
	void exitAlfa(LinguagemParser.AlfaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#alfas}.
	 * @param ctx the parse tree
	 */
	void enterAlfas(LinguagemParser.AlfasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#alfas}.
	 * @param ctx the parse tree
	 */
	void exitAlfas(LinguagemParser.AlfasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#expoente}.
	 * @param ctx the parse tree
	 */
	void enterExpoente(LinguagemParser.ExpoenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#expoente}.
	 * @param ctx the parse tree
	 */
	void exitExpoente(LinguagemParser.ExpoenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#contas}.
	 * @param ctx the parse tree
	 */
	void enterContas(LinguagemParser.ContasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#contas}.
	 * @param ctx the parse tree
	 */
	void exitContas(LinguagemParser.ContasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#variavel_conta}.
	 * @param ctx the parse tree
	 */
	void enterVariavel_conta(LinguagemParser.Variavel_contaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#variavel_conta}.
	 * @param ctx the parse tree
	 */
	void exitVariavel_conta(LinguagemParser.Variavel_contaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#conta}.
	 * @param ctx the parse tree
	 */
	void enterConta(LinguagemParser.ContaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#conta}.
	 * @param ctx the parse tree
	 */
	void exitConta(LinguagemParser.ContaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#alternativa}.
	 * @param ctx the parse tree
	 */
	void enterAlternativa(LinguagemParser.AlternativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#alternativa}.
	 * @param ctx the parse tree
	 */
	void exitAlternativa(LinguagemParser.AlternativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#parenteses}.
	 * @param ctx the parse tree
	 */
	void enterParenteses(LinguagemParser.ParentesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#parenteses}.
	 * @param ctx the parse tree
	 */
	void exitParenteses(LinguagemParser.ParentesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#chavetas}.
	 * @param ctx the parse tree
	 */
	void enterChavetas(LinguagemParser.ChavetasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#chavetas}.
	 * @param ctx the parse tree
	 */
	void exitChavetas(LinguagemParser.ChavetasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(LinguagemParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(LinguagemParser.AContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#comparador}.
	 * @param ctx the parse tree
	 */
	void enterComparador(LinguagemParser.ComparadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#comparador}.
	 * @param ctx the parse tree
	 */
	void exitComparador(LinguagemParser.ComparadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void enterCiclo(LinguagemParser.CicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void exitCiclo(LinguagemParser.CicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(LinguagemParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(LinguagemParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#condicao_andamento}.
	 * @param ctx the parse tree
	 */
	void enterCondicao_andamento(LinguagemParser.Condicao_andamentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#condicao_andamento}.
	 * @param ctx the parse tree
	 */
	void exitCondicao_andamento(LinguagemParser.Condicao_andamentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#condicao_incremento}.
	 * @param ctx the parse tree
	 */
	void enterCondicao_incremento(LinguagemParser.Condicao_incrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#condicao_incremento}.
	 * @param ctx the parse tree
	 */
	void exitCondicao_incremento(LinguagemParser.Condicao_incrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#condicao_decremento}.
	 * @param ctx the parse tree
	 */
	void enterCondicao_decremento(LinguagemParser.Condicao_decrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#condicao_decremento}.
	 * @param ctx the parse tree
	 */
	void exitCondicao_decremento(LinguagemParser.Condicao_decrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#forEach}.
	 * @param ctx the parse tree
	 */
	void enterForEach(LinguagemParser.ForEachContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#forEach}.
	 * @param ctx the parse tree
	 */
	void exitForEach(LinguagemParser.ForEachContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#inicializacao}.
	 * @param ctx the parse tree
	 */
	void enterInicializacao(LinguagemParser.InicializacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#inicializacao}.
	 * @param ctx the parse tree
	 */
	void exitInicializacao(LinguagemParser.InicializacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#funcoesEspeciais}.
	 * @param ctx the parse tree
	 */
	void enterFuncoesEspeciais(LinguagemParser.FuncoesEspeciaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#funcoesEspeciais}.
	 * @param ctx the parse tree
	 */
	void exitFuncoesEspeciais(LinguagemParser.FuncoesEspeciaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#nome_ficheiro}.
	 * @param ctx the parse tree
	 */
	void enterNome_ficheiro(LinguagemParser.Nome_ficheiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#nome_ficheiro}.
	 * @param ctx the parse tree
	 */
	void exitNome_ficheiro(LinguagemParser.Nome_ficheiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#envioEmail}.
	 * @param ctx the parse tree
	 */
	void enterEnvioEmail(LinguagemParser.EnvioEmailContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#envioEmail}.
	 * @param ctx the parse tree
	 */
	void exitEnvioEmail(LinguagemParser.EnvioEmailContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#listaDestinatarios}.
	 * @param ctx the parse tree
	 */
	void enterListaDestinatarios(LinguagemParser.ListaDestinatariosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#listaDestinatarios}.
	 * @param ctx the parse tree
	 */
	void exitListaDestinatarios(LinguagemParser.ListaDestinatariosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#imprimirNoEcra}.
	 * @param ctx the parse tree
	 */
	void enterImprimirNoEcra(LinguagemParser.ImprimirNoEcraContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#imprimirNoEcra}.
	 * @param ctx the parse tree
	 */
	void exitImprimirNoEcra(LinguagemParser.ImprimirNoEcraContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#conteudo_a_imprimir}.
	 * @param ctx the parse tree
	 */
	void enterConteudo_a_imprimir(LinguagemParser.Conteudo_a_imprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#conteudo_a_imprimir}.
	 * @param ctx the parse tree
	 */
	void exitConteudo_a_imprimir(LinguagemParser.Conteudo_a_imprimirContext ctx);
}