package atividadesJava110;

import java.util.Scanner;
public class Atividade87 {

	public class ParesImparesFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int pares = 0;
	        int impares = 0;
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Digite um número: ");
	            int numero = scanner.nextInt();
	            if (numero % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	        }
	        System.out.println("Quantidade de números pares: " + pares);
	        System.out.println("Quantidade de números ímpares: " + impares);
	        scanner.close();
	    }
	}

}
