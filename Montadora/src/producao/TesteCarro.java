package producao;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro civic;
		civic = new Carro();
		
		civic.setMarca("Honda");
		civic.setModelo("1.5 16v automatico");
		civic.setNumPassageiros(5);
		civic.setCapacidadeCombustivel(30);
		civic.setConsumoCombustivel(9.5);
		//civic.exibirAutonomia(result);
		
		double resultado = 8.4;
		civic.exibirAutonomia(resultado);
		
		System.out.println("Marca: " + civic.getMarca() + "\n" 
		+ "Modelo" + civic.getModelo() + "\n" 
		+ "Numero de Passageiros:" + civic.getNumPassageiros() + "\n" 
		+ "Capacidade do Combustivel" + civic.getCapacidadeCombustivel() + "\n" 
		+ "Consumo do Combustivel: " + civic.getCapacidadeCombustivel() + "\n");
		
		
		

	}

}
