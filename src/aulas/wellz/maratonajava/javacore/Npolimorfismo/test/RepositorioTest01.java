package aulas.wellz.maratonajava.javacore.Npolimorfismo.test;

import aulas.wellz.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import aulas.wellz.maratonajava.javacore.Npolimorfismo.service.RepositorioArquivo;
import aulas.wellz.maratonajava.javacore.Npolimorfismo.service.RepositorioBancoDeDados;
import aulas.wellz.maratonajava.javacore.Npolimorfismo.service.RepositorioMemoria;

import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        repositorio = new RepositorioArquivo();
        repositorio.salvar();
        repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
