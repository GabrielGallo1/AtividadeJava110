package atividadesJava110;

import java.util.Scanner;
public class Atividade103 {

	public class MenorValorMatriz3x3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[][] matriz = new int[3][3];
	        int menorValor = Integer.MAX_VALUE;
	        
	        System.out.println("Digite os elementos da matriz 3x3:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                matriz[i][j] = scanner.nextInt();
	                if (matriz[i][j] < menorValor) {
	                    menorValor = matriz[i][j];
	                }
	            }
	        }
	        
	        System.out.println("O menor valor na matriz �: " + menorValor);
	        
	        scanner.close();
	    }
	}

}
