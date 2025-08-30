package curso_programacao;

import java.util.Scanner;

public class teste01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		int r = 0;
		int op;

		System.out.println("=======================");
		System.out.println("Calculadora do Enrico");
		System.out.println("=======================");

		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();

		do {

			System.out.println("=======================");
			System.out.println("Escolha a sua operação: ");
			System.out.println("Adição [1]");
			System.out.println("Subtração [2]");
			System.out.println("Multiplicação [3]");
			System.out.println("Divisão [4]");
			System.out.println("Mudar números [5]");
			System.out.println("Sair [6]");			
			System.out.println("=======================");
			
			r = sc.nextInt();

			switch (r) {
			case 1:
				op = n1 + n2;
				System.out.println(n1 + " + " + n2 + " = " + op);
				break;
			case 2:
				op = n1 - n2;
				System.out.println(n1 + " - " + n2 + " = " + op);
				break;
			case 3:
				op = n1 * n2;
				System.out.println(n1 + " x " + n2 + " = " + op);
				break;
			case 4:
				op = n1 / n2;
				System.out.println(n1 + " / " + n2 + " = " + op);
				break;
			case 5:
				System.out.println("Digite o primeiro número: ");
				n1 = sc.nextInt();
				System.out.println("Digite o segundo número: ");
				n2 = sc.nextInt();
				break;
			case 6:
				break;
			default:
				System.out.println("Digite um número válido.");
				break;

			}
		} while (r != 6);
		
		System.out.println("=======================================");
		System.out.println("Calculadora encerrada!! Volte Sempre!!");
		System.out.println("=======================================");

	}

}
