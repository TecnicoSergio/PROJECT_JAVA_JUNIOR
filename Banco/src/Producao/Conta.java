package Producao;

public class Conta {
	
	private int numConta;
	private String nome;
	private double saldo;
	private double limite;
	
	
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
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
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void exibirDeposito(double depos) {
		double deposito =(this.limite + saldo);
		System.out.println("O valor da sua CONTA ?:" + deposito);
	}
	
	public void sacar(double saq) {
		double sacardin = (this.saldo - limite);
		
		System.out.println("O valor do saque ? : " + sacardin);
	}
	

}
