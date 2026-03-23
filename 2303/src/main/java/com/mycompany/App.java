package com.mycompany;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<String> nome = new ArrayList<>();
 

        nome.add("João");
        nome.add("Maria");  
        nome.add("Ana");
        
     
        nome.remove(0);
        
        System.out.println(nome);
  
 
        
    }
}