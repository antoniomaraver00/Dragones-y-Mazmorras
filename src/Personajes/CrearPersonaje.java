package Personajes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JaviCasti
 * @author Javier Delgado Rodriguez
 */
public class CrearPersonaje {

	int seleccionarRaza(String nombre) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String s;

		boolean eleccionRazaCorrecta = false;
		int eleccionRaza = 0;

		do {

			System.out.println("Elija la raza de " + nombre);

			System.out.println("1.- Humano");
			System.out.println("2.- Elfo");
			System.out.println("3.- Mediano");
			System.out.println("4.- Enano");

			s = br.readLine();

			try {

				s = br.readLine();
				eleccionRaza = -1;
				eleccionRaza = Integer.parseInt(s);
				eleccionRazaCorrecta = true;

			} catch (NumberFormatException nfe) {

				System.out.println("Debes introducir los numeros asignados a las opciones en el menu");

			}

		} while (!eleccionRazaCorrecta);

		return eleccionRaza;

	}

	Personaje crearPersonaje() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Introduce el nombre de el personaje");
		String nombre = br.readLine();
		int razaNum = seleccionarRaza(nombre);

		switch (razaNum) {

		}
		// CAMBIAR
		return null;
	}
}
