package aulas.wellz.maratonajava.javacore.Dconstrutores.test;

import aulas.wellz.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Frieren e a Jornada para o Além", "Crunchyroll", 28, "Slice of Life");
        Anime anime2 = new Anime();
        anime1.imprime();
        anime2.imprime();
    }
}
