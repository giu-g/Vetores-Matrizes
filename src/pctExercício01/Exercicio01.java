package pctExercício01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int[] vet1 = new int[10];
		int aux = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Forneça a nota:");
			vet1[i] = sc.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			aux = aux + vet1[i];
		}
		System.out.println("A média é: " + (aux / 10));
		sc.close();
	}

}
