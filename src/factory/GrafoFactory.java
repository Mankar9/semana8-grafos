package factory;

import model.*;


public class GrafoFactory {
	
	public enum Tipo1 {
		GRAFO_DIRIGIDO,
		GRAFO_NO_DIRIGIDO
		};
		
	public enum Tipo2 {
		ARCOS_CON_PESOS,
		ARCOS_SIN_PESOS
	};
	
	public static Grafo crearGrafo(Tipo1 tipo1) {
		
		if (tipo1 == Tipo1.GRAFO_DIRIGIDO) {
			return new GrafoDirigido<>();
		} else {
			return new GrafoNoDirigido<>();
		}
		
	}
	

}
