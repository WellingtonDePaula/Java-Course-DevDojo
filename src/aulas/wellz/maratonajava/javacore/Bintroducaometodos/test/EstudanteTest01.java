package aulas.wellz.maratonajava.javacore.Bintroducaometodos.test;

import aulas.wellz.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import aulas.wellz.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Kuro";
        estudante02.idade = 17;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}