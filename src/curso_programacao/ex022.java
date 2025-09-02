package curso_programacao;

import java.util.Scanner;

public class ex022 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fat = 1;
		
		System.out.print(n + ("! = "));
		
		for (int i = 1; i <= n; i++) {
			
			fat *= i;			
			System.out.print(fat);

			
		}
		
		sc.close();
		
	}

}
