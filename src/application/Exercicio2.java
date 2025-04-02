package application;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de números: ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}

		System.out.print("Valores: ");
		double value = 0;
		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			value = vect[i];
			soma += vect[i];
			System.out.print(value + "   ");
		}
		double media = soma / n;

		System.out.printf("%nSoma: %.2f%n", soma);
		System.out.printf("Média: %.2f", media);

		sc.close();
	}

}
