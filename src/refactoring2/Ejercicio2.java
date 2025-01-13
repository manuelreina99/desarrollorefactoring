package refactoring2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        double[] numeros = new double[5]; 
        double num;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un numero decimal: ");
            num = sc.nextDouble();
            numeros[i] = num; 
        }

       
        System.out.println("Los numeros introducidos son:");
        for (double value : numeros) {
            System.out.println(value);
        }

        sc.close(); 
    }
}