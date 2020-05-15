package Juego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import CrearPersonaje.Menus;

/**
 *
 * @author JaviCasti
 * @author Javier Delgado Rodriguez
 */
public class Game {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String s;
		int eleccion = 0;

		do {

			eleccion = -1;

			Menus.inicio();
			
			try {
				s = br.readLine();
				eleccion = -1;
				eleccion = Integer.parseInt(s);
			} catch (NumberFormatException nfe) {
				System.out.println("Debes introducir los numeros asignados a las opciones en el menu");
			}

			switch (eleccion) {

			case 1:
				Jugadores2.main(args);
				break;

			case 2:
				break;

			}

		} while (eleccion != 0);

	}
}
