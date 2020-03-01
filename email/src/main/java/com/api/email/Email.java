package com.api.email;

/**
 * Email
 */
public class Email {

    public boolean sendEmail(String to, String sub, String msg)
    {

        System.out.println("Enviando para: " + to);
        System.out.println("Assunto: " + sub);
        System.out.println("Mensagem: " + msg);

        return true;

    }
}