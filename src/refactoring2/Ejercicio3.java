package refactoring2;

import java.util.Scanner; 

public class Ejercicio3 {
	
	public static void main (String[] args) {
		
		var sc = new Scanner(System.in);
		
		System.out.println("Introduce una palabra: ");
		String a = sc.next();
		
		System.out.println("Introduce otra palabra: ");
		String b = sc.next();
		
		if (a.length() < b.length()) {
			System.out.println("La palabra " + a + " es mas larga que " + b);
		} else if (a.length() > b.length()) {
			System.out.println("La palabra " + a + " es mas corta que " + b);
		} else {
			System.out.println("Las palabras son iguales en numero de caracteres.");
		
		}
		sc.close();
	}

}
