package atividadesJava110;

import java.util.Scanner;
public class Atividade10 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um n�mero inteiro: ");
	        int numero = scanner.nextInt();

	        System.out.println("Tabuada de multiplica��o de " + numero + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }
	    }
	}

