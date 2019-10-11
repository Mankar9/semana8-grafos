import factory.GrafoFactory;
import model.*;
import searchStrategy.*;

public class MainDirigidoSinPeso {

	public static void main(String[] args) {
		
		//Grafo<ArcoSinPeso> grafo = (Grafo<ArcoSinPeso>) GrafoFactory.crearGrafo(GrafoFactory.Tipo1.GRAFO_DIRIGIDO);
		Grafo<ArcoSinPeso> grafo = new GrafoDirigido<>();
		
		//-----------------------
		// V�rtices
		//-----------------------
		grafo.crearVertice("1");
		grafo.crearVertice("2");
		grafo.crearVertice("3");
		grafo.crearVertice("4");
		grafo.crearVertice("5");
		
		//-----------------------
		// Arcos
		//-----------------------
		grafo.crearArco("1", new ArcoSinPeso("2"));
		grafo.crearArco("1", new ArcoSinPeso("4"));
		grafo.crearArco("2", new ArcoSinPeso("3"));
		grafo.crearArco("2", new ArcoSinPeso("4"));
		grafo.crearArco("2", new ArcoSinPeso("5"));
		grafo.crearArco("3", new ArcoSinPeso("5"));
		grafo.crearArco("4", new ArcoSinPeso("5"));
				
		grafo.imprimir();
		
		grafo.setBusqueda(new DFS());
		grafo.buscarRuta("1", "6");

	}

}