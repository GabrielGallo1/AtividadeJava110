package atividadesJava110;

import java.util.Scanner;
public class Atividade97 {

	public class MaisNovoVariosFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int idadeMaisNova = Integer.MAX_VALUE;
	        String nomeMaisNovo = "";
	        String nome;
	        do {
	            System.out.print("Digite o nome (ou 'fim' para encerrar): ");
	            nome = scanner.next();
	            if (nome.equalsIgnoreCase("fim")) {
	                break;
	            }
	            System.out.print("Digite a idade: ");
	            int idade = scanner.nextInt();
	            if (idade < idadeMaisNova) {
	                idadeMaisNova = idade;
	                nomeMaisNovo = nome;
	            }
	        } while (!nome.equalsIgnoreCase("fim"));
	        if (!nomeMaisNovo.isEmpty()) {
	            System.out.println("A pessoa mais nova é " + nomeMaisNovo + " com " + idadeMaisNova + " anos.");
	        } else {
	            System.out.println("Nenhuma pessoa foi informada.");
	        }
	        scanner.close();
	    }
	}

}
