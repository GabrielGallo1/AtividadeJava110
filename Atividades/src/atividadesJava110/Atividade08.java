package atividadesJava110;

import java.util.Scanner;
public class Atividade08 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o primeiro n�mero: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Digite o segundo n�mero: ");
	        int num2 = scanner.nextInt();

	        int temp = num1;
	        num1 = num2;
	        num2 = temp;

	        System.out.println("Ap�s a troca:");
	        System.out.println("Primeiro n�mero: " + num1);
	        System.out.println("Segundo n�mero: " + num2);
	    }
	}

