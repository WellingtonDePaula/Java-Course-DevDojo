package aulas.wellz.maratonajava.javacore.Kenum.domain;

public enum TipoPagamento {
        CREDITO("bolas") {
                @Override
                public double calcularDesconto(double valor) {
                        return valor * 0.0;
                }
        },
        DEBITO("wellz") {
                @Override
                public double calcularDesconto(double valor) {
                        return valor * 0.1;
                }
        };

        public final String NOME;
        TipoPagamento(String nome) {
                this.NOME = nome;
        }

        public abstract double calcularDesconto(double valor);
}