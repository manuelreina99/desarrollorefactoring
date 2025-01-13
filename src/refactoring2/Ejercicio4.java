package refactoring2;

public class Ejercicio4 {
	
	public static void main (String[] args) {
		
		int indice = 0;
		int[] numerosPrimos = new int [100];
		
		boolean esPrimo = false;
		
		
		for (int i = 0; i < 100; i++) {
			if(esPrimo(i)) {
				numerosPrimos[indice] = i;
				indice++;
			}
		}
		
		System.out.println("Los numeros primos son: ");
		for (int value : numerosPrimos) {
			System.out.println(value);
		}
	}
	
	public static boolean esPrimo(int numero) {
	    if (numero < 2) {
	        return false;
	    }
	    for (int j = 2; j <= Math.sqrt(numero); j++) {
	        if (numero % j == 0) {
	            return false;
	        }
	    }
	    return true;
	}

}