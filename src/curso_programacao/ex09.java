package curso_programacao;

import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {
		
		int num;
		System.out.println("Digite um número para saber se ele é par ou ímpar.");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("O número digitado é par.");
		} else {
			System.out.println("O número digitado é ímpar.");
		}
		
		sc.close();

		
	}
}
