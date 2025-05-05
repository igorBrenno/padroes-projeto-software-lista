/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.montagemcarro;

/**
 *
 * @author igorb
 */
public class main {

    public static void main(String[] args) {
        Director diretor = new Director();

        CarroBuilder builder = new CarroBuilderIMP();
        Carro carroEsportivo = diretor.construirCarroEsportivo(builder);
        System.out.println("Carro Esportivo:\n" + carroEsportivo);

        Carro carroPopular = diretor.construirCarroPopular(new CarroBuilderIMP());
        System.out.println("\nCarro Popular:\n" + carroPopular);
    }
}
