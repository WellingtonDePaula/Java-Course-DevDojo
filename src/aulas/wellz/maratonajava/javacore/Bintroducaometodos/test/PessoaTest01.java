package aulas.wellz.maratonajava.javacore.Bintroducaometodos.test;

import aulas.wellz.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Wellington");
        pessoa.setIdade(15);
//      pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
