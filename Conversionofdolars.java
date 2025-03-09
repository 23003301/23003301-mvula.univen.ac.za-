/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversionofdolars;

/**
 *
 * @author andan
 */


import java.util.Scanner;
public class Conversionofdolars {

  
public static void main(String[] args) {
        
        int amount,twenties, tens, fives, ones;
        Scanner Scanner = new Scanner(System.in);
        
        System.out.print("Enter an amount in dollars: ");
        amount = Scanner.nextInt();
        
        twenties = amount / 20;
        amount %= 20;
        
        tens = amount / 10;
        amount %= 10;
        
        fives = amount / 5;
        amount %= 5;
        
        ones = amount;
        
        System.out.println("Currency denominations:");
        System.out.println("$20 bills: " + twenties);
        System.out.println("$10 bills: " + tens);
        System.out.println("$5 bills: " + fives);
        System.out.println("$1 bills: " + ones);
        
        Scanner.close();
    }
}
