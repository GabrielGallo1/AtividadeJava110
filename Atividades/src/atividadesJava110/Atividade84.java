package atividadesJava110;

import java.util.Scanner;
public class Atividade84 {

	public class IdadeMaisVelhaFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int idadeMaisVelha = 0;
	        String nomeMaisVelho = "";
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Digite o nome: ");
	            String nome = scanner.next();
	            System.out.print("Digite a idade: ");
	            int idade = scanner.nextInt();
	            if (idade > idadeMaisVelha) {
	                idadeMaisVelha = idade;
	                nomeMaisVelho = nome;
	            }
	        }
	        System.out.println("A pessoa mais velha é " + nomeMaisVelho + " com " + idadeMaisVelha + " anos.");
	        scanner.close();
	    }
	}

}
