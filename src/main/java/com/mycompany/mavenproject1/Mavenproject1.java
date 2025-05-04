/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Fecha fecha_juan = new Fecha(29,9,2002);
        Direccion direccion_juan = new Direccion("Palenque","Cra. 87#68B-33","Robledo","Medellin","Nimguno","201");
        Usuario usuario_juan = new Usuario("Juan Valencia",1002527949L,fecha_juan,"Duitama",3143059778L,"juvalenciave@unal.edu.co",direccion_juan);
        System.out.println(usuario_juan.toString());
        
        System.out.println("### INGRESE SUS DATOS ###");
        
        System.out.print("Nombre: ");
        String nombre_user = sc.nextLine();
        
        long id_user = PruebasTry.leerLong("ID: ", sc);
        
        System.out.println("Fecha de nacimiento:");
        int dia_nacimiento = PruebasTry.leerInt("Dia: ", sc);
        int mes_nacimiento = PruebasTry.leerInt("Mes: ", sc);
        int anio_nacimiento = PruebasTry.leerInt("Año: ", sc);
        Fecha fecha_nacimiento_user = new Fecha(dia_nacimiento, mes_nacimiento, anio_nacimiento);
        
        System.out.print("Ciudad de nacimiento: ");
        String ciudad_nacimiento_user = sc.nextLine();
        
        long tel_user = PruebasTry.leerLong("Telefono: ", sc);
        
        System.out.print("Email: ");
        String email_user = sc.nextLine();
        
        System.out.println("Direccion de residencia: ");
        
        System.out.print("Calle: ");
        String calle_user = sc.nextLine();
        
        System.out.print("Nomenclatura: ");
        String nomenclatura_user = sc.nextLine();
        
        System.out.print("Barrio: ");
        String barrio_user = sc.nextLine();
        
        System.out.print("Ciudad: ");
        String ciudad_user = sc.nextLine();
        
        System.out.print("Edificio: ");
        String edificio_user = sc.nextLine();
        
        System.out.print("Apartamento: ");
        String apto_user = sc.nextLine();
        
        Direccion dir_user = new Direccion(calle_user, nomenclatura_user, barrio_user, ciudad_user, edificio_user, apto_user);
        
        Usuario usuario_prueba = new Usuario(nombre_user, id_user, fecha_nacimiento_user, ciudad_nacimiento_user, tel_user, email_user, dir_user);
        
        System.out.println(usuario_prueba.toString());
        

        
    }
}
