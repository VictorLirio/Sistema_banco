package application;
import java.util.Locale;
import java.util.Scanner;

import Banco.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Conta conta;
		//Entrada dos primeiros dados da conta
		System.out.println("Entre com o numero da conta: ");
		int numero = sc.nextInt();
		System.out.println("Entre com o nome da conta");
		sc.nextLine();
		String nome = sc.nextLine();
		//O usuario irá decidir se deseja depositar um primeiro valor
		System.out.println("Você deseja depositar um valor inicial (s/n)? ");
		char resposta1 = sc.next().charAt(0);
		//Se a resposta do usuario for "s" o programa ira intrepretar que o usuario deseja inserir um valor inicial
		if (resposta1 == 's') {
			System.out.println("Entre com o valor inicial: ");
			double DepositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, DepositoInicial);
			//Caso a resposta for "n" o programa ira apenas preencher um saldo da conta com 0
		}else {
			conta = new Conta(numero, nome);
		} 
		
		System.out.println();
		//Aqui será impresso o dados da conta, "Numero da conta, Nome da conta, Saldo da conta"
		System.out.println("Dados da conta: ");
		System.out.println(conta);

		System.out.println();
		//O usuario irá decidir se deseja depositar um valor
		System.out.println("Você deseja depositar um valor (s/n)? ");
		char resposta2 = sc.next().charAt(0);
		//Se a resposta do usuario for "s" o programa ira intrepretar que o usuario deseja inserir um valor para deposito
		if (resposta2 == 's') {
			System.out.println("Insira um valor : ");
			double valorDeposito = sc.nextDouble();
			conta.deposito(valorDeposito);
		}

		System.out.println();
		//Aqui será impresso o dados da conta atualizado (Se o usuario não inserir um valor de deposito, o dados continuaram o mesmo), "Numero da conta, Nome da conta, Saldo da conta"
		System.out.println("Dados atualizados: ");
		System.out.println(conta);


		System.out.println();
		//O usuario irá decidir se deseja sacar um valor
		System.out.println("Você deseja sacar um valor (s/n)? ");
		char resposta3 = sc.next().charAt(0);
		//Se a resposta do usuario for "s" o programa ira intrepretar que o usuario deseja sacar um valor da sua conta (Será cobrado um valor de $5.00 por saque)
		if (resposta3 == 's') {
			System.out.println("Insira um valor para saque: ");
			double valorSaque = sc.nextDouble();
			conta.saque(valorSaque);
		}

		System.out.println();
		//Aqui será impresso o dados da conta atualizado (A soma do deposito inicial + deposito - saque(- $5.00) )
		System.out.println("Dados atualizados: ");
		System.out.println(conta);
		
		sc.close();
	}

}
