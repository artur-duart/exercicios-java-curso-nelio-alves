package exercicio01.secao04;

import java.util.Locale;
import java.text.DecimalFormat;

public class Exercicio {

	private static final DecimalFormat df = new DecimalFormat("#.###");

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s, wich price is R$ %.2f %n", product1, price1);
		System.out.printf("%s, wich price is R$ %.2f %n", product2, price2);

		System.out.println();

		System.out.printf("Record: %d years old, code %d and gender: %c %n", age, code, gender);

		System.out.println();

		System.out.printf("Measure with eight decimal places: %.8f %n", measure);
		System.out.print("Rounded (three decimal places): " + df.format(measure));

		System.out.println();

		Locale.setDefault(Locale.US);
		System.out.print("US decimal point: " + df.format(measure));

	}
}
