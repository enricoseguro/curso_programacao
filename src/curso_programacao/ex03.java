package curso_programacao;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {

		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * 
		 * Fórmula da área: area = π . raio2
		 * 
		 * Considere o valor de π = 3.14159
		 */
		double r, area, r2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o raio de um círculo: ");
		r = sc.nextDouble();
		r2 = Math.pow(r, 2);
		area = 3.14159 * r2;
		System.out.printf("A área deste círculo com o raio de %.4f é %.4f", r, area);

		sc.close();

	}

}
