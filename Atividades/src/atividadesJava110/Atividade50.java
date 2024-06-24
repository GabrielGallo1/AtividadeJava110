package atividadesJava110;

import java.util.Scanner;
public class Atividade50 {

	public class MediaIdadesVarios {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int somaIdades = 0;
	        int contador = 0;
	        while (true) {
	            System.out.print("Digite o nome (ou 'fim' para encerrar): ");
	            String nome = scanner.next();
	            if (nome.equalsIgnoreCase("fim")) {
	                break;
	            }
	            System.out.print("Digite a idade: ");
	            int idade = scanner.nextInt();
	            somaIdades += idade;
	            contador++;
	        }
	        if (contador > 0) {
	            double media = somaIdades / (double) contador;
	            System.out.println("A m�dia das idades �: " + media);
	        } else {
	            System.out.println("Nenhuma idade foi informada.");
	        }
	        scanner.close();
	    }
	}

}
