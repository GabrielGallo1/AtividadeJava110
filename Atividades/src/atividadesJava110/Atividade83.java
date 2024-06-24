package atividadesJava110;

import java.util.Scanner;
public class Atividade83 {

	public class MediaDezNumerosFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int soma = 0;
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite um número: ");
	            int numero = scanner.nextInt();
	            soma += numero;
	        }
	        double media = soma / 10.0;
	        System.out.println("A média dos números é: " + media);
	        scanner.close();
	    }
	}

}
