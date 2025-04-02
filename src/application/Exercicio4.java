package application;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de números: ");
		int n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		System.out.println("Números Pares:");

		int pair = 0;
		int sum = 0;
		for (int i = 0; i < vect.length; i++) {
			pair = vect[i];
			if (pair % 2 == 0) {
				System.out.println(pair);
				sum++;
			}
		}

		System.out.print("QUANTIDADE DE PARES: " + sum);

		sc.close();
	}

}
