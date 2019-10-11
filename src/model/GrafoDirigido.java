package model;

public class GrafoDirigido<A extends Arco> extends Grafo<A> {

	@Override
	public void crearArco(String vertice, A arco) {
		Vertice v1 = vertices.get(vertice);
		v1.getListaAdj().add(arco);
	}

	@Override
	public void eliminarArco(A arco) {
		// TODO Auto-generated method stub
	}





	
	
}
