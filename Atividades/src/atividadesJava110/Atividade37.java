package atividadesJava110;

import java.util.Scanner;
public class Atividade37 {

	public class SomaNumeros {
	    public static void main(String[] args) {
	        int numero = 1;
	        int soma = 0;
	        while (numero <= 100) {
	            soma += numero;
	            numero++;
	        }
	        System.out.println("A soma dos n�meros de 1 a 100 �: " + soma);
	    }
	}
}

