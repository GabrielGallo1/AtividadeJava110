package atividadesJava110;

import java.util.Scanner;
public class Atividade12 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite o peso em kg:");
	        double peso = scanner.nextDouble();
	        
	        System.out.println("Digite a altura em metros:");
	        double altura = scanner.nextDouble();
	        
	        double imc = peso / (altura * altura);
	        
	        System.out.printf("O IMC é: %.2f%n", imc);
	        
	        scanner.close();
	    }
	}

