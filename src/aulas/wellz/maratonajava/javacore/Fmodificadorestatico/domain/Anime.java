package aulas.wellz.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[60];
        for(int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        System.out.println("----------------------------------");
    }

    public Anime() {
        for(int episodios: Anime.episodios) {
            System.out.print(episodios + " ");
        }
        System.out.println();
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
