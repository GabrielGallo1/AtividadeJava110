package atividadesJava110;

import java.util.Scanner;
public class Atividade90 {

	public class SomaParesCincoFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int somaPares = 0;
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Digite um número: ");
	            int numero = scanner.nextInt();
	            if (numero % 2 == 0) {
	                somaPares += numero;
	            }
	        }
	        System.out.println("A soma dos números pares é: " + somaPares);
	        scanner.close();
	    }
	}

}
