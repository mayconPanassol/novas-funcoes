package novasFuncoes;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com um numero inteiro: ");

		double num = sc.nextDouble();

		System.out.println("O numero é: " + verificador(num));

		sc.close();

	}

	public static String verificador(double num) {

		String aux;

		if (num % 2 == 1) {
			aux = "impar";
		} else {
			aux = "par";
		}
		return aux;

	}

}
