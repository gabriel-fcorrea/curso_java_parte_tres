package application;

import java.util.Scanner;

import entities.Product;

public class Vector {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de produtos: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite o nome do produto: ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.print("Digite o preço do produto: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}

		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPrice(); // usa-se o get para coletar apenas os preços dos produtos
		}
		double media = soma / vect.length;

		System.out.printf("A média de preço é: R$ %.2f", media);

		sc.close();
	}
}
