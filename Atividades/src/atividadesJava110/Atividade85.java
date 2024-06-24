package atividadesJava110;

import java.util.Scanner;
public class Atividade85 {

	public class MaiorMenorFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();
	        int maior = numero;
	        int menor = numero;
	        for (int i = 1; i < 10; i++) {
	            System.out.print("Digite um número: ");
	            numero = scanner.nextInt();
	            if (numero > maior) {
	                maior = numero;
	            }
	            if (numero < menor) {
	                menor = numero;
	            }
	        }
	        System.out.println("O maior número é: " + maior);
	        System.out.println("O menor número é: " + menor);
	        scanner.close();
	    }
	}


}
