package atividadesJava110;

import java.util.Scanner;
public class Atividade35 {

	public class MediaAritmetica {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int numero2 = scanner.nextInt();

	        System.out.print("Digite o terceiro número: ");
	        int numero3 = scanner.nextInt();

	        double media = (numero1 + numero2 + numero3) / 3.0;

	        System.out.printf("A média aritmética é: %.2f\n", media);

	        if (media >= 7) {
	            System.out.println("Aprovado");
	        } else {
	            System.out.println("Reprovado");
	        }

	        scanner.close();
	    }
	}

	public class PodeVotar {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a idade da pessoa: ");
	        int idade = scanner.nextInt();

	        if (idade >= 18 && idade <= 70) {
	            System.out.println("O voto é obrigatório.");
	        } else if (idade >= 16 || idade > 70) {
	            System.out.println("O voto é facultativo.");
	        } else {
	            System.out.println("Não pode votar.");
	        }

	        scanner.close();
	    }
	}

}
