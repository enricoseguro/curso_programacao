package curso_programacao;

import java.util.Scanner;

public class ex010 {

	public static void main(String[] args) {

		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número.");
		a = sc.nextInt();
		System.out.println("Digite o segundo número.");
		b = sc.nextInt();
		if (a > b) {
			if (a % b == 0) {
				System.out.println("Os números digitados são múltiplos entre si.");
			} else {
				System.out.println("Os número digitados não são múltiplos.");
			}
		} else {
			if (b % a == 0) {
				System.out.println("Os números digitados são múltiplos entre si.");
			} else {
				System.out.println("Os números digitados não são múltiplos.");
			}
		}
		
	}

}
