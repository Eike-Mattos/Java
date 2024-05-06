package condicional;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        int i, j, cont;
        
        for (i = 0; i < 9; i++) {
            System.out.print("digite o número " + (i+1) + ": ");
            num[i] = sc.nextInt();
        }
        
        for (i = 0; i < 9; i++) {
            cont = 0;
            for (j = 1; j <= num[i]; j++) {
                if (num[i] % j == 0) {
                    cont++;
                }
            }
            if (cont <= 2) {
                System.out.println("numero primo: " + num[i]);
                System.out.println("posição: " + (i+1));
            }
            sc.close();
        }
    }
}