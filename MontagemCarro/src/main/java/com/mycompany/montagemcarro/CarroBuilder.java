/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.montagemcarro;

/**
 *
 * @author igorb
 */
public interface CarroBuilder {
    CarroBuilder setMotor(String motor);
    CarroBuilder setCor(String cor);
    CarroBuilder setPortas(int portas);
    CarroBuilder setTipoCombustivel(String tipo);
    public Carro build();
}
