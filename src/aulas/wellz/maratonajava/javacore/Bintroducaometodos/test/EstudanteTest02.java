package aulas.wellz.maratonajava.javacore.Bintroducaometodos.test;

import aulas.wellz.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();

        estudante01.nome = "Wellington";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante01.imprime();
    }
}
