package application;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] agrs) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos terá o vetor?");
		int n = sc.nextInt();
		double vect[] = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}

		double sum = 0;
		double average = 0;

		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		average = sum / n;
		System.out.printf("Média do vetor: %.3f%n", average);

		System.out.println("Elementos abaixo da média:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < average) {
				System.out.println(vect[i]);
			}
		}

		sc.close();
	}

}
