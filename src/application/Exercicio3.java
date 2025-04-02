package application;

import java.util.Scanner;

import entities.People;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de pessoas: ");
		int n = sc.nextInt();

		People[] vect = new People[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			vect[i] = new People(name, age, height);
		}

		String name;
		double sumHeight = 0; // soma das alturas
		double averageHeight = 0; // média das alturas
		int underSixteen = 0; // menores de 16
		double percentHeight = 0; // percentual total dos menores de 16
		double percentSum = 0; // soma da quantidade de menores de 16

		for (int i = 0; i < vect.length; i++) {
			sumHeight += vect[i].getHeight();
			underSixteen = vect[i].getAge();
			if (underSixteen < 16) {
				percentSum += 1;
			}
		}

		averageHeight = sumHeight / n;
		System.out.printf("Altura média: %.2f%n", averageHeight);

		percentHeight = (percentSum / n) * 100;
		System.out.println("Pessoas com menos de 16 anos: " + percentHeight + "%");

		for (int i = 0; i < vect.length; i++) {
			name = vect[i].getName();
			underSixteen = vect[i].getAge();
			if (underSixteen < 16) {
				System.out.println(name);
			}
		}

		sc.close();

	}
}
