package Personajes;

import Armas.Arma;

/**
 *
 * @author JaviCasti
 * @author Javier Delgado Rodriguez
 */
public class Personaje {

	String nombre;
	String aptitudes[];
	String raza;
	int nivel;
	int iniciativa;
	int armadura;
	int velocidad;
	Posicion posicion;
	Arma arma1, arma2;

	Personaje() {
	}

	public Personaje(String nombre, int armadura, int velocidad, Arma arma1, Arma arma2, Posicion posicion,
			String[] aptitudes) {
		this.nombre = nombre;
		this.aptitudes = aptitudes;
		this.armadura = armadura;
		this.velocidad = velocidad;
		this.posicion = posicion;
		this.arma1 = arma1;
		this.arma2 = arma2;
	}

	/**
	 * Aplica los modificadores de raza dependiendo de la raza que sea el personaje
	 * 
	 * @param raza La raza del personaje
	 */

	void aplicarBeneficiosRaza(String raza) {

		switch (raza) {

		case "Elfo":
		case "Humano":
			velocidad = 30;
			break;

		case "Enano":
		case "Mediano":
			velocidad = 25;
			break;

		}
	}

	/**
	 * Calcula la distancia entre dos personajes
	 * 
	 * @param p El personaje con el que calcular la distancia
	 * 
	 * @return distancia La distancia entre ambos personajes
	 */

	double calcularDistanciaPersonajes(Personaje p) {

		double distancia = Math.sqrt(Math.pow((p.posicion.posicionX - posicion.posicionX), 2)
				- Math.pow((p.posicion.posicionY - posicion.posicionY), 2));
		return distancia;
	}

	/**
	 * Ataca a un personaje en su radio de ataque
	 * 
	 * @param p El personaje que se ataca
	 */

	void atacar(Personaje p) {

	}
}
