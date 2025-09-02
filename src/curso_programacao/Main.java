package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		int y = 32;
		double x = 10.35784;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(new Locale("pt", "BR"));
		System.out.printf("%.4f%n", x);
		System.out.println("Bom dia!");
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		/*
		 * %f = ponto flutuante %d = inteiro %s = texto %n = quebra de linha
		 */
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}

}