package aulas.wellz.maratonajava.javacore.Kenum.test;

import aulas.wellz.maratonajava.javacore.Kenum.domain.Cliente;
import aulas.wellz.maratonajava.javacore.Kenum.domain.TipoCliente;
import aulas.wellz.maratonajava.javacore.Kenum.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente2.getTipoCliente().tipoClientePorNomeRelatorio("Pessoa Físic"));
    }
}
