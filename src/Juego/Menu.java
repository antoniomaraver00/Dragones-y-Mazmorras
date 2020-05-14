package Juego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JaviCasti
 * @author Javier Delgado Rodriguez
 */
public class Menu {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String s;
		int eleccion = 0;

		do {

			eleccion = -1;

			System.out.println("=====================================================");
			System.out.println("================DUNGEONS & DRAGONS===================");
			System.out.println("=====================================================");
			System.out.println("1.- Jugar");
			System.out.println("2.- Ayuda");
			System.out.println("0.- Salir");

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
