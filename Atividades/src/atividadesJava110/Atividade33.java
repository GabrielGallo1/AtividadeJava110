package atividadesJava110;

import java.util.Scanner;
public class Atividade33 {

	public class SaudacaoAluno {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o nome do aluno: ");
	        String nome = scanner.next();

	        System.out.print("Digite o turno (M para Matutino, V para Vespertino): ");
	        char turno = scanner.next().charAt(0);

	        if (turno == 'M' || turno == 'm') {
	            System.out.println("Bom dia, " + nome);
	        } else if (turno == 'V' || turno == 'v') {
	            System.out.println("Boa tarde, " + nome);
	        } else {
	            System.out.println("Turno inválido.");
	        }

	        scanner.close();
	    }
	}

}
