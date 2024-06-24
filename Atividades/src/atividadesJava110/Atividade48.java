package atividadesJava110;

import java.util.Scanner;
public class Atividade48 {

	public class DigitosSeparados {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();
	        while (numero > 0) {
	            int digito = numero % 10;
	            System.out.println(digito);
	            numero /= 10;
	        }
	        scanner.close();
	    }
	}

}
