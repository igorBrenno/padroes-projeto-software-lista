/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciadordeconfiguracoes;

/**
 *
 * @author igorb
 */
public class ConfigManager {

    private String idioma;
    private String tema;
    private String modo;
    private static ConfigManager instance;

    private ConfigManager() {
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public void config(String i, String t, String m) {
        this.idioma = i;
        this.tema = t;
        this.modo = m;
    }

    @Override
    public String toString() {
        return """
               Configs:
               idioma: """ + idioma + "\n"
                + "tema: " + tema + "\n"
                + "modo: " + modo;
    }

}
