package EntidadesAbstratos;

import EntidadesAbstratos.enums.Cores;

public abstract class Forma {

	private Cores cor;

	public Forma() {
		
	}
	
	public Forma(Cores cor) {
		this.cor = cor;
	}

	public Cores getCor() {
		return cor;
	}

	public void setCor(Cores cor) {
		this.cor = cor;
	}
	
	public abstract double area(); //se o método for abstract a classe tambem deve ser

	
}
