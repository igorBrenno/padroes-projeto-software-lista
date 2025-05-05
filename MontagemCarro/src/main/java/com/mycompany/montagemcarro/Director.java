/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.montagemcarro;

/**
 *
 * @author igorb
 */
public class Director {

    public Carro construirCarroEsportivo(CarroBuilder builder) {
        return builder
                .setMotor("V8")
                .setCor("Vermelho")
                .setPortas(2)
                .setTipoCombustivel("Gasolina")
                .build();
    }

    public Carro construirCarroPopular(CarroBuilder builder) {
        return builder
                .setMotor("1.0")
                .setCor("Prata")
                .setPortas(4)
                .setTipoCombustivel("Flex")
                .build();
    }
}
