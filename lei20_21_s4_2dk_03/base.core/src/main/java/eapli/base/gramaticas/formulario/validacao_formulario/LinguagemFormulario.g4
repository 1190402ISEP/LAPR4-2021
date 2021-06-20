
grammar LinguagemFormulario;

@parser::header{ // classes a incluir
    import java.util.*;
    import java.lang.*;
    import java.io.*;
}

start : formulario EOF
    |   formulario NEWLINE EOF;

formulario : pedido
    | aprovacao
    | realizacao
   ;

/*formulario pedido*/

pedido : pedidoAusencia
    | pedidoDesconto
    | pedidoResidencia
    | pedidoCotacaoVendas
    ;
    /*ausencia*/
pedidoAusencia : dataInicio=data dataFim=data ausencia=tAusencia just=justificacao # verificarData
    | dataInicio=data dataFim=data ausencia=tAusencia # verificarDataSemJust
    ;

data : DIA '/' MES '/' ANO
    | ANO '/' MES '/' DIA
    ;

DIA: '0'[1-9]|[12][0-9]|'3'[01]
    ;

MES : '0'[1-9]|'1'[1-2]
    ;

ANO:[12][0-9]{3}
    ;


/*TODO verificacao para ignorar Upper lower case*/
tAusencia : 'Ferias'
    | 'Justificada'
    | 'Nao justificada'
    ;

justificacao : frase
    ;

    /*desconto*/
pedidoDesconto: codigoInterno nome tipoDesconto recorrencia desconto identFatura data fundamentacaoPedidos
    ;

codigoInterno : LETRA LETRA LETRA NUMERO NUMERO NUMERO;

nome : frase
    ;

tipoDesconto : frase
    ;

recorrencia : 'Unica'
    | 'Ate Data Limite'
    ;

desconto : percentagem=percentagemDesconto valor=valorDesconto # funcaoDesconto
    ;


percentagemDesconto : digitos
    ;

valorDesconto : digitos
    ;

fundamentacaoPedidos : frase
    ;

identFatura : frase;

    /*residencia*/
pedidoResidencia: morada codigoPostal localidade
    ;

morada: rua porta
    ;

porta : digitos
    ;

rua : frase
    ;

codigoPostal : NUMERO NUMERO NUMERO NUMERO '-' NUMERO NUMERO NUMERO
    ;

localidade : frase
    ;

    /*cotacaoVendas*/

pedidoCotacaoVendas : codigoPoduto quantidadePretendida tipoCliente
    ;

codigoPoduto : WORD;

quantidadePretendida: real;

tipoCliente : 'Nacional'
    | 'Europeu'
    | 'Resto do Mundo'
    ;

/*formulario aprovacao*/


aprovacao : aprovacaoAusencia
    | aprovacaoDesconto
    ;
    /*ausencia*/
aprovacaoAusencia:resposta fundamentacaoRespostaAusencia
    ;


fundamentacaoRespostaAusencia : frase
    ;

    /*desconto*/
aprovacaoDesconto: resposta fundamentacaoRespostaDesconto desconto
    ;

fundamentacaoRespostaDesconto:frase;


/*formulario realizacao*/
realizacao : realizacaoAusencia
    | realizacaoResidencia
    ;

    /*ausencia*/

realizacaoAusencia : ferias comentario
    | ferias
    ;

ferias: diasJG=diasJaGozados diasGPS=diasGozadosPeridoSolicitado feriasT=feriasTotais faltasJ=faltasJustificadas diasFJPS=diasFaltasJustificadasPeriodoSolicitado faltasJT=faltasJustificadasTotais faltasI=faltasInjustificadas faltasIPS=faltasInjustificadasPeriodoSolicitado faltasIT=faltasInjustificadasTotais # funcaoFerias
    ;

diasJaGozados: digitos;
diasGozadosPeridoSolicitado: digitos;
feriasTotais: digitos;
faltasJustificadas: digitos;
diasFaltasJustificadasPeriodoSolicitado: digitos;
faltasJustificadasTotais: digitos;
faltasInjustificadas: digitos;
faltasInjustificadasPeriodoSolicitado: digitos;
faltasInjustificadasTotais: digitos;
comentario: frase;

    /*residencia*/

realizacaoResidencia: observacoes
    ;

observacoes: frase
    ;





/*gerais*/
frase : WORD+
    ;

resposta: 'Aprovado'
    | 'Recusado'
    ;

identificador : NUMERO
    ;

real : NUMERO '.' NUMERO ;

WORD : ('\u0021'..'\u00FF');

NUMERO: [0-9];

digitos : NUMERO+
    ;

LETRA : [A-Z];

WS : [ \t\r\n.,?!"']+ -> skip ; // skip spaces, tabs, newlines

NEWLINE: '\n';