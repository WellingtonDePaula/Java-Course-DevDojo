package aulas.wellz.maratonajava.introducao;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        String[][] casas = new String[2][2];

        casas[0][0] = "Azul";
        casas[0][1] = "Vermelho";

        casas[1][0] = "Amarelo";
        casas[1][1] = "Rosa";

        for(int i = 0; i < casas.length; i++) {
            for (int j = 0; j < casas[i].length; j++) {
                System.out.println(casas[i][j]);
            }
        }

        //foreach
        for(String[] arrBase: casas) {
            for(String color: arrBase) {
                System.out.println(color);
            }
        }
    }
}
