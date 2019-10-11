package model;

public class ArcoPeso extends Arco {

	int peso;
	
	public ArcoPeso(String vertice, int peso) {
		super(vertice);
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return vertice + "(" + peso + ")";
	}

	@Override
	protected Object clone() {
		return new ArcoPeso(vertice, peso);
	}
	
	
	
	
}
