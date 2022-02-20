package br.com.dio;

import br.com.dio.model.Cat;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Book book = new Book();
        
        System.out.println (cat);
        System.out.println (book);
        // int a = 2;
        // int b = 3;
        // System.out.println("Hello, World!");
        // System.out.println("Welcome, you like developer!");
        // System.out.println("A soma de A+B é= " + (a+b));
    }
    
    class Book {
        private String name;
        private String npage;
    }
}