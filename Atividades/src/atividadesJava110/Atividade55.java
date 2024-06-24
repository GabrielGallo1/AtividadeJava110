package atividadesJava110;

import java.util.Scanner;
public class Atividade55 {

	public class TabuadaDoWhile {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();
	        int contador = 1;
	        do {
	            System.out.println(numero + " x " + contador + " = " + (numero * contador));
	            contador++;
	        } while (contador <= 10);
	        scanner.close();
	    }
	}

}
