/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.criadordeusuario;

/**
 *
 * @author igorb
 */
public class main {

    public static void main(String[] args) {
        User user1 = UserFactory.createUser("admin");
        User user2 = UserFactory.createUser("editor");
        User user3 = UserFactory.createUser("viewer");
        
        user1.exibir();
        user2.exibir();
        user3.exibir();
    }
}
