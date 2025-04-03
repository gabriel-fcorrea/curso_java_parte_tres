package application;

import java.util.Scanner;

import entities.Height;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão inseridas? ");
		int n = sc.nextInt();

		Height vect[] = new Height[n];
		sc.nextLine();

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Insira os dados abaixo.");
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			System.out.print("Gênero: ");
			sc.nextLine();
			char gender = sc.nextLine().charAt(0);
			vect[i] = new Height(height, gender);
		}

		double lowerHeight = vect[0].getHeight();
		double higherHeight = vect[0].getHeight();
		char gender;
		double womanHeight = 0;
		double averageWomanHeight = 0;
		int amountMen = 0;
		double denominator = 0;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getHeight() < lowerHeight) {
				lowerHeight = vect[i].getHeight();
			}
		}

		System.out.println("Menor altura: " + lowerHeight);

		for (int i = 0; i < vect.length; i++) {
			lowerHeight = vect[i].getHeight();
			if (lowerHeight > higherHeight) {
				higherHeight = lowerHeight;
			}
			gender = vect[i].getGender();
			if (gender == 'F' || gender == 'f') {
				womanHeight += vect[i].getHeight();
				denominator++;
			}
			if (gender == 'm' || gender == 'M')
				amountMen++;
		}
		System.out.println("Maior altura: " + higherHeight);

		averageWomanHeight = womanHeight / denominator;
		System.out.printf("Média das alturas das mulheres: %.2f%n", averageWomanHeight);

		System.out.print("Número de homens: " + amountMen);

		sc.close();
	}

}
