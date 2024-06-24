package atividadesJava110;

import java.util.Scanner;
public class Atividade63 {

	public class DigitosSeparadosDoWhile {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();
	        do {
	            int digito = numero % 10;
	            System.out.println(digito);
	            numero /= 10;
	        } while (numero > 0);
	        scanner.close();
	    }
	}

}
