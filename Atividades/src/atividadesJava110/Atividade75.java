package atividadesJava110;

import java.util.Scanner;
public class Atividade75 {

	public class Fibonacci20For {
	    public static void main(String[] args) {
	        int a = 0, b = 1;
	        for (int contador = 0; contador < 20; contador++) {
	            System.out.println(a);
	            int temp = a;
	            a = b;
	            b = temp + b;
	        }
	    }
	}

}
