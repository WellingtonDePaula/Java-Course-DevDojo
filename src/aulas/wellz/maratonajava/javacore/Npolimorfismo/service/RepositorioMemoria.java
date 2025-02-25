package aulas.wellz.maratonajava.javacore.Npolimorfismo.service;

import aulas.wellz.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
