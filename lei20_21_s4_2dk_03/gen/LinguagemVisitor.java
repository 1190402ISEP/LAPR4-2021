// Generated from C:/Users/User/Documents/ConnectSoft/lei20_21_s4_2dk_03/docs/TASKS/UC11-1004#16/Compilacao_Scripts\Linguagem.g4 by ANTLR 4.9.1
 // classes a incluir
    import java.util.*;
    import java.lang.*;
    import java.io.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LinguagemParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LinguagemVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(LinguagemParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LinguagemParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(LinguagemParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(LinguagemParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(LinguagemParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#lista_de_variaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_de_variaveis(LinguagemParser.Lista_de_variaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(LinguagemParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(LinguagemParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(LinguagemParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#palavra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalavra(LinguagemParser.PalavraContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#inteiro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteiro(LinguagemParser.InteiroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(LinguagemParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#caractere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaractere(LinguagemParser.CaractereContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#alfa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlfa(LinguagemParser.AlfaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#alfas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlfas(LinguagemParser.AlfasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#expoente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpoente(LinguagemParser.ExpoenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#contas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContas(LinguagemParser.ContasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#variavel_conta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel_conta(LinguagemParser.Variavel_contaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#conta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConta(LinguagemParser.ContaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#alternativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternativa(LinguagemParser.AlternativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#parenteses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenteses(LinguagemParser.ParentesesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#chavetas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChavetas(LinguagemParser.ChavetasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(LinguagemParser.AContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#comparador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparador(LinguagemParser.ComparadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(LinguagemParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(LinguagemParser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#condicao_andamento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicao_andamento(LinguagemParser.Condicao_andamentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#condicao_incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicao_incremento(LinguagemParser.Condicao_incrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#condicao_decremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicao_decremento(LinguagemParser.Condicao_decrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#forEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEach(LinguagemParser.ForEachContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#inicializacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacao(LinguagemParser.InicializacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#funcoesEspeciais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncoesEspeciais(LinguagemParser.FuncoesEspeciaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#nome_ficheiro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome_ficheiro(LinguagemParser.Nome_ficheiroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#envioEmail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvioEmail(LinguagemParser.EnvioEmailContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#listaDestinatarios}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDestinatarios(LinguagemParser.ListaDestinatariosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#imprimirNoEcra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimirNoEcra(LinguagemParser.ImprimirNoEcraContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#conteudo_a_imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConteudo_a_imprimir(LinguagemParser.Conteudo_a_imprimirContext ctx);
}