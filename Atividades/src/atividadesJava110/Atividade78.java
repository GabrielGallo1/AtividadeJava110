package atividadesJava110;

import java.util.Scanner;
public class Atividade78 {

	public class DigitosSeparadosFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();
	        String numeroString = String.valueOf(numero);
	        for (int i = 0; i < numeroString.length(); i++) {
	            System.out.println(numeroString.charAt(i));
	        }
	        scanner.close();
	    }
	}

}
