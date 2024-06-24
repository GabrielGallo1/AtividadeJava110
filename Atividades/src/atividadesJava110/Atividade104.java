package atividadesJava110;

import java.util.Scanner;
public class Atividade104 {

	public class MatrizSimetrica {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[][] matriz = new int[3][3];
	        boolean simetrica = true;
	        
	        System.out.println("Digite os elementos da matriz 3x3:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                matriz[i][j] = scanner.nextInt();
	            }
	        }
	        
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (matriz[i][j] != matriz[j][i]) {
	                    simetrica = false;
	                    break;
	                }
	            }
	        }
	        
	        if (simetrica) {
	            System.out.println("A matriz é simétrica.");
	        } else {
	            System.out.println("A matriz não é simétrica.");
	        }
	        
	        scanner.close();
	    }
	}

}
