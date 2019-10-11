package model;

public class GrafoNoDirigido<A extends Arco> extends Grafo<A> {

	public GrafoNoDirigido() {
		super();
	}

	@Override
	public void crearArco(String vertice, A arco) {
		Vertice v1 = vertices.get(vertice);
		v1.getListaAdj().add(arco);
		
		if (vertice.equals(arco.getVertice())) {return;}
		
		Vertice v2 = vertices.get(arco.getVertice());
		A arco2 = (A) arco.clone();
		arco2.setVertice(vertice);
		v2.getListaAdj().add(arco2);
	}

	@Override
	public void eliminarArco(A arco) {
		// TODO Auto-generated method stub
	}

}
