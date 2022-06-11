/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/StringMethods.java to edit this template
 */
package com.lamsung.project1;

import java.util.Scanner;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Principal: ");
        int principal=scanner.nextInt();
        System.out.println("Annual Interest rate: ");
        double annualrate=scanner.nextDouble();
        System.out.println("Priod (Years): ");
        int years=scanner.nextInt();
        System.out.println("Mortgage: "+(principal*((annualrate*a)/a-1)));
    }
    
}
