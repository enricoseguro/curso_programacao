package curso_programacao;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		int a, b, c, d;
		int diferenca;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 4 números: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		diferenca = a * b - c * d;
		System.out.println("A diferença é " + diferenca);
	}

}
