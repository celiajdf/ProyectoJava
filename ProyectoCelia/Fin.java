import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Fin extends JFrame {

	private JPanel contentPane;
	
	private JLabel labelFin, labelIntentos;

	/**
	 * Create the frame.
	 */
	public Fin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelFin = new JLabel("FIN DEL JUEGO");
		labelFin.setBounds(128, 10, 126, 22);
		labelFin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(labelFin);
		
		labelIntentos = new JLabel("");
		labelIntentos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelIntentos.setBounds(24, 74, 376, 92);
		contentPane.add(labelIntentos);
		imprimir();
	}
	
	public void imprimir() {
		
		
		labelIntentos.setText("Has tardado: "+ParejasFiguras.intentos+ " intentos");
	}
}
