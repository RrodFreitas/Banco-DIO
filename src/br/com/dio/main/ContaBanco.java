package br.com.dio.main;

import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, digite o n�mero da Ag�ncia: ");
		int numeroAgencia = scanner.nextInt();
		
		System.out.println("\nInforme o n�mero de sua conta? ");
		double numeroConta = scanner.nextDouble();
		
		System.out.println("\nInforme o seu nome: ");
		String nome = scanner.next();
		
		System.out.println("\nQual o valor para deposito? ");
		double saldo = scanner.nextDouble();
		
		/* Caso o n�mero da ag�ncia e da conta estejam certos.. ai teremos os dados do cli�nte
		 * sendo impressos a baixo */
		if(numeroAgencia == 1021 & numeroConta == 602240) {
			System.out.println("\nBem-vindo " + nome + ", Obrigado(a) por criar uma conta em nosso banco, sua ag�ncia �: " + numeroAgencia + ", conta: " + numeroConta +
					", e seu saldo " + saldo + " j� est� dispon�vel para saque!!");
		} else { 
			System.out.println("Bem-vindo " + nome + ", as informa��es digitadas n�o conferem lamentamos o inconviniente!!");
		}
		scanner.close();

	}

}
