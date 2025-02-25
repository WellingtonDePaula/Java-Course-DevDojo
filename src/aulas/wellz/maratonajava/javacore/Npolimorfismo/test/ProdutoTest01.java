package aulas.wellz.maratonajava.javacore.Npolimorfismo.test;

import aulas.wellz.maratonajava.javacore.Npolimorfismo.domain.Computador;
import aulas.wellz.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import aulas.wellz.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import aulas.wellz.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NFEWU26A", 9265.00);
        Tomate tomate = new Tomate("Tomate banano", 6);
        Televisao televisao = new Televisao("Samsung 50\"", 4954);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(televisao);

    }
}
