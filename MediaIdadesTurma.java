package com.vitorcamara.projetos;

import java.util.Scanner;

public class MediaIdadesTurma {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Quantas pessoas na turma?");
		int qPessoas = scan.nextInt();

		double soma = 0;
		double media = 0;
		double idade = 0;

		for (int i = 0; i < qPessoas; i++) {
			System.out.println("Entre com a idade " + (i + 1) + "º:"); // aqui será pedido a idade de todas as pessoas
			idade = scan.nextDouble();

			soma += idade; // recebendo e somando todas as idades

		}

		media = soma / qPessoas;

		System.out.println("Media das idades: " + media);

		if (media > 0 && media <= 25) {
			System.out.println("Média menor que 25 anos: turma jovem.");
		} else if (media >= 26 && media <= 60) {
			System.out.println("Média entre 26 e 60 anos: turma adulta.");
		} else if (media > 60) {
			System.out.println("Média maior que 60 anos: turma idosa.");
		}

	}

}
