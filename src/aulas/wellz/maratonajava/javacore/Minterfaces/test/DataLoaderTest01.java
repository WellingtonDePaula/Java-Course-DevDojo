package aulas.wellz.maratonajava.javacore.Minterfaces.test;

import aulas.wellz.maratonajava.javacore.Minterfaces.domain.DatabaseLoader;
import aulas.wellz.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();
    }
}
