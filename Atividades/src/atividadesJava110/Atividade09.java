package atividadesJava110;

import java.util.Scanner;
public class Atividade09 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o valor do depósito mensal: ");
	        double depositoMensal = scanner.nextDouble();
	        System.out.print("Digite a taxa de juros mensal (em %): ");
	        double taxaJuros = scanner.nextDouble();

	        double montante = 0;
	        for (int i = 0; i < 12; i++) {
	            montante += depositoMensal;
	            montante += montante * (taxaJuros / 100);
	        }
	        System.out.println("Montante após 12 meses: " + montante);
	    }
	}

