package atividadesJava110;

import java.util.Scanner;
public class Atividade15 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite o sal�rio atual:");
	        double salario = scanner.nextDouble();
	        
	        double novoSalario = salario * 1.15;
	        
	        System.out.printf("O novo sal�rio com aumento de 15%% �: %.2f%n", novoSalario);
	        
	        scanner.close();
	    }
	}

