package aulas.wellz.maratonajava.javacore.Npolimorfismo.service;

import aulas.wellz.maratonajava.javacore.Npolimorfismo.domain.Produto;
import aulas.wellz.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            System.out.println(((Tomate) produto).getDataValidade());
        }

    }
}
