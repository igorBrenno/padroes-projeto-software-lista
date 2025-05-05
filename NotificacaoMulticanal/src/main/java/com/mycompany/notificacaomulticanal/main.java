/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notificacaomulticanal;

/**
 *
 * @author igorb
 */
public class main {

    public static void main(String[] args) {
        NotificationFactory emailfactory = new EmailNotificationFactory();
        Notification email = emailfactory.criarNotificacao();
        email.enviar("SSPSPSPSPSPP");
        
        NotificationFactory smsfactory = new SMSNotificationFactory();
        Notification sms = smsfactory.criarNotificacao();
        sms.enviar("shhshsfdhd");
    }
}
