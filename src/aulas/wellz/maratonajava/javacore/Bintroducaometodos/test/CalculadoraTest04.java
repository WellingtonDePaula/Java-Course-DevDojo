package aulas.wellz.maratonajava.javacore.Bintroducaometodos.test;

import aulas.wellz.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] arrTest = {1, 2, 3, 4, 5};

        calculadora.somaVarArgs(arrTest);

        calculadora.somaVarArgs(1, 2, 3, 4, 5);
    }
}
