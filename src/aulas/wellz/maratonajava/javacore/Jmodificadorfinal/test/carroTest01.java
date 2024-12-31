package aulas.wellz.maratonajava.javacore.Jmodificadorfinal.test;

import aulas.wellz.maratonajava.javacore.Jmodificadorfinal.domain.Carro;

public class carroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(Carro.COMPRADOR);
        Carro.COMPRADOR.setNome("Kuririn");
        System.out.println(Carro.COMPRADOR);
    }
}
