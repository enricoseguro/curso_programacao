package curso_programacao;

import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
		
		/*Faça um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
		 * a) a área do triângulo que tem A por base c C por altura.
		 * b) a área do círculo de raio C. (pi = 3.14159).
		 * c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B.
		 * e) a área do retângulo que tem lados A e B.
		 */
		
		// Sistema de entrada de dados
		Scanner sc = new Scanner(System.in);
		
		// Variáveis
		double a, b, c;
		
		// Saída de dados
		System.out.println("Digite os três valores de ponto flutuante.");
		
		// Entrada de dados
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		// Cálculo área do triângulo
		double areaTri;
		areaTri = a * c / 2;
		
		// Cálculo área do círculo
		double areaCir;
		areaCir = 3.14159 * Math.pow(c, 2);
		
		// Cálcula área do trapézio
		double areaTra;
		areaTra = (a + b) * c / 2;
		
		// Cálcula área do quadrado
		double areaQua;
		areaQua = Math.pow(b, 2);
		
		// Cálcula área do retângulo
		double areaRet;
		areaRet = a * b;
		
		// Saída de dados
		System.out.println("TRIÂNGULO: " + String.format("%.3f", areaTri));
		System.out.println("CÍRCULO: " + String.format("%.3f", areaCir));
		System.out.println("TRAPÉZIO: " + String.format("%.3f", areaTra));
		System.out.println("QUADRADO: " + String.format("%.3f", areaQua));
		System.out.println("RETÂNGULO: " + String.format("%.3f", areaRet));
		
		sc.close();

	}
	

}
