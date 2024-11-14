package aulas.wellz.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        episodios = new int[60];
        for(int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime() {
        for(int episodios: this.episodios) {
            System.out.print(episodios + " ");
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
