package atividadesJava110;

import java.util.Scanner;
public class Atividade15 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite o salário atual:");
	        double salario = scanner.nextDouble();
	        
	        double novoSalario = salario * 1.15;
	        
	        System.out.printf("O novo salário com aumento de 15%% é: %.2f%n", novoSalario);
	        
	        scanner.close();
	    }
	}

