package exercicio05.secao04;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		// Define a localidade padrão como US para garantir que os valores de ponto
		// flutuante sejam lidos corretamente.
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		// Solicita os dados de entrada ao usuário.
		System.out.println("*** CÁLCULADORA DE SALÁRIO ***");
		System.out.println();
		System.out.print("Insira seu número de funcionário: ");
		int numeroFuncionario = sc.nextInt();
		System.out.print("Insira a quantidade de horas trabalhadas: ");
		float horasTrabalhadas = sc.nextFloat();
		System.out.print("Insira quanto você recebe por hora: ");
		float valorHora = sc.nextFloat();

		// Verifica se os valores inseridos pelo usuário são válidos.
		if (horasTrabalhadas < 0 || valorHora < 0) {
			System.out.println("O número de horas trabalhadas e o valor por hora devem ser positivos.");
			return;
		}

		// Calcula o salário do funcionário.
		float salarioFuncionario = horasTrabalhadas * valorHora;

		// Exibe o resultado ao usuário.
		System.out.println();
		System.out.printf("NUMBER = %d", numeroFuncionario);
		System.out.println();
		System.out.printf("SALARY = U$ %.2f", salarioFuncionario);

		// Fecha o Scanner para liberar os recursos do sistema.
		sc.close();
	}
}
