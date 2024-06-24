package atividadesJava110;

import java.util.Scanner;
public class Atividade62 {

	public class NumerosImparesDoWhile {
	    public static void main(String[] args) {
	        int numero = 1;
	        do {
	            if (numero % 2 != 0) {
	                System.out.println(numero);
	            }
	            numero++;
	        } while (numero <= 50);
	    }
	}

}
