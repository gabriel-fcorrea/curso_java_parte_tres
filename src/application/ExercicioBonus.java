package application;

import java.util.Scanner;

import entities.Rent;

public class ExercicioBonus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Rent[] vect = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();

			vect[roomNumber] = new Rent(name, email); // o objeto está sendo instanciado no local correto do vetor de
														// quartos, atribuindo automaticamente a posição do quarto
		}

		System.out.println("Busy rooms: ");

		for (int i = 0; i < 10; i++) {

			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}

		}

		sc.close();
	}

}
