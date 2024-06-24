package atividadesJava110;

import java.util.Scanner;
public class Atividade82 {

	public class SomaDezNumerosFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int soma = 0;
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite um número: ");
	            int numero = scanner.nextInt();
	            soma += numero;
	        }
	        System.out.println("A soma dos números é: " + soma);
	        scanner.close();
	    }
	}

}
