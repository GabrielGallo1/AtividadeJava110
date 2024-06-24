package atividadesJava110;

import java.util.Scanner;
public class Atividade76 {

	public class SomaParesFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();
	        int soma = 0;
	        for (int contador = 1; contador <= numero; contador++) {
	            if (contador % 2 == 0) {
	                soma += contador;
	            }
	        }
	        System.out.println("A soma dos números pares entre 1 e " + numero + " é: " + soma);
	        scanner.close();
	    }
	}

}
