package curso_programacao;

import java.util.Scanner;

public class ex013 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		double y;
		
		System.out.println("Digite o valor de x.");
		x = sc.nextDouble();
		System.out.println("Digite o valor de y.");
		y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem.");
		} else {
			if (x == 0.0) {
				System.out.println("Eixo Y.");
			} else if (y == 0.0) {
				System.out.println("Eixo X.");
			} else if (x > 0.0 && y > 0.0) {
				System.out.println("Q1");
			} else if (x < 0.0 && y > 0.0) {
				System.out.println("Q2");
			} else if (x < 0.0 && y < 0.0) {
				System.out.println("Q3");
			} else if (x > 0.0 && y < 0.0) {
				System.out.println("Q4");
			}
		}
	}
}