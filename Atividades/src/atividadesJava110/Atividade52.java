package atividadesJava110;

import java.util.Scanner;
public class Atividade52 {

	public class SomaNumerosDoWhile {
	    public static void main(String[] args) {
	        int numero = 1;
	        int soma = 0;
	        do {
	            soma += numero;
	            numero++;
	        } while (numero <= 100);
	        System.out.println("A soma dos n�meros de 1 a 100 �: " + soma);
	    }
	}

}
