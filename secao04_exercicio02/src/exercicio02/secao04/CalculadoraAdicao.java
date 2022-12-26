package exercicio02.secao04;

import java.util.Scanner;

public class CalculadoraAdicao {

	public static void main(String[] args) {
		// Cria um objeto Scanner para ler os dados inseridos pelo usuário
		Scanner sc = new Scanner(System.in);

		// Declara as variáveis que irão armazenar os valores inseridos pelo usuário
		// e o resultado da adição
		int valor1, valor2, resultado;

		// Exibe a mensagem de boas-vindas na tela
		System.out.println("*** CALCULADORA DE ADIÇÃO ***");
		// Deixa uma linha em branco
		System.out.println();

		// Solicita o primeiro valor ao usuário e armazena na variável
		System.out.print("Insira o primeiro valor: ");
		valor1 = sc.nextInt();

		// Solicita o segundo valor ao usuário e armazena na variável
		System.out.print("Insira o segundo valor: ");
		valor2 = sc.nextInt();

		// Fecha o objeto Scanner
		sc.close();

		// Calcula a soma dos valores inseridos pelo usuário
		resultado = valor1 + valor2;

		// Deixa uma linha em branco
		System.out.println();

		// Exibe o resultado da adição
		System.out.printf("SOMA = %d", resultado);
	}
}
