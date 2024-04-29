package condicional;

import java.util.Scanner;

public class ExercRaizCubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double num,cubo = 0,raiz = 0,quadrado = 0;
		System.out.println("informe o valor do numero");
		num = sc.nextDouble();
		
		while(num > 0) {
			quadrado = num*num;
			cubo = num*num*num;
			raiz = Math.sqrt(num);
			
			System.out.printf("valor de cubo" + num + " é " + cubo);
			System.out.printf("valor de quadrado" + num + " é " + quadrado);
			System.out.printf("valor de raiz" + num + " é " + raiz);
			num = sc.nextDouble();
		}
		
				
		sc.close();
	}


}
