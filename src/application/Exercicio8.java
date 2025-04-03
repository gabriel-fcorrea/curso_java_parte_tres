package application;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos terá o vetor? ");
		int n = sc.nextInt();
		int vect[] = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		double average = 0;
		double sum = 0;
		double denominator = 0;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				sum += vect[i];
				denominator++;
			}
		}

		average = sum / denominator;

		if (average != 0) {
			System.out.printf("Média dos pares: %.1f", average);
		} else {
			System.out.print("Nenhum número par.");
		}

		sc.close();
	}

}
