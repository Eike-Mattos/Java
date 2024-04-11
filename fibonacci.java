package condicional;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("insira o valor do limite ");
		int limite = sc.nextInt();
		int numero1 = 0;
		int numero2 = 1;
		int cont, res;
		System.out.println(numero2);
		for(cont = 2; cont<=limite; cont++) {
			res = numero1 + numero2;
			System.out.println(res);
			numero1 = numero2;
			numero2 = res;
		}

	}

}
