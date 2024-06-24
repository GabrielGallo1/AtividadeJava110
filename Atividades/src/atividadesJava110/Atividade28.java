package atividadesJava110;

import java.util.Scanner;
public class Atividade28 {

	public class CalculaIMC {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o peso (kg): ");
	        double peso = scanner.nextDouble();

	        System.out.print("Digite a altura (m): ");
	        double altura = scanner.nextDouble();

	        double imc = peso / (altura * altura);

	        System.out.printf("Seu IMC é: %.2f\n", imc);

	        if (imc < 18.5) {
	            System.out.println("Classificação: Abaixo do peso.");
	        } else if (imc >= 18.5 && imc < 24.9) {
	            System.out.println("Classificação: Peso normal.");
	        } else if (imc >= 25.0 && imc < 29.9) {
	            System.out.println("Classificação: Sobrepeso.");
	        } else if (imc >= 30.0 && imc < 34.9) {
	            System.out.println("Classificação: Obesidade grau 1.");
	        } else if (imc >= 35.0 && imc < 39.9) {
	            System.out.println("Classificação: Obesidade grau 2.");
	        } else {
	            System.out.println("Classificação: Obesidade grau 3.");
	        }

	        scanner.close();
	    }
	}

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

}
