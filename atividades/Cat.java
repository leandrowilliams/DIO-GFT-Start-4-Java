package br.com.dio.model;

import java.lang.reflect.Constructor;

import javax.naming.InterruptedNamingException;

public class Cat{
    
    private String name;
    private String color;
    private Integer age;

    // public Gato(String name, String color, Integer age) {
    // this.name = name;
    // this.color=color;
    // this.age=age;
    // }
    public Cat(){

    }
    public  Cat(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        this.age = age;    
    }

}