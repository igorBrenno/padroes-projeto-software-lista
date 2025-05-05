/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.montagemcarro;

/**
 *
 * @author igorb
 */
public class CarroBuilderIMP implements CarroBuilder {
    private final Carro carro;

    public CarroBuilderIMP() {
        this.carro = new Carro();
    }

    @Override
    public CarroBuilder setMotor(String motor) {
        carro.setMotor(motor);
        return this;
    }

    @Override
    public CarroBuilder setCor(String cor) {
        carro.setCor(cor);
        return this;
    }

    @Override
    public CarroBuilder setPortas(int portas) {
        carro.setPortas(portas);
        return this;
    }

    @Override
    public CarroBuilder setTipoCombustivel(String tipo) {
        carro.setTipoCombustivel(tipo);
        return this;
    }

    @Override
    public Carro build() {
        return carro;
    }
}
