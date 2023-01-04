package exercicio06.secao04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("*** LOJA DE PEÇAS ***");
		System.out.println();
		System.out.print("Insira o código, quantidade e valor da peça 1, nessa respectiva ordem: ");
		float codigoPeca1 = sc.nextFloat();
		float qntdePecas1 = sc.nextFloat();
		float valorPeca1 = sc.nextFloat();

		System.out.print("Insira o código, quantidade e valor da peça 2, nessa respectiva ordem: ");
		float codigoPeca2 = sc.nextFloat();
		float qntdePecas2 = sc.nextFloat();
		float valorPeca2 = sc.nextFloat();

		float total = qntdePecas1 * valorPeca1 + qntdePecas2 * valorPeca2;

		System.out.println();

		System.out.printf("VALOR A PAGAR: U$ %.2f", total);
	}
}
