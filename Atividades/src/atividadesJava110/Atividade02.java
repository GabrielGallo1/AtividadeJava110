package atividadesJava110;

import java.util.Scanner;
public class Atividade02 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o raio do c�rculo: ");
	        double raio = scanner.nextDouble();

	        double area = Math.PI * Math.pow(raio, 2);
	        double perimetro = 2 * Math.PI * raio;

	        System.out.println("�rea: " + area);
	        System.out.println("Per�metro: " + perimetro);
	    
	}

}
