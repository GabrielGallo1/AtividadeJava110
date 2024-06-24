package atividadesJava110;

import java.util.Scanner;
public class Atividade29 {

	public class SituacaoAluno {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o nome do aluno: ");
	        String nome = scanner.next();

	        System.out.print("Digite a nota do aluno: ");
	        double nota = scanner.nextDouble();

	        if (nota >= 7) {
	            System.out.println(nome + " está aprovado.");
	        } else {
	            System.out.println(nome + " está em recuperação.");
	        }

	        scanner.close();
	    }
	}

	public class ValorMacas {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o número de maçãs compradas: ");
	        int quantidade = scanner.nextInt();

	        double precoPorMaca;
	        if (quantidade < 12) {
	            precoPorMaca = 0.50;
	        } else {
	            precoPorMaca = 0.40;
	        }

	        double valorTotal = quantidade * precoPorMaca;
	        System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);

	        scanner.close();
	    }
	}

}
