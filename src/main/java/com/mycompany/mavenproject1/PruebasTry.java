/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Usuario
 */
public class PruebasTry {
    
    public static long leerLong(String mensaje, Scanner sc){
            long valor=0;
            while(true){
                try{
                    System.out.print(mensaje);
                    valor = sc.nextLong();
                    sc.nextLine();
                    return valor;
                }catch(InputMismatchException e){
                    System.out.println("Ingrese un dato valido.");
                    sc.nextLine();
                }
            }
        }
    
    public static int leerInt(String mensaje, Scanner sc){
            int valor=0;
            while(true){
                try{
                    System.out.print(mensaje);
                    valor = sc.nextInt();
                    sc.nextLine();
                    return valor;
                }catch(InputMismatchException e){
                    System.out.println("Ingrese un dato valido.");
                    sc.nextLine();
                }
            }
            
        }
    
}
