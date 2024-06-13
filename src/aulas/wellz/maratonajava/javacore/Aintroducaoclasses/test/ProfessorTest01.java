package aulas.wellz.maratonajava.javacore.Aintroducaoclasses.test;

import aulas.wellz.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Ivandro";
        professor.idade = 50;
        professor.sexo = 'M';
        
        System.out.println("O professor se chama " + professor.nome + " tem " + professor.idade + " anos, e é do sexo " + professor.sexo);
    }
}
