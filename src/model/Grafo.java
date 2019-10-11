package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import searchStrategy.*;

public abstract class Grafo<A extends Arco> {
	
	public class Vertice {
		String nombre;
		ArrayList<A> listaAdj = new ArrayList<>();

		public Vertice(String nombre) { 
			this.nombre = nombre; 
			this.listaAdj = new ArrayList<A>();
		}
		public String getNombre() { return nombre; }
		public void setNombre(String nombre) { this.nombre = nombre; }
		public ArrayList<A> getListaAdj() { return listaAdj; }
		public void setListaAdj(ArrayList<A> listaAdj) { this.listaAdj = listaAdj; }
	}

	protected HashMap<String, Vertice> vertices = new HashMap<>();
	
	private Busqueda busqueda = new NoBusqueda(); //Por defecto no realiza ninguna búsqueda
	
	public Busqueda getBusqueda() {
		return busqueda;
	}
	public void setBusqueda(Busqueda busqueda) {
		this.busqueda = busqueda;
	}
	
	public void buscarRuta(String origen, String destino) {
		busqueda.algoritmoBusqueda(origen, destino);
	}
	
	public void crearVertice(String nombre) {
		Vertice v = new Vertice(nombre);
		vertices.put(nombre, v);
	}
	
	public void eliminarVertice(String nombre) {
		// TODO Auto-generated method stub
	}
	
	public void imprimir() {
		
		for (Vertice v : vertices.values()) {
			System.out.print("Vértice: " + v.getNombre());
			System.out.print(" - Arcos: ");
			
			if (v.getListaAdj().size() == 0) {
				System.out.print("[Ninguno]");
			} else {
				for (int i = 0; i < v.getListaAdj().size(); i++) {
					System.out.print(v.getListaAdj().get(i) + " ");
				}
			}
			System.out.println();
		}
	}
	
	public abstract void crearArco(String vertice, A arco);
	public abstract void eliminarArco(A arco);
	
	
}
