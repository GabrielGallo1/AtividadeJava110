package atividadesJava110;

import java.util.Scanner;
public class Atividade04 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite a primeira nota: ");
	        double nota1 = scanner.nextDouble();
	        System.out.print("Digite a segunda nota: ");
	        double nota2 = scanner.nextDouble();
	        System.out.print("Digite a terceira nota: ");
	        double nota3 = scanner.nextDouble();

	        double mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
	        System.out.println("Média ponderada: " + mediaPonderada);
	    }
	}


