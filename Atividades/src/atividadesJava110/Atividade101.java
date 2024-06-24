package atividadesJava110;

import java.util.Scanner;
public class Atividade101 {

	public class MediaMatriz4x4 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[][] matriz = new int[4][4];
	        int soma = 0;
	        
	        System.out.println("Digite os elementos da matriz 4x4:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                matriz[i][j] = scanner.nextInt();
	                soma += matriz[i][j];
	            }
	        }
	        
	        double media = soma / 16.0;
	        
	        System.out.printf("A média aritmética dos elementos é: %.2f%n", media);
	        
	        scanner.close();
	    }
	}

}
