/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.criadordeusuario;

/**
 *
 * @author igorb
 */
public class UserFactory {

    public static User createUser(String t) {
        switch (t.toLowerCase()) {
            case "admin" -> {
                return new Admin();
            }
            case "editor" -> {
                return new Editor();
            }
            case "viewer" -> {
                return new Viewer();
            }
            default ->
                throw new IllegalArgumentException("Tipo de user invalido: " + t);
        }
    }
;
}
