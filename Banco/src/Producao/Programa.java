package Producao;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta;
		conta = new Conta();
		
		conta.setNumConta(121321);
		conta.setNome("Duda RS");
		conta.setSaldo(50.000);
		conta.setLimite(1.254500);
		
		double deposito = 50.00;
		conta.exibirDeposito(deposito);
		
		double sacar = 20.00;
		conta.sacar(sacar);
		
		
		
		System.out.println("Nome: " + conta.getNome() + "\n" 
		+ "Numero da Conta:" + conta.getNumConta() + "\n" + "Seu Saldo: " 
				+ conta.getSaldo() + "\n" + "Seu Limite da Conta:" 
		+ conta.getLimite() + "\n");

	}

}
