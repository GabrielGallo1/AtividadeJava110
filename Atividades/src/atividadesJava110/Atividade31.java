package atividadesJava110;

import java.util.Scanner;
public class Atividade31 {

	public class SalariosMinimos {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor do sal�rio-m�nimo: ");
	        double salarioMinimo = scanner.nextDouble();

	        System.out.print("Digite o sal�rio do funcion�rio: ");
	        double salarioFuncionario = scanner.nextDouble();

	        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;
	        
	        System.out.printf("O funcion�rio recebe %.2f sal�rios-m�nimos.\n", quantidadeSalariosMinimos);

	        scanner.close();
	    }
	}

}
