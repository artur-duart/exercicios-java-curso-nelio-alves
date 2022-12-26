package exercicio02.secao04;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int valor1, valor2, resultado;

		System.out.println("*** CALCULADORA DE ADIÇÃO ***");
		System.out.println();

		System.out.print("Insira o primeiro valor: ");
		valor1 = sc.nextInt();

		System.out.print("Insira o segundo valor: ");
		valor2 = sc.nextInt();

		sc.close();

		resultado = valor1 + valor2;

		System.out.println();
		System.out.printf("SOMA = %d", resultado);

	}

}
