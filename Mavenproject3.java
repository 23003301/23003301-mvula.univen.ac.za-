
package com.mycompany.mavenproject3;
import java.util.Scanner;
public class Mavenproject3 {
   
    public static void main(String[] args) {
         Scanner ANDANI=new Scanner(System.in);
    double i,a,p,n;
            System.out.println("ENTER YOUR PRINCIPAL AMOUNT");
            p= ANDANI.nextDouble();
           System.out.println("ENTER INTEREST RATE");
           i= ANDANI.nextDouble();
           System.out.println("ENTER NUMBER OF YEARS");
           n = ANDANI.nextDouble();
          a = p * Math.pow(1+(i/100), n); 
           System.out.println("YOUR ACCUMULATED AMOUNT IS " + a);
           
           
           
           
            
            
            
            

        System.out.println("Hello World!");
    }}
