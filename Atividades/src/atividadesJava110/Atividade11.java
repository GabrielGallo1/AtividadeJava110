package atividadesJava110;

import java.util.Scanner;
public class Atividade11 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite três números reais:");
	        double num1 = scanner.nextDouble();
	        double num2 = scanner.nextDouble();
	        double num3 = scanner.nextDouble();
	        
	        double media = (num1 + num2 + num3) / 3;
	        
	        System.out.printf("A média aritmética é: %.2f%n", media);
	        
	        scanner.close();
	    }
	}

