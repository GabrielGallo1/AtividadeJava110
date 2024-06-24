package atividadesJava110;

import java.util.Scanner;
public class Atividade60 {

	public class Fibonacci20DoWhile {
	    public static void main(String[] args) {
	        int a = 0, b = 1;
	        int contador = 0;
	        do {
	            System.out.println(a);
	            int temp = a;
	            a = b;
	            b = temp + b;
	            contador++;
	        } while (contador < 20);
	    }
	}

}
