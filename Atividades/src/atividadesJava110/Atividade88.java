package atividadesJava110;

import java.util.Scanner;
public class Atividade88 {

	public class NomesInversoFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String[] nomes = new String[5];
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Digite um nome: ");
	            nomes[i] = scanner.next();
	        }
	        System.out.println("Nomes na ordem inversa:");
	        for (int i = 4; i >= 0; i--) {
	            System.out.println(nomes[i]);
	        }
	        scanner.close();
	    }
	}

}
