package com.nico;

import com.nico.momento.Editor;
import com.nico.momento.History;

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
        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());
        // momento pattern
        var editor = new Editor();
        var history = new History();
        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        editor.restore(history.pop());
        System.out.println(editor.getContent());

    }
    public static TaxCalculator getCalculator() {
        return new Calculator2020();
    }
    public static void drawUIControl(UIControl control) {
        control.draw();
    }

}
