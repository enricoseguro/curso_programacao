package curso_programacao;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {

		// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		
		Scanner sc = new Scanner(System.in);
		int num;
		double hora, hrSalario, totSalario;
		System.out.println("Digite o número do funcionário: ");
		num = sc.nextInt();
		System.out.println("Digite seu número de horas trabalhadas: ");
		hora = sc.nextDouble();
		System.out.println("Digite o valor que recebe por horas trabalhadas: ");
		hrSalario = sc.nextDouble();
		totSalario = hrSalario * hora;
		System.out.printf("Funcionário nº: %d%n", num);
		System.out.printf("Salário = %.2f", totSalario);
		
		sc.close();

	}
}
