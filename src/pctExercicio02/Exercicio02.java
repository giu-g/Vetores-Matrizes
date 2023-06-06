package pctExercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int[] vet = new int[10];
		int[] vet2 = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Escreva o número:");
			vet[i] = sc.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			vet2[i] = (vet[i] * 2);
		}
		System.out.println("O dobro dos números apresentados é");

		for (int i = 0; i < 10; i++) {
			System.out.println(vet2[i]);
		}
		sc.close();
	}

}
