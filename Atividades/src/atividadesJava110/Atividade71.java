package atividadesJava110;

import java.util.Scanner;
public class Atividade71 {

	public class DivisoresFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número inteiro positivo: ");
	        int numero = scanner.nextInt();
	        for (int divisor = 1; divisor <= numero; divisor++) {
	            if (numero % divisor == 0) {
	                System.out.println(divisor);
	            }
	        }
	        scanner.close();
	    }
	}

}
