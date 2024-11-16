package aulas.wellz.maratonajava.javacore.Gassociacao.test;

import aulas.wellz.maratonajava.javacore.Gassociacao.domain.Jogador;
import aulas.wellz.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Fallen");
        Jogador jogador2 = new Jogador("Kscerato");
        Jogador jogador3 = new Jogador("Chelo");
        Jogador jogador4 = new Jogador("Yuurih");
        Jogador jogador5 = new Jogador("Skullz");

        Jogador[] jogadores = {jogador1, jogador2, jogador3, jogador4, jogador5};


        Time time = new Time("Fúria", jogadores);

        time.imprime();
    }
}
