package aulas.wellz.maratonajava.javacore.Hheranca.test;

import aulas.wellz.maratonajava.javacore.Hheranca.domain.Endereco;
import aulas.wellz.maratonajava.javacore.Hheranca.domain.Funcionario;
import aulas.wellz.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa("Wellington");
        pessoa.setCpf("231.543.123.34");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("-------------------------");


        Funcionario funcionario = new Funcionario("Kleber");
        funcionario.setCpf("136.438.029.35");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(10000);

        funcionario.imprime();
    }
}
