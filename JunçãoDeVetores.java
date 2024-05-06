package condicional;

import java.util.Scanner;

public class JunçãoDeVetores {

	public static void main(String[] args) {
	
		int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[20];

        Scanner sc = new Scanner(System.in);

        int j = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("digite o valor do primeiro vetor[" + i + "]: ");
            vet1[i] = sc.nextInt();
            vet3[j] = vet1[i];
            j++;
            System.out.print("digite o valor do segundo vetor[" + i + "]: ");
            vet2[i] = sc.nextInt();
            vet3[j] = vet2[i];
            j++;
        }

        System.out.println("Vetor resultante (vet3):");
        for (int i = 0; i < 20; i++) {
            System.out.println(vet3[i]);
        }
        sc.close();
    }
}