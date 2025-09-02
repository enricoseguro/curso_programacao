package curso_programacao;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {

		int num;
		System.out.println("Digite um número inteiro.");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (num < 0) {
			System.out.println("Número Negativo.");
		} else if (num == 0) {
			System.out.println("Número Nulo.");
		} else {
			System.out.println("Número Positivo.");
		}

		sc.close();

	}

}
