package exercicio03.secao04;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraCircunferencia {

	private static final double PI = Math.PI;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		// Declara a variável que irá armazenar o valor do raio
		float valorRaio;

		// Cria um objeto Scanner para ler os dados inseridos pelo usuário
		Scanner entrada = new Scanner(System.in);

		// Exibe a mensagem de boas-vindas na tela
		System.out.println("*** CALCULADORA DE ÁREA DE CIRCUNFERÊNCIA ***");
		System.out.println();

		// Solicita o valor do raio ao usuário e armazena na variável
		System.out.print("Insira o valor do raio da circunferência: ");
		valorRaio = entrada.nextFloat();

		// Verifica se o valor do raio é negativo e, se for, exibe uma mensagem de erro
		// e interrompe o programa
		if (valorRaio < 0) {
			System.out.println("Erro: o valor do raio não pode ser negativo!");
			return;
		}

		// Calcula a área da circunferência utilizando o valor do raio
		double valorArea = calcularValorArea(valorRaio);

		// Fecha o objeto Scanner
		entrada.close();

		// Exibe o valor da área da circunferência
		imprimirValorArea(valorArea);
	}

	// Método para calcular o valor da área da circunferência
	public static double calcularValorArea(float raio) {
		// Calcula a área da circunferência
		double area = PI * Math.pow(raio, 2);

		// Retorna o valor da área da circunferência
		return area;
	}

	// Método para exibir o valor da área da circunferência
	public static void imprimirValorArea(double area) {
		// Exibe o valor da área da circunferência com quatro casas decimais
		System.out.printf("A = %.4f", area);
	}
}
