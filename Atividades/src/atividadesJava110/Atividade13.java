package atividadesJava110;

import java.util.Scanner;
public class Atividade13 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite dois números inteiros:");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        
	        if (num1 % num2 == 0) {
	            System.out.println(num1 + " é múltiplo de " + num2);
	        } else {
	            System.out.println(num1 + " não é múltiplo de " + num2);
	        }
	        
	        scanner.close();
	    }
	}

