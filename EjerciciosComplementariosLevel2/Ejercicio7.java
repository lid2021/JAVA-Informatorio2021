package com.informatorio;

import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String args[]) {
        int num1;
        int num2;
        ArrayList<String> sumaTotal = new ArrayList();
        Scanner numIngresado = new Scanner(System.in);
        System.out.println("Ingrese su primer numero, que sea del menor: ");
        num1 = numIngresado.nextInt();
        numIngresado.nextLine();
        System.out.println("Ingrese su segundo numero, el más grande: ");
        num2 = numIngresado.nextInt();
        numIngresado.nextLine();

        for (int i = num1; i < num2; i++) {
            if (num1 % 2 == 0 && num1 % 3 == 0) {
                sumaTotal.add(i + ". FizzBuzz");
            } else if (num1 % 3 == 0) {
                sumaTotal.add(i + ". Buzz");
            } else if (num1 % 2 == 0) {
                sumaTotal.add(i + ". Fizz");
            } else {
                System.out.println("Numero no multiplo de 2 ni de 3");
            }

        }
        for (int j = 0; j < sumaTotal.size(); j++) {
            System.out.println(sumaTotal.get(j));

        }
    }}