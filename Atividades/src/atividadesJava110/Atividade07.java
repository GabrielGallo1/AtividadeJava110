package atividadesJava110;

import java.util.Scanner;
public class Atividade07 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o sal�rio base do funcion�rio: ");
	        double salarioBase = scanner.nextDouble();

	        double salarioLiquido = salarioBase * 1.05; // 5% de comiss�o
	        System.out.println("Sal�rio l�quido: " + salarioLiquido);
	    }
	}

