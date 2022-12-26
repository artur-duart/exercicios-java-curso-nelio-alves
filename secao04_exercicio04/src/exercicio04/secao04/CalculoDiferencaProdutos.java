package exercicio04.secao04;

import java.util.Scanner;

public class CalculoDiferencaProdutos {

	public static void main(String[] args) {
		// Cria um Scanner para ler os valores de entrada fornecidos pelo usuário
		Scanner sc = new Scanner(System.in);
		// Declara as variáveis a, b, c e d, que armazenarão os valores de entrada
		int a, b, c, d;

		// Exibe o título do programa na saída padrão
		System.out.println("*** CÁLCULO DA DIFERENÇA DO PRODUTO DE A E B PELO PRODUTO DE C E D ***");
		// Adiciona uma linha em branco após o título
		System.out.println();

		// Solicita o primeiro valor ao usuário e armazena o resultado na variável a
		System.out.print("Insira o primeiro valor: ");
		a = sc.nextInt();

		// Solicita o segundo valor ao usuário e armazena o resultado na variável b
		System.out.print("Insira o segundo valor: ");
		b = sc.nextInt();

		// Solicita o terceiro valor ao usuário e armazena o resultado na variável c
		System.out.print("Insira o terceiro valor: ");
		c = sc.nextInt();

		// Solicita o quarto valor ao usuário e armazena o resultado na variável d
		System.out.print("Insira o quarto valor: ");
		d = sc.nextInt();

		// Calcula a diferença entre o produto de a e b e o produto de c e d e armazena
		// o resultado na variável diferenca
		int diferenca = (a * b - c * d);

		// Fecha o Scanner
		sc.close();

		// Adiciona uma linha em branco após o cálculo da diferença
		System.out.println();

		// Exibe o resultado da diferença na saída padrão
		System.out.printf("DIFERENÇA = %d", diferenca);
	}
}
