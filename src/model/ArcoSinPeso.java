package model;

public class ArcoSinPeso extends Arco {

	public ArcoSinPeso(String vertice) {
		super(vertice);
	}
	
	@Override
	protected Object clone() {
		return new ArcoSinPeso(vertice);
	}
	
	@Override
	public String toString() {
		return vertice;
	}
	
}
