package aulas.wellz.maratonajava.javacore.Gassociacao.exercicio.test;

import aulas.wellz.maratonajava.javacore.Gassociacao.exercicio.domain.Aluno;
import aulas.wellz.maratonajava.javacore.Gassociacao.exercicio.domain.Local;
import aulas.wellz.maratonajava.javacore.Gassociacao.exercicio.domain.Professor;
import aulas.wellz.maratonajava.javacore.Gassociacao.exercicio.domain.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Wellington", 16);
        Aluno aluno2 = new Aluno("Gabriel", 15);
        Aluno[] alunos1 = {aluno1, aluno2};
        Aluno[] alunos2 = {aluno1};

        Professor professor = new Professor("Grippa", "Matemática");
        Local local1 = new Local("Rua São Bernardino");
        Local local2 = new Local("Rua de Bosta");

        Seminario seminario1 = new Seminario("Números inteiros", local1, professor, alunos1);
        Seminario seminario2 = new Seminario("Números abstratos", local2, professor, alunos2);

        Seminario[] seminarios = {seminario1, seminario2};

        professor.setSeminarios(seminarios);

        for(int i = 0; i < seminarios.length; i++) {
            System.out.println("Seminário " + i + ":");
            seminarios[i].imprime();
        }

        System.out.println("Professor(s):");
        professor.imprime();

        for(int i = 0; i < alunos1.length; i++) {
            System.out.println("Aluno " + i + ":");
            alunos1[i].imprime();
        }
    }
}
