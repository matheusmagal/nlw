/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Matheus
 */

import java.util.Scanner;

public class Mavenproject1 {
   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite seu nome");
        String nome = entrada.next();
       

        System.out.println("digite seu email");
        String email = entrada.next();
        
        System.out.println("digite seu endereço");
        String end = entrada.next();
        
        
        System.out.println(nome);
        System.out.println();
        System.out.println(end); 
        System.out.println();
        System.out.println(email);
    }
}


/*Escreva um programa que mostre na tela o seu nome, seu endereço e email, como segue:
Centro Universitário Senac
Av. Eng. Eusébio Stevaux, 823 - Santo Amaro - São Paulo
fernando.lalmeida@sp.senac.br*/