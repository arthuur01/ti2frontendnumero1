package numeroum;


import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Primeiro Numero:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int soma = num1 + num2;
		
		System.out.println(soma);
		sc.close();
	}
}
