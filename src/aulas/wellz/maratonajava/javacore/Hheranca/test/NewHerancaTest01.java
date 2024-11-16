package aulas.wellz.maratonajava.javacore.Hheranca.test;

import aulas.wellz.maratonajava.javacore.Hheranca.domain.Endereco;
import aulas.wellz.maratonajava.javacore.Hheranca.domain.Funcionario;
import aulas.wellz.maratonajava.javacore.Hheranca.domain.Pessoa;

public class NewHerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Wellington");
        pessoa.setCpf("231.543.123.34");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        
    }
}
