package eapli.base.servico;


import eapli.base.servico.domain.*;
import org.junit.Test;


public class ServicoTeste {
    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarObjetivoServicoComMaisDe50Caracteres() {
        ObjetivoServico ob = new ObjetivoServico("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");

    }

    @Test
    public void aceitarObjetivoServicoComMenosDe50Caracteres() {
        ObjetivoServico ob = new ObjetivoServico("Objetivo");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoBreveMais40Caracteres() {
        DescricaoBreveServico db = new DescricaoBreveServico("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
    }

    @Test
    public void aceitarDescricaoBreveMenos40Caracteres() {
        DescricaoBreveServico db = new DescricaoBreveServico("Descricao");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoCompletaMais500Caracteres() {
        DescricaoCompletaServico dc = new DescricaoCompletaServico("O servico consiste na correcao de falhas eletricas"
                + " na organizacao.O servico consiste na correcao de falhas eletricas\"\n" +
                "                + \" na organizacao.O servico consiste na correcao de falhas eletricas\"\n" +
                "                + \" na organizacao.O servico consiste na correcao de falhas eletricas\"\n" +
                "                + \" na organizacao.O servico consiste na correcao de falhas eletricas\"\n" +
                "                + \" na organizacao.O servico consiste na correcao de falhas eletricas\"\n" +
                "                + \" na organizacao.O servico consiste na correcao de falhas eletricas\"\n" +
                "                + \" na organizacao.O servico consiste na correcao de falhas eletricas\"\n" +
                "                + \" na organizacao.");

    }

    @Test
    public void aceitarDescricaoCompletaMenos500Caracteres() {
        DescricaoCompletaServico dc = new DescricaoCompletaServico("O servico consiste na correcao de falhas eletricas"
                + " na organizacao.");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarTituloMais50Caracteres() {
        TituloServico ts = new TituloServico("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
    }

    @Test
    public void aceitarTituloMenos50Caracteres() {
        TituloServico ts = new TituloServico("Titulo");
    }


    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCodigoServicoMais15Caracteres() {
        CodigoUnicoServico db = new CodigoUnicoServico("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
    }

    @Test
    public void aceitarCodigoServicoMenos15Caracteres() {
        CodigoUnicoServico db = new CodigoUnicoServico("Codigo Unico");
    }















}