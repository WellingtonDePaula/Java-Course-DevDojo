package aulas.wellz.maratonajava.javacore.Npolimorfismo.domain;

public class Televisao extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.5;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Tevelisão");
        return this.valor*IMPOSTO_POR_CENTO;
    }
}
