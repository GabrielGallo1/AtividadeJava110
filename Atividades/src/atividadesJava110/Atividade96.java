package atividadesJava110;

import java.util.Scanner;
public class Atividade96 {

	public class MaisVelhoVariosFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int idadeMaisVelha = 0;
	        String nomeMaisVelho = "";
	        String nome;
	        do {
	            System.out.print("Digite o nome (ou 'fim' para encerrar): ");
	            nome = scanner.next();
	            if (nome.equalsIgnoreCase("fim")) {
	                break;
	            }
	            System.out.print("Digite a idade: ");
	            int idade = scanner.nextInt();
	            if (idade > idadeMaisVelha) {
	                idadeMaisVelha = idade;
	                nomeMaisVelho = nome;
	            }
	        } while (!nome.equalsIgnoreCase("fim"));
	        if (!nomeMaisVelho.isEmpty()) {
	            System.out.println("A pessoa mais velha é " + nomeMaisVelho + " com " + idadeMaisVelha + " anos.");
	        } else {
	            System.out.println("Nenhuma pessoa foi informada.");
	        }
	        scanner.close();
	    }
	}

}
