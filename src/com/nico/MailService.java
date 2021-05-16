package com.nico;

public class MailService {
    public void sendEmail() {
        connect();
        disconnect();
        authenticate();
    }

    private void connect() {
        System.out.println("connect");
    }
    private void disconnect() {
        System.out.println("disconnect");
    }
    private void authenticate() {
        System.out.println("authenticate");
    }
}
