package atividadesJava110;

import java.util.Scanner;
public class Atividade32 {

	public class ConceituacaoNota {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a nota do aluno: ");
	        double nota = scanner.nextDouble();

	        String conceito;
	        if (nota >= 9) {
	            conceito = "A";
	        } else if (nota >= 7) {
	            conceito = "B";
	        } else if (nota >= 5) {
	            conceito = "C";
	        } else if (nota >= 3) {
	            conceito = "D";
	        } else {
	            conceito = "E";
	        }

	        System.out.println("A conceituação da nota é: " + conceito);

	        scanner.close();
	    }
	}

}
