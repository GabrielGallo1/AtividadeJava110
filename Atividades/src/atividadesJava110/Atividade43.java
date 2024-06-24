package atividadesJava110;

import java.util.Scanner;
public class Atividade43 {

	public class Fibonacci {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();
	        int a = 0, b = 1;
	        while (a <= numero) {
	            System.out.println(a);
	            int temp = a;
	            a = b;
	            b = temp + b;
	        }
	        scanner.close();
	    }
	}

}
