package atividadesJava110;

import java.util.Scanner;
public class Atividade16 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite um n�mero inteiro:");
	        int num = scanner.nextInt();
	        
	        if (num > 0) {
	            System.out.println("O n�mero � positivo.");
	        } else if (num < 0) {
	            System.out.println("O n�mero � negativo.");
	        } else {
	            System.out.println("O n�mero � zero.");
	        }
	        
	        scanner.close();
	    }
	}

