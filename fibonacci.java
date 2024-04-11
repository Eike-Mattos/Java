package condicional;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("informe o valor do limite ");
		int limite = sc.nextInt();
		int num1 = 0;
		int num2 = 1;
		int cont, res;
		System.out.println(num2);
		for(cont = 2; cont<=limite; cont++) {
			res = num1 + num2;
			System.out.println(res);
			num1 = num2;
			num2 = res;
		}

	}

}
