package atividadesJava110;

import java.util.Scanner;
public class Atividade14 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite a idade em anos, meses e dias:");
	        int anos = scanner.nextInt();
	        int meses = scanner.nextInt();
	        int dias = scanner.nextInt();
	        
	        int totalDias = (anos * 365) + (meses * 30) + dias;
	        
	        System.out.println("Voc� tem " + totalDias + " dias de vida.");
	        
	        scanner.close();
	    }
	}

