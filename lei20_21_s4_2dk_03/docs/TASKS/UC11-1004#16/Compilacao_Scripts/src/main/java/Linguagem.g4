grammar Linguagem ;


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
    | declaracoes
    | contas
    | ciclo
    | alternativa
    | condicao_andamento FIM_INSTRUCAO
    ;

declaracoes : declaracao declaracoes
    |
    ;

declaracao  : tipo lista_de_variaveis FIM_INSTRUCAO
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

valor : palavra
    | identificador
    | inteiro
    | caractere
    | real
    | LETRA
    ;

palavra : ASPAS LETRA+ ASPAS;

LETRA: [a-zA-Z]
    ;

DIGITO  : [0-9]
    ;

inteiro : DIGITO inteiro
    |DIGITO
    ;

real : inteiro PONTO_FINAL inteiro
    | inteiro PONTO_FINAL inteiro expoente
    | inteiro expoente
    ;

caractere : PELICA LETRA PELICA
    ;

alfa : LETRA
    | DIGITO
    ;

alfas : alfa alfas
    | alfa
    ;

expoente : EXPO inteiro
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

conta : left=conta op=SOMA right=conta
    | left=conta op=SUBTRACAO right=conta
    | left=conta op=DIVISAO right=conta
    | left=conta op=MULTIPLICACAO right=conta
    | valor
    | FIM_INSTRUCAO
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

chavetas:   '{'
    |   '}'
    ;


IF : 'if';
ELSE : 'else';
THEN : 'then';
ENDIF : 'endif';

a: valor comparador valor
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

forloop: FOR parenteses variavel inicializacao FIM_INSTRUCAO variavel comparador valor FIM_INSTRUCAO condicao_andamento parenteses NEWLINE expr NEWLINE ENDFOR
    ;

condicao_andamento: condicao_incremento
    |condicao_decremento
    ;

condicao_incremento: variavel IGUAL variavel SOMA variavel
    | variavel SOMA SOMA
    |variavel IGUAL_ESPACO variavel SOMA variavel
    ;

condicao_decremento: variavel IGUAL variavel SUBTRACAO variavel
    | variavel SUBTRACAO SUBTRACAO
    |variavel IGUAL_ESPACO variavel SUBTRACAO variavel
    ;

FOR:'for'
    ;

ENDFOR: 'endfor';

forEach: FOR parenteses COLECAO VAZIO variavel ' : ' variavel parenteses NEWLINE expr NEWLINE ENDFOR
    ;


inicializacao:'=' inteiro
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
    |imprimirNoEcra
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
envioEmail:listaDestinatarios ASSUNTO MENSAGEM
    ;
listaDestinatarios: EMAIL
    |EMAIL NEWLINE listaDestinatarios
    ;

EMAIL: [a-z0-9._%+-]+'@'[a-z0-9.-]+'.'[a-z]+ /*verificar*/
    ;
ASSUNTO : [a-zA-Z0-9]{1,15}
    ;
MENSAGEM : [a-zA-Z0-9]{1,300}
    ;

/*Fim Envio de Email*/


/*imprimir na consola*/
imprimirNoEcra  : 'PRINT' conteudo_a_imprimir
    ;
conteudo_a_imprimir : ;
/*fim imprimir na consola*/


/*Fim Funcoes Especiais*/
