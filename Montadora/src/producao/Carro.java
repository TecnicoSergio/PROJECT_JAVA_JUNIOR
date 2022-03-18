package producao;

public class Carro {
	
	private String marca;
	private String modelo;
	private int numPassageiros;
	private int capacidadeCombustivel;
	private double consumoCombustivel;
	
	
	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}
	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumPassageiros() {
		return numPassageiros;
	}
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	public int getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}
	public void setCapacidadeCombustivel(int capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}
	
	public void exibirAutonomia(double resul) {
		double resultado = (capacidadeCombustivel * consumoCombustivel);
		
		System.out.println("A autonomia do seu automovel com tanque cheio é:" + resultado);
	}
	
	

}
