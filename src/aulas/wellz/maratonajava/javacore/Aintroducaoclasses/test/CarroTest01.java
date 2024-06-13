package aulas.wellz.maratonajava.javacore.Aintroducaoclasses.test;

import aulas.wellz.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        //carros fora do array:

        //carro 1
        Carro carro1 = new Carro();
        carro1.nome = "Lamborghini";
        carro1.modelo = "Veneno";
        carro1.ano = 2013;

        //carro 2
        Carro carro2 = new Carro();
        carro2.nome = "Chevrolet";
        carro2.modelo = "Cruze";
        carro2.ano = 2023;

        System.out.println("\nNome: " + carro1.nome + ". Modelo: " + carro1.modelo + ". ano: " + carro1.ano + ".");
        System.out.println("Nome: " + carro2.nome + ". Modelo: " + carro2.modelo + ". ano: " + carro2.ano + ".\n");


        ////////////////////////////////////////////////////////////////////////////
        System.out.println("--------------------------------------------------------\n");
        ////////////////////////////////////////////////////////////////////////////

        //carros dentro do array:

        Carro[] carros = {new Carro(), new Carro()};
        //carro 1
        carros[0].nome = "Lamborghini";
        carros[0].modelo = "Veneno";
        carros[0].ano = 2013;

        //carro 2
        carros[1].nome = "Chevrolet";
        carros[1].modelo = "Cruze";
        carros[1].ano = 2023;

        for(int i = 0; i < carros.length; i++) {
            System.out.println("Nome: " + carros[i].nome);
            System.out.println("Modelo: " + carros[i].modelo);
            System.out.println("Ano :" + carros[i].ano + "\n");
        }
    }
}
