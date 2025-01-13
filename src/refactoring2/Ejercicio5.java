package refactoring2;

import java.util.Scanner; 

public class Ejercicio5 {
	
	public static void main (String[] args) {
		
		var sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int n1 = sc.nextInt();
		System.out.println("Introduce otro numero: ");
		int n2 = sc.nextInt();
		
		if (sonAmigos(n1, n2)) {
			System.out.println("Los numeros son amigos.");
		} else {
			System.out.println("No son amigos.");
		}
		
		sc.close();
		
	}
	
	public static boolean sonAmigos (int n1, int n2) {
		
		boolean sonAmigos = false; 
		int divisoresN1 = 2;
		int divisoresN2 = 0;
		
		for (int i = 1; i < n1; i++) {
			if (n1 % i == 0) {
				divisoresN1 = i;
			}
		}
		 
		for (int i = 1; i < n2; i++) {
			if (n2 % i == 0) {
				divisoresN2 += i;
			}
		}
		
		if (divisoresN1 == divisoresN2) {
			sonAmigos = true;
		} else {
			sonAmigos = false;
		}
		
		return sonAmigos;
	}

}
