package atividadesJava110;

import java.util.Scanner;
public class Atividade73 {

	public class FibonacciFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();
	        int a = 0, b = 1;
	        for (int i = 0; a <= numero; i++) {
	            System.out.println(a);
	            int temp = a;
	            a = b;
	            b = temp + b;
	        }
	        scanner.close();
	    }
	}

}
