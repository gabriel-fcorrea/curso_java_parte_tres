package application;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores terão em cada vetor? ");
		int n = sc.nextInt();

		int[] vect1 = new int[n];
		int[] vect2 = new int[n];

		System.out.println("Digite os valores do primeiro vetor: ");

		for (int i = 0; i < vect1.length; i++) {
			System.out.print("Digite um valor: ");
			vect1[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do segundo vetor: ");

		for (int i = 0; i < vect2.length; i++) {
			System.out.print("Digite um valor: ");
			vect2[i] = sc.nextInt();
		}

		sc.close();
	}
}
