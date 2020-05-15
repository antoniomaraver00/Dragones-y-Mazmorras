package CrearPersonaje;

import java.io.IOException;

import Personajes.Guerrero;
import Personajes.Personaje;

public class Asignacion {


	public static Personaje seleccion() throws IOException {
		Teclado t = new Teclado();
		Personaje p = null;
		switch (t.leerInt()) {
		case 1:
			p = new Guerrero();
			break;

		case 2:
			break;

		case 0:
			break;

		default:
			System.out.println("Introduzca un numero valido");
		}
		return p;
	}
}
