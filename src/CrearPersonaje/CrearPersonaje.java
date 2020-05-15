package CrearPersonaje;

import java.io.IOException;

import javax.swing.JFrame;

import Personajes.Guerrero;
import Personajes.Personaje;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CrearPersonaje {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Create the application.
	 */
	public CrearPersonaje() {
		initialize();
	}

	public Personaje seleccion() throws IOException {
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

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		Menus.personaje();
		Personaje p = null;

		try {
			p = seleccion();
		} catch (IOException e) {
		}

		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 450, 780);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNombre = new JLabel("Nombre del peronaje");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setBounds(10, 11, 142, 29);
		frame.getContentPane().add(lblNombre);

		textField = new JTextField();
		textField.setBounds(10, 51, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNombre.setText(textField.getText());
				lblNombre.getText();
			}
		});
		p.setNombre(textField.getText());
		btnNewButton.setBounds(106, 50, 89, 23);
		frame.getContentPane().add(btnNewButton);

		System.out.println(p.toString());
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
