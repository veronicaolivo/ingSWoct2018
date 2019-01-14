/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2bimestre;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author veronica.olivo
 */
public class Tarea2Bimestre {

    /**
     * @param args the command line arguments
     */
    static private void creaSerie(int n) {

        int a = 0;
        int b = 1;
        int c = 0;
        int i;
        if (n > 20)//limitar el número de impresiones por presentación
        {
            n = 20;
        }

        if (n < 3) {
            n = 3;
        }

        c = a + b;

        System.out.printf("%d\n%d\n%d+%d=%d\n", a, b, a, b, c);

        for (i = 3; i < n; i++) {

            a = b;

            b = c;

            c = a + b;

            System.out.printf("%d+%d=%d\n", a, b, c);

        }

    }

    public static void main(String[] args) {

        // TODO code application logic here
        System.out.print("Programa que imprime los n primeros números de la serie de Fibonacci\nIngrese el número de elementos: ");

        Scanner in = new Scanner(System.in);

        String r = "";

        int n = 0;

        try {

            n = in.nextInt();

            creaSerie(n);

        } catch (InputMismatchException ex) {

            r = String.format("Entrada no válida");

        }

        System.out.print(r);

    }

}
