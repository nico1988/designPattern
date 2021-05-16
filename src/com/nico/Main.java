package com.nico;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hi");
        User user = new User("nico");
        System.out.println(user.name);
        user.sayHello();
        TaxCalculator calculator = getCalculator();
        System.out.println("calculator:::" + calculator.calculateTax());
        // encapsulate
        var account = new Account();
        account.deposit(10);
        account.withdraw(2);
        System.out.println(account.getBalance());
        // Abstraction
        MailService mailService = new MailService();
        mailService.sendEmail();
        // inheritance
        var textBox = new TextBox();
        textBox.enable();
        // polymorphism
        drawUICntrol(new TextBox());
        drawUICntrol(new CheckBox());

    }
    public static TaxCalculator getCalculator() {
        return new Calculator2020();
    }
    public static void drawUICntrol(UIControl control) {
        control.draw();
    }
}
