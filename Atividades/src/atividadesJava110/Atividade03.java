package atividadesJava110;

import java.util.Scanner;
public class Atividade03 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite a base do tri�ngulo: ");
	        double base = scanner.nextDouble();
	        System.out.print("Digite a altura do tri�ngulo: ");
	        double altura = scanner.nextDouble();

	        double area = (base * altura) / 2;
	        System.out.println("�rea do tri�ngulo: " + area);
	    
	}

}
