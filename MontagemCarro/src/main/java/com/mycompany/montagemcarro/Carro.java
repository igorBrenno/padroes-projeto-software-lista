/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.montagemcarro;

/**
 *
 * @author igorb
 */
public class Carro {

    private String motor;
    private String cor;
    private int portas;
    private String tipoCombustivel;

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

        @Override
    public String toString() {
        return """
               Carro 
                 motor='""" + motor + '\'' + ",\n" +
                "  cor='" + cor + '\'' + ",\n" +
                "  portas=" + portas + ",\n" +
                "  tipoDeCombustivel='" + tipoCombustivel
               ;
    }
    
    
}
