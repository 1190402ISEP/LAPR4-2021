
grammar SCRIPT_VALIDACAO_FORMULARIO ;

@parser::header{ // classes a incluir
    import java.util.*;
    import java.lang.*;
    import java.io.*;
}


formulario : nome identificador listaAtributos nomeScript
   ;

nome : WORD+
    ;

identificador : NUMERO
    ;

listaAtributos : atributo listaAtributos
    | atributo
    ;

nomeScript : WORD+
    ;

//atributo -> nomeVariavelAtributo, EtiquetaApresentacao, TipoDadosBase , Expressão Regular, Descrição de Ajuda
atributo : nomeVariavelAtributo etiquetaApresentacao TIPO_DADOS_BASE expressaoRegular descricaoAjuda
    ;

expressaoRegular : WORD+
    ;

nomeVariavelAtributo : WORD+
    ;

etiquetaApresentacao : WORD+
    ;

descricaoAjuda : WORD+
    ;

TIPO_DADOS_BASE: 'INT'
    | 'FLOAT'
    | 'BYTE'
    | 'CHAR'
    | 'DOUBLE'
    | 'STRING'
    | 'BOOLEAN'
    | 'DATE'
    | 'LONG'
    | 'SHORT'
    ;

WORD : ('\u0021'..'\u00FF');
NUMERO: [0-9]+;
WS : [ \t\r\n.,?!"']+ -> skip ; // skip spaces, tabs, newlines