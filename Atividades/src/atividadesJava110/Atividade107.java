package atividadesJava110;

import java.util.Scanner;
public class Atividade107 {

	public class ProdutoDiagonalSecundaria {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[][] matriz = new int[3][3];
	        int produto = 1;
	        
	        System.out.println("Digite os elementos da matriz 3x3:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                matriz[i][j] = scanner.nextInt();
	            }
	        }
	        
	        for (int i = 0; i < 3; i++) {
	            produto *= matriz[i][2 - i];
	        }
	        
	        System.out.println("O produto dos elementos da diagonal secund�ria �: " + produto);
	        
	        scanner.close();
	    }
	}

}
