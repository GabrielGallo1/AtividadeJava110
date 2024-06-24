package atividadesJava110;

import java.util.Scanner;
public class Atividade26 {

	public class ValorTotalCompra {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o código do produto: ");
	        int codigoProduto = scanner.nextInt();

	        System.out.print("Digite a quantidade comprada: ");
	        int quantidade = scanner.nextInt();

	        double preco;
	        switch (codigoProduto) {
	            case 1:
	                preco = 10.0;
	                break;
	            case 2:
	                preco = 20.0;
	                break;
	            case 3:
	                preco = 30.0;
	                break;
	            default:
	                preco = 0.0;
	                System.out.println("Código de produto inválido.");
	                break;
	        }

	        if (preco > 0) {
	            double valorTotal = preco * quantidade;
	            System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);
	        }

	        scanner.close();
	    }
	}

}
