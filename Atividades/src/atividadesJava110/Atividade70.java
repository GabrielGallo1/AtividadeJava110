package atividadesJava110;

import java.util.Scanner;
public class Atividade70 {

	public class TabuadaFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();
	        for (int contador = 1; contador <= 10; contador++) {
	            System.out.println(numero + " x " + contador + " = " + (numero * contador));
	        }
	        scanner.close();
	    }
	}

}
