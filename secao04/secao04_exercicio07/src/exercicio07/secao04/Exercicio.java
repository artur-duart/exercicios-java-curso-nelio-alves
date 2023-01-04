package exercicio07.secao04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("*** CALCULADORA DE ÁREA ***");
		System.out.println();

		System.out.print("Insira três valores, seperando-os por espaço: ");
		float valor1 = sc.nextFloat();
		float valor2 = sc.nextFloat();
		float valor3 = sc.nextFloat();

		System.out.println();

		float triangulo = (valor1 * valor3) / 2;
		double circulo = Math.PI * Math.pow(valor3, 2);
		float trapezio = (valor1 + valor2) * valor3 / 2;
		double quadrado = Math.pow(valor2, 2);
		float retangulo = valor1 * valor2;

		sc.close();

		System.out.printf("TRIANGULO: %.3f %n", triangulo);
		System.out.printf("CIRCULO: %.3f %n", circulo);
		System.out.printf("TRAPEZIO: %.3f %n", trapezio);
		System.out.printf("QUADRADO: %.3f %n", quadrado);
		System.out.printf("RETANGULO: %.3f %n", retangulo);

	}
}
