package atividadesJava110;

import java.util.Scanner;
public class Atividade01 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o primeiro n�mero: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Digite o segundo n�mero: ");
	        int num2 = scanner.nextInt();

	        int soma = num1 + num2;
	        int subtracao = num1 - num2;
	        int multiplicacao = num1 * num2;
	        double divisao = (double) num1 / num2;

	        System.out.println("Soma: " + soma);
	        System.out.println("Subtra��o: " + subtracao);
	        System.out.println("Multiplica��o: " + multiplicacao);
	        System.out.println("Divis�o: " + divisao);
	    }
}

