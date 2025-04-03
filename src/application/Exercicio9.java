package application;

import java.util.Scanner;

import entities.People;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de pessoas: ");
		int n = sc.nextInt();

		People vect[] = new People[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite os dados da pessoa: ");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			vect[i] = new People(name, age);
		}

		String nameOlderPeople;
		int ageOlderPeople = 0;
		int ageYoungerPeople = 0;
		int positionOlderPeople = 0;

		for (int i = 0; i < vect.length; i++) {
			ageYoungerPeople = vect[i].getAge();
			if (ageYoungerPeople > ageOlderPeople) {
				ageOlderPeople = ageYoungerPeople;
				positionOlderPeople = i;
			}
		}

		for (int i = 0; i < vect.length; i++) {
			if (i == positionOlderPeople) {
				nameOlderPeople = vect[i].getName();
				System.out.print("Pessoa mais velha: " + nameOlderPeople);
			}
		}

		sc.close();
	}

}
