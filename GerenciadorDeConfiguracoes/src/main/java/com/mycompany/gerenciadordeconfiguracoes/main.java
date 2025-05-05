/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciadordeconfiguracoes;

/**
 *
 * @author igorb
 */
public class main {

    public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstance();
        config.config("Portugues", "SEI LA", "Claro");
        System.out.println(config.toString());
    }
}
