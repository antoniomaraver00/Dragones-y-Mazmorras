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
	}

	public Guerrero(String nombre, int armadura, int velocidad, Arma arma1, Arma arma2, Posicion posicion,
			String[] aptitudes, int fuerza, int destreza) {
		super(nombre, armadura, velocidad, arma1, arma2, posicion, aptitudes);
		this.fuerza = fuerza;
		this.destreza = destreza;
	}

	@Override
	public String toString() {
		return "Guerrero [fuerza=" + fuerza + ", destreza=" + destreza + ", toString()=" + super.toString() + "]";
	}
}
