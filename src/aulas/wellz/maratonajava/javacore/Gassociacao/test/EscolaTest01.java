package aulas.wellz.maratonajava.javacore.Gassociacao.test;

import aulas.wellz.maratonajava.javacore.Gassociacao.domain.Escola;
import aulas.wellz.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Grippa");
        Professor[] professores = {professor};
        Escola escola = new Escola("Bruno Hoeltgebaum", professores);

        escola.imprime();
    }
}