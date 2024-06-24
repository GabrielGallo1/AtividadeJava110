package atividadesJava110;

import java.util.Scanner;
public class atividade72 {

	public class NumeroPrimoFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um n�mero: ");
	        int numero = scanner.nextInt();
	        boolean ehPrimo = true;
	        for (int divisor = 2; divisor < numero; divisor++) {
	            if (numero % divisor == 0) {
	                ehPrimo = false;
	                break;
	            }
	        }
	        if (ehPrimo) {
	            System.out.println("O n�mero " + numero + " � primo.");
	        } else {
	            System.out.println("O n�mero " + numero + " n�o � primo.");
	        }
	        scanner.close();
	    }
	}

}
