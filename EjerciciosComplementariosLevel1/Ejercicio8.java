package com.informatorio;

import java.util.Scanner;

public class Ejercicio8 {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        byte edad = sc.nextByte();
        sc.nextLine();
        System.out.println("¿Cual es su direccion?: ");
        String direccion = sc.nextLine();
        System.out.println("¿Cual es su ciudad?: ");
        String ciudad = sc.nextLine();

        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombre);
    }
}
