package model;

public abstract class Arco {

	String vertice;
	
	public Arco(String vertice) {
		this.vertice = vertice;
	}

	public String getVertice() {
		return vertice;
	}

	public void setVertice(String vertice) {
		this.vertice = vertice;
	}
	
	@Override
	protected abstract Object clone();
	
	
}
