package atividadesJava110;

import java.util.Scanner;
public class Atividade45 {

	public class Fibonacci20 {
	    public static void main(String[] args) {
	        int a = 0, b = 1;
	        int contador = 0;
	        while (contador < 20) {
	            System.out.println(a);
	            int temp = a;
	            a = b;
	            b = temp + b;
	            contador++;
	        }
	    }
	}

}
