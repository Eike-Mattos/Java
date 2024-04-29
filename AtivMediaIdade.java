package condicional;

import java.util.Scanner;

public class AtivMediaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		  int idade, qtdeIdade = 0;
		  double media = 0f;
		  boolean fim = false;
		  
		  System.out.println("informe a idade ");
		  idade = sc.nextInt();
		  while( fim == false) {
			  idade = sc.nextInt();
			  if(idade <= 0) {
				  fim = true;
			  }else
				  media += idade;
			  qtdeIdade ++;
		  }
		  sc.close();
			media /= qtdeIdade;
			System.out.println("a média das idades é aproximadamente "+media+" anos");
	}

}
