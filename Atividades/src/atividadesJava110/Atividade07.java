package atividadesJava110;

import java.util.Scanner;
public class Atividade07 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o salário base do funcionário: ");
	        double salarioBase = scanner.nextDouble();

	        double salarioLiquido = salarioBase * 1.05; // 5% de comissão
	        System.out.println("Salário líquido: " + salarioLiquido);
	    }
	}

