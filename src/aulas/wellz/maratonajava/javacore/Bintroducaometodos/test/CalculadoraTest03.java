package aulas.wellz.maratonajava.javacore.Bintroducaometodos.test;

import aulas.wellz.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);
    }
}
