package application;

import java.util.Scanner;

import entities.Student;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();

		Student vect[] = new Student[n];
		System.out.println("Digite os dados dos alunos: ");

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Nota 1°: ");
			double grade1 = sc.nextDouble();
			System.out.print("Nota 2°: ");
			double grade2 = sc.nextDouble();
			vect[i] = new Student(name, grade1, grade2);
		}

		String studentName;
		double average = 0;
		double denominator = 2;

		System.out.println("Alunos Aprovados:");
		for (int i = 0; i < vect.length; i++) {
			average = (vect[i].getGrade1() + vect[i].getGrade2()) / denominator;
			if (average >= 6.0) {
				studentName = vect[i].getName();
				System.out.println(studentName);
			}
		}

		sc.close();
	}

}
