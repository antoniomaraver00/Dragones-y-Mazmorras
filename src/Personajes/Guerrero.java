package Personajes;

import Armas.Arma;

/**
 *
 * @author JaviCasti
 * @author Javier Delgado Rodriguez
 */
public class Guerrero extends Personaje {

	int fuerza;
	int destreza;

	public Guerrero() {
		super();
	}

	public Guerrero(String nombre, int armadura, int velocidad, Arma arma1, Arma arma2, Posicion posicion,
			String aptitudes[]) {
		super(nombre, armadura, velocidad, arma1, arma2, posicion, aptitudes);

	}

}
