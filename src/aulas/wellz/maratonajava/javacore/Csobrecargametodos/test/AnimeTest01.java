package aulas.wellz.maratonajava.javacore.Csobrecargametodos.test;

import aulas.wellz.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Frieren e a Jornada para o Além", "Crunchyroll", 28, "Slice of Life");

        anime.imprime();
    }
}
