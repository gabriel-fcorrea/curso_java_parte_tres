package application;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de números: ");
		int n = sc.nextInt();
		int[] vect = new int[n];

		// "i" é a posição do vetor
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		int num = 0;

		System.out.println("Números negativos: ");

		for (int i = 0; i < vect.length; i++) {
			num = vect[i];
			if (num < 0) {
				System.out.println(num);
			}
		}

		sc.close();
	}

}
