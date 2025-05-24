package aulas.wellz.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            System.out.println(divisao(10, 0));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }


        System.out.println("Código finalizado");
    }
    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Não pode ser zeroooooooo");
        }
        return a/b;
    }
}
