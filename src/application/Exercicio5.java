package application;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de números: ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}

		double higherNumber = 0;
		double lowerNumber = 0;
		double midNumber = 0;
		int higherPosition = 0;

		for (int i = 0; i < vect.length; i++) {
			midNumber = vect[i];
			if (midNumber > lowerNumber) {
				lowerNumber = midNumber;
				higherNumber = lowerNumber;
				higherPosition = i;
			}
		}
		System.out.println("Maior valor: " + higherNumber);
		System.out.print("Posição do Maior Valor: " + higherPosition);

		sc.close();
	}

}
