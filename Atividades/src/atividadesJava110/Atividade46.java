package atividadesJava110;

import java.util.Scanner;
public class Atividade46 {

	public class SomaPares {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um n�mero: ");
	        int numero = scanner.nextInt();
	        int soma = 0;
	        int contador = 1;
	        while (contador <= numero) {
	            if (contador % 2 == 0) {
	                soma += contador;
	            }
	            contador++;
	        }
	        System.out.println("A soma dos n�meros pares entre 1 e " + numero + " �: " + soma);
	        scanner.close();
	    }
	}

}
