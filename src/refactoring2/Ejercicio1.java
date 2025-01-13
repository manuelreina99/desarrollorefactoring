package refactoring2;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String[] args) {
		
		var sc = new Scanner(System.in);
		
		System.out.print("Introduce el radio del circulo:");
		int radio = sc.nextInt();
		
		double longitud = 2*radio*Math.PI;
		
		double area = radio * radio * Math.PI;
		System.out.println("El area del circulo de radio " + radio + " es " + area + " y su longitud es " + longitud);
		
		sc.close();
		
	}

}