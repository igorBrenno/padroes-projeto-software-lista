/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificacaomulticanal;

/**
 *
 * @author igorb
 */
public class EmailNotificationFactory implements NotificationFactory{
    @Override
    public Notification criarNotificacao() {
        return new EmailNotification();
    }
}
