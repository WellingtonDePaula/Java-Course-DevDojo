package aulas.wellz.maratonajava.javacore.Eblocosinicializacao.test;

import aulas.wellz.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Bunny Girl Senpai");

        System.out.println(anime.getEpisodios());
    }
}
