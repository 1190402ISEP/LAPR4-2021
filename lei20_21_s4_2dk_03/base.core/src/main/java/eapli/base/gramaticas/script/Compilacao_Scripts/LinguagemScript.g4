grammar LinguagemScript ;

@parser::header { // classes a incluir
    import java.util.*;
    import java.lang.*;
    import java.io.*;
}

@parser::members {

}

/*Declaração de variáveis */

start : expr EOF
    |   expr NEWLINE EOF;

expr : declaracoes NEWLINE expr
    | contas NEWLINE expr
    | ciclo NEWLINE expr
    | alternativa NEWLINE expr
    | condicao_andamento FIM_INSTRUCAO NEWLINE expr
    | declaracoes
    | contas
    | ciclo
    | alternativa
    | condicao_andamento FIM_INSTRUCAO
    ;

declaracoes : declaracao declaracoes
    |
    ;

declaracao  : left=tipo right=lista_de_variaveis FIM_INSTRUCAO # declaracaoVariaveis
    ;

tipo    : MODIFICADOR TIPO
    |TIPO
    ;

MODIFICADOR : 'curto '
    | 'longo'
    | 'sem_sinal'
    ;

TIPO   : 'inteiro '
    | 'caracter '
    | 'real_float '
    | 'real '
    | 'String '
    ;

lista_de_variaveis  : variavel VIRGULA lista_de_variaveis
    | variavel
;

variavel : identificador
    | identificador IGUAL valor
    | identificador IGUAL identificador
    | LETRA
    | LETRA IGUAL valor
    | LETRA IGUAL identificador
    | identificador IGUAL_ESPACO valor
    | identificador IGUAL_ESPACO identificador
    | LETRA IGUAL_ESPACO valor
    | LETRA IGUAL_ESPACO identificador
    ;

identificador : LETRA alfas
    ;

valor : string
 | numeros
 ;

string: palavra
    | identificador
    | caractere
    | LETRA
    ;

numeros: inteiro
    | real
    ;

palavra : ASPAS LETRA+ ASPAS;

LETRA: [a-zA-Z]
    ;

DIGITO: [0-9]
    ;

inteiro : DIGITO inteiro
    |DIGITO
    ;

real : inteiro PONTO_FINAL inteiro
    | potencia
    ;

caractere : PELICA LETRA PELICA
    ;

alfa : LETRA
    | DIGITO
    ;

alfas : alfa alfas
    | alfa
    ;

potencia : left=base right=expoente # potencias
    ;

base : inteiro
    | inteiro PONTO_FINAL inteiro
    ;

expoente : inteiro
    ;

/*FIM declaração de variáveis */

NEWLINE : '\n'
    ;

ASPAS   : '"'
    ;

PELICA : '\''
    ;

EXPO : 'e-'
    | 'e+'
    ;

IGUAL :'='

    ;
IGUAL_ESPACO  :' ='
    |'= '
    |' = '
    ;

VIRGULA : ','
    ;

PONTO_FINAL : '.'
    ;

FIM_INSTRUCAO   :';'
    ;

VAZIO   :' '
    ;

DOIS_PONTOS: ':'
    |   ' : '
    |   ': '
    |   ' :'
    ;

/*Cálculos*/
contas : variavel_conta conta;

variavel_conta : identificador IGUAL conta
    | LETRA IGUAL conta
    |identificador IGUAL_ESPACO conta
    | LETRA IGUAL_ESPACO conta
    ;

conta : left=conta op=SOMA right=conta # contaSoma
    | left=conta op=SUBTRACAO right=conta # contaSub
    | left=conta op=DIVISAO right=conta # contaDiv
    | left=conta op=MULTIPLICACAO right=conta # contaMul
    | valor # valorConta
    | FIM_INSTRUCAO # contaFimIntrucao
    ;

SOMA : '+'
    |'+ '
    |' +'
    |' + '
    ;

SUBTRACAO : '-'
    |'- '
    |' -'
    |' - '
    ;

MULTIPLICACAO : '*'
    |'* '
    |' *'
    |' * '
    ;

DIVISAO : '/'
    |'/ '
    |' /'
    |' / '
    ;
/*Fim Cálculos*/

/*Ciclos*/

alternativa:IF parenteses a parenteses VAZIO THEN NEWLINE expr NEWLINE ENDIF
    |   IF parenteses a parenteses NEWLINE THEN expr NEWLINE ENDIF
    |   IF parenteses a parenteses THEN expr NEWLINE ELSE alternativa
    |   IF parenteses a parenteses THEN expr VAZIO ELSE alternativa
    |   IF parenteses a parenteses NEWLINE THEN expr NEWLINE ELSE expr NEWLINE ENDIF
    |   IF parenteses a parenteses VAZIO THEN expr NEWLINE ELSE expr NEWLINE ENDIF
    ;

parenteses: '('
        | ')'
        | '['
        | ']'
        ;

IF : 'if';
ELSE : 'else';
THEN : 'then';
ENDIF : 'endif';

a: left=valor op=comparador right=valor # comparacao
    ;

/*Comparações*/
comparador: MAIOR
    | IGUAL
    | MENOR
    | MAIOR_IGUAL
    | MENOR_IGUAL
    | DIFERENTE
    ;

MAIOR  : '>'
    ;
MENOR: '<'
    ;
MENOR_IGUAL:'=<'
    ;
MAIOR_IGUAL:  '=>'
    ;
DIFERENTE   :  '!='
    ;

/*Fim Comparações*/

//For
ciclo:  forloop
    |   forEach
    ;

forloop: FOR parenteses variavel '=' inteiro FIM_INSTRUCAO variavel comparador valor FIM_INSTRUCAO condicao_andamento parenteses NEWLINE expr NEWLINE ENDFOR
    ;

condicao_andamento: first=variavel second=SOMA third=SOMA # incremento
    | first=variavel second=SUBTRACAO third=SUBTRACAO # decremento
    ;

FOR:'for'
    ;

ENDFOR: 'endfor';

forEach: FOR parenteses COLECAO VAZIO variavel ' : ' variavel parenteses NEWLINE expr NEWLINE ENDFOR
    ;

COLECAO : 'Colaborador'
        | 'Equipa'
        | 'TipoEquipa'
        | 'Servico'
        | 'Formulario'
        | 'AtividadeManual'
        | 'AtividadeAutomatica'
        | 'Pedido'
        | 'Catalogo'
        ;

/*Fim Ciclos*/

/*Funcoes Especiais*/

/*Ler Ficheiro*/
funcoesEspeciais:LER_FICHEIRO '('nome_ficheiro ')'
    |envioEmail
    ;

LER_FICHEIRO: 'lerficheiro'
    ;
nome_ficheiro: palavra'.'EXTENSAO
    ;

EXTENSAO: 'CSV'
    | 'XML'
    ;
/*Fim Ler Ficheiro*/

/*Envio de Email*/
envioEmail:left=listaDestinatarios NEWLINE middle=assunto NEWLINE right=mensagem # enviarEmail
    ;
listaDestinatarios: EMAIL
    |EMAIL NEWLINE listaDestinatarios
    ;

assunto: 'Assunto: ' palavras;

mensagem: 'Mensagem: ' palavras;

EMAIL: [a-z0-9._%+-]+'@'[a-z0-9.-]+'.'[a-z]+ /*verificar*/
    ;
palavras: palavra VAZIO palavras
    | palavra;

/*Fim Envio de Email*/

/*Fim Funcoes Especiais*/
