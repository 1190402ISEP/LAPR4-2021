package eapli.base.formulario.domain;

import org.junit.Test;

public class FormularioTest {

    @Test(expected = IllegalArgumentException.class)
    public void naoPermitirDescricaoAjudaAtributoMais50Caracteres() {
        DescricaoAjudaAtributo d = new DescricaoAjudaAtributo("aaaaaaaaaaaaaaaaaaaaaaavvvvvvvvvvvvvvvvvvvvvvvbbduded" +
                "eiefbiefefeuf9eyfvbeygfegoirguwrghrçoguwgourçgow4oçowbgçowçogourgwrgo4gwrgwg" +
                "4gowgbwogo4pwgbwo4ugbwo44ghhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }
    @Test
    public void permitirDescricaoAjudaAtributoMenos50Caracteres() {
        DescricaoAjudaAtributo d = new DescricaoAjudaAtributo("aaaaaaaaaaaaaa");
    }


}
