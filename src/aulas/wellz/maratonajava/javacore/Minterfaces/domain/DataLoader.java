package aulas.wellz.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    void load();

    static void a() {
        System.out.println("blabla");
    }

    int MAX_DATA_SIZE = 10;
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

    static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize");
        System.out.println(MAX_DATA_SIZE);
    }
}
