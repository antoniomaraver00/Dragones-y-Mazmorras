package Personajes;

/**
 * Controla la posicion del Personaje
 * 
 * @author JaviCasti
 * @author Javier Delgado Rodriguez
 * 
 */

public class Posicion {

	int posicionX, posicionY;

	Posicion(int posicionX, int posicionY) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}

	@Override
	public String toString() {
		return "Posicion [posicionX=" + posicionX + ", posicionY=" + posicionY + "]";
	}
	
	
}
