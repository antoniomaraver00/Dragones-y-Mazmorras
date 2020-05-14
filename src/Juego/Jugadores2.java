
package Juego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JaviCasti
 * @author Javier Delgado Rodriguez
 */

public class Jugadores2 {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String s;

		int eleccion = 0;
		do {
			System.out.println("¿Desea jugar con personajes propios o con los personajes por defecto?");
			System.out.println("1.- Personajes propios");
			System.out.println("2.- Personajes por defecto");
			System.out.println("0.- Menu");

			try {

				s = br.readLine();
				eleccion = -1;
				eleccion = Integer.parseInt(s);

			} catch (NumberFormatException nfe) {

				System.out.println("Debes introducir los numeros asignados a las opciones en el menu");

			}

			switch (eleccion) {

			case 1:

				break;

			case 2:

				break;

			case 0:

				break;

			default:

				System.out.println("Introduzca un numero valido");

			}

		} while (eleccion != 0);
	}

}
