package searchStrategy;

public class NoBusqueda implements Busqueda {

	@Override
	public void algoritmoBusqueda(String origen, String destino) {
		System.out.println("Este grafo no ha sido configurado con ning�n algoritmo de b�squeda");
	}

	
}
