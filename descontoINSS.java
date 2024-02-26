package logica;

import java.util.Scanner;

public class descontoINSS {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float sb;

		Scanner sc = new Scanner(System.in);

		System.out.println("informe o valor do seu salario bruto: ");
		sb = sc.nextFloat();

		float scd = sb - (sb * 0.11f);

		System.out.printf("o salario com desconto é %.2f\n", scd );

        sc.close();

	}


}
