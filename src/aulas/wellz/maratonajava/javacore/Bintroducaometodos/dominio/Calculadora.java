package aulas.wellz.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10-5);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        return num1/num2;
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for(int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
