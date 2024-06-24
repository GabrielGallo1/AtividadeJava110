package atividadesJava110;

import java.util.Scanner;
public class Atividade80 {

	public class MediaIdadesVariosFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int somaIdades = 0;
	        int contador = 0;
	        String nome;
	        do {
	            System.out.print("Digite o nome (ou 'fim' para encerrar): ");
	            nome = scanner.next();
	            if (nome.equalsIgnoreCase("fim")) {
	                break;
	            }
	            System.out.print("Digite a idade: ");
	            int idade = scanner.nextInt();
	            somaIdades += idade;
	            contador++;
	        } while (!nome.equalsIgnoreCase("fim"));
	        if (contador > 0) {
	            double media = somaIdades / (double) contador;
	            System.out.println("A média das idades é: " + media);
	        } else {
	            System.out.println("Nenhuma idade foi informada.");
	        }
	        scanner.close();
	    }
	}

}
