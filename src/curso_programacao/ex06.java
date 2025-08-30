package curso_programacao;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		//Faça um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule o valor a ser pago.
		
		int codPeca1, numPeca1, codPeca2, numPeca2;
		double valorPeca1, valorPeca2, totPeca1, totPeca2, totPagar;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código, a quantidade e o valor da peça 1: ");
		codPeca1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		System.out.println("Digite o código, a quantidade e o valor da peça 2: ");
		codPeca2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		totPeca1 = (double) valorPeca1 * numPeca1;
		totPeca2 = (double) valorPeca2 * numPeca2;
		totPagar = totPeca1 + totPeca2;
		System.out.printf("O Valor total a pagar por todas as compras: R$ %.2f", totPagar);
	}

}
