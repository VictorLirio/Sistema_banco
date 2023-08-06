package Banco;

public class Conta {
	private int numero;
	private String nome;
	private double saldo;
	
	public Conta(int numero, String nome, double DepositoInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(DepositoInicial);
	}
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	
	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double entrada) {
		saldo += entrada;
	}
	
	public void saque(double entrada) {
		saldo -= entrada + 5.00;
	}

	public String toString() {
		return "conta " 
					+ numero
					+ ", nome: "
					+ nome 
					+ ", saldo: "
					+ String.format("%.2f", saldo);
	}
	

	
	
	
	
	
	
	
}
