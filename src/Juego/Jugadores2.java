
package Juego;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import CrearPersonaje.*;

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

		Menus.eleccioTipoPersonaje();
		
		try {
			s = br.readLine();
			eleccion = Integer.parseInt(s);
		} catch (NumberFormatException nfe) {
			System.out.println("Debes introducir los numeros asignados a las opciones en el menu");
		}

		switch (eleccion) {

		case 1:
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						CrearPersonaje window = new CrearPersonaje();
						window.getFrame().setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});

			break;

		case 2:

			break;

		case 0:

			break;

		default:
			System.out.println("Introduzca un numero valido");
		}
	}

}
