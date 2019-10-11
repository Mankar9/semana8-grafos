import java.util.ArrayList;

import factory.GrafoFactory;
import model.*;
import searchStrategy.*;

public class MainNoDirigidoConPeso {

	public static void main(String[] args) {
		
		//Grafo<ArcoPeso> grafo = (Grafo<ArcoPeso>) GrafoFactory.crearGrafo(GrafoFactory.Tipo1.GRAFO_DIRIGIDO);
		Grafo<ArcoPeso> grafo = new GrafoNoDirigido<>();
		
		//-----------------------
		// Vértices
		//-----------------------
		grafo.crearVertice("1");
		grafo.crearVertice("2");
		grafo.crearVertice("3");
		grafo.crearVertice("4");
		grafo.crearVertice("5");
		grafo.crearVertice("6");
		
		//-----------------------
		// Arcos
		//-----------------------
		grafo.crearArco("1", new ArcoPeso("2", 1));
		grafo.crearArco("1", new ArcoPeso("4", 2));
		grafo.crearArco("2", new ArcoPeso("5", 3));
		grafo.crearArco("3", new ArcoPeso("5", 4));
		grafo.crearArco("3", new ArcoPeso("6", 2));
		grafo.crearArco("4", new ArcoPeso("2", 5));
		grafo.crearArco("5", new ArcoPeso("4", 1));
		grafo.crearArco("6", new ArcoPeso("6", 1));
				
		grafo.imprimir();
		
		grafo.setBusqueda(new DFS());
		grafo.buscarRuta("1", "6");

	}

}