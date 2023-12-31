package EntidadesAbstratos;

import EntidadesAbstratos.enums.Cores;

public class Circulo  extends Forma{
	
	private Double raio;
	
	public Circulo() {
	}

	public Circulo(Cores cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
}
