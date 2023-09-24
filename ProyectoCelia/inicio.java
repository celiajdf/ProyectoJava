import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public inicio() {
		setTitle("Instrucciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Se añaden las instrucciones para que el usuario sepa lo que tiene que hacer
		JLabel etiquetaInstrucciones = new JLabel
				("<html><h3>Bienvenido al juego de las parejas. <br><br> En este juego tienes que seleccionar los botones de dos en dos para mostrar su contenido.<br><br>Veras que en algunos tienes la fórmula de operaciones sencillas para calcular áreas y perímetros de figuras planas mientras que en los otros tienes el elemento al que hace referencia la fórmula.<br><br>La finalidad del juego es lograr resolver las parejas en el mínimo número de intentos.<br><br>Si aciertas, el color cambiará a verde, si fallas se mostrará en rojo durante unos segundos antes de darse la vuelta de nuevo.</h3><br><br><h1><center>Buena suerte</center></h1></html>");
		etiquetaInstrucciones.setBounds(27, 11, 597, 365);
		contentPane.add(etiquetaInstrucciones);
		
		//Boton para pasar a la pantalla del juego
		JButton botonJugar = new JButton("<html><h1>JUGAR</h1></html>");
		botonJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParejasFiguras pantallajuego = new ParejasFiguras(); //Creamos una instancia de la nueva pantalla.
				dispose(); // Cerramos la pantalla actual
				pantallajuego.setVisible(true); //Hacemos visible la siguiente pantalla
			}
		});
		botonJugar.setBounds(230, 387, 185, 59);
		contentPane.add(botonJugar);
	}
}
