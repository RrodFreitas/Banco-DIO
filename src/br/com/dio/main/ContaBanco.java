package br.com.dio.main;

import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, digite o número da Agência: ");
		int numeroAgencia = scanner.nextInt();
		
		System.out.println("\nInforme o número de sua conta? ");
		double numeroConta = scanner.nextDouble();
		
		System.out.println("\nInforme o seu nome: ");
		String nome = scanner.next();
		
		System.out.println("\nQual o valor para deposito? ");
		double saldo = scanner.nextDouble();
		
		/* Caso o número da agência e da conta estejam certos.. ai teremos os dados do cliênte
		 * sendo impressos a baixo */
		if(numeroAgencia == 1021 & numeroConta == 602240) {
			System.out.println("\nBem-vindo " + nome + ", Obrigado(a) por criar uma conta em nosso banco, sua agência é: " + numeroAgencia + ", conta: " + numeroConta +
					", e seu saldo " + saldo + " já está disponível para saque!!");
		} else { 
			System.out.println("Bem-vindo " + nome + ", as informações digitadas não conferem lamentamos o inconviniente!!");
		}
		scanner.close();

	}

}
