package Personajes;

import java.util.Arrays;

import Armas.Arma;

/**
 *
 * @author JaviCasti
 * @author Javier Delgado Rodriguez
 */
public class Personaje {

	private String nombre;
	private String aptitudes[];
	private String raza;
	private int nivel;
	private int iniciativa;
	private int armadura;
	private int velocidad;
	private Posicion posicion = new Posicion(0, 0);
	private Arma arma1, arma2;

	public Personaje() {
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getAptitudes() {
		return aptitudes;
	}

	public void setAptitudes(String[] aptitudes) {
		this.aptitudes = aptitudes;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getIniciativa() {
		return iniciativa;
	}

	public void setIniciativa(int iniciativa) {
		this.iniciativa = iniciativa;
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public Arma getArma1() {
		return arma1;
	}

	public void setArma1(Arma arma1) {
		this.arma1 = arma1;
	}

	public Arma getArma2() {
		return arma2;
	}

	public void setArma2(Arma arma2) {
		this.arma2 = arma2;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", aptitudes=" + Arrays.toString(aptitudes) + ", raza=" + raza
				+ ", nivel=" + nivel + ", iniciativa=" + iniciativa + ", armadura=" + armadura + ", velocidad="
				+ velocidad + ", posicion=" + posicion.toString() + ", arma1=" + arma1 + ", arma2=" + arma2 + "]";
	}
}
