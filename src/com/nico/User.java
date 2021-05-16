package com.nico;

public class User {
    public String name;
    private String age;
    protected String sex;

    public User(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hi, my name is " + this.name);
    }
}
