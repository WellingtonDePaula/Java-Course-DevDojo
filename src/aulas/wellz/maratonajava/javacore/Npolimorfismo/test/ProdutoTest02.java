package aulas.wellz.maratonajava.javacore.Npolimorfismo.test;

import aulas.wellz.maratonajava.javacore.Npolimorfismo.domain.Computador;
import aulas.wellz.maratonajava.javacore.Npolimorfismo.domain.Produto;
import aulas.wellz.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("ASUS", 6000);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        produto.calcularImposto();

        System.out.println("--------------");

        Produto produto2 = new Tomate("Americano", 20);

        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        produto2.calcularImposto();
    }
}
