package com.mycompany.exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        ArrayList<Integer> idade = new ArrayList<>();
        Scanner feel = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite uma idade: ");
            int valor = feel.nextInt();
            idade.add(valor);
            
        }
        
                for (int i : idade){    
            System.out.println(i);
        }
        
    }
}