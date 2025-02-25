package aulas.wellz.maratonajava.javacore.Npolimorfismo.service;

import aulas.wellz.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
