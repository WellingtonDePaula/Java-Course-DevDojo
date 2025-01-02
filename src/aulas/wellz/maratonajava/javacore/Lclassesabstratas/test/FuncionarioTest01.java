package aulas.wellz.maratonajava.javacore.Lclassesabstratas.test;

import aulas.wellz.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import aulas.wellz.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Asamura", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
