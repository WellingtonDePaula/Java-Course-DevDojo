package aulas.wellz.maratonajava.javacore.Npolimorfismo.test;

import aulas.wellz.maratonajava.javacore.Npolimorfismo.domain.Computador;
import aulas.wellz.maratonajava.javacore.Npolimorfismo.domain.Produto;
import aulas.wellz.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import aulas.wellz.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("ASUS", 6000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2008");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
