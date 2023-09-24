import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.awt.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;

/* 
 * El siguiente código pertenece al juego de parejas.
 * Durante la partida el jugador deber ir pulsando los botones y unir las distintas fórmulas con 
 * el concepto al que hacen referencia
 */

public class ParejasFiguras extends JFrame {
	/*
	 * Iniciamos los elementos de la interfaz gráfica (contentPane así como los 16 botones visuales.
	 * Los botones A y B van a almacenar el botón donde se ha hecho click y se utilizarán para llevar a cabo la comprobación.
	 * Iniciamos a 0 la variable "descubiertos" que nos permitirá controlar el flujo del juego 
	 * y la variable "intentos" que almacenará el número de parejas que son necesarias para finalizar.
	 * Finalmente, se utiliza una lista de String para almacenar el texto que aparece en los botones.
	 */
	private JPanel contentPane;
	JButton boton01, boton02, boton03, boton04, boton05, boton06, boton07, boton08;
	JButton boton09, boton10, boton11, boton12, boton13, boton14, boton15, boton16;
	JButton botonA, botonB;
	private int descubiertos = 0;
	static int intentos = 0; //Declaramos la variable intentos como estática, de modo que pueda enviarse a otras pantallas
	private List<String> textosBotones = new ArrayList<String>();

 
	public ParejasFiguras() {
		setTitle("Juego de las parejas");
		//Se ha creado la interfaz con el editor visual 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 4, 10, 10));
		
		//Se añaden los textos de los botones a la lista "textoBotones"
		textosBotones.add("Perímetro del triángulo");
	    textosBotones.add("lado1 + lado2 + lado3");
	    textosBotones.add("Área del triángulo");
	    textosBotones.add("(b*h)/2");
	    textosBotones.add("Perímetro del cuadrado");
	    textosBotones.add("4*lado");
	    textosBotones.add("Área del cuadrado");
	    textosBotones.add("lado*lado");
	    textosBotones.add("Perímetro del círculo");
	    textosBotones.add("2πr");
	    textosBotones.add("Área del círculo");
	    textosBotones.add("πr^2");
	    textosBotones.add("Perímetro del rectángulo");
	    textosBotones.add("2*(base+altura)");
	    textosBotones.add("Perímetro del pentágono");
	    textosBotones.add("5*lado");
	    
	    //Mezclamos los elementos de la lista para poder generar los botones aleatoriamente
	    Collections.shuffle(textosBotones); 
		
	    /*
	     *Creamos los 16 botones extrayendo el texto de la lista "textosBotones"
	     *Dentro de cada botón se añade el actionPerformed que llama al método descubrir y
	     *le envía la información del botón pulsado.
	     */
	    boton01 = new JButton(textosBotones.get(0));
	    boton01.setForeground(new Color(0, 0, 0));
	    boton01.setBackground(new Color(0, 0, 0));
	    boton01.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	descubrir(boton01);
	        }
	    });
	    contentPane.add(boton01);

	    boton02 = new JButton(textosBotones.get(1));
	    boton02.setForeground(new Color(0, 0, 0));
	    boton02.setBackground(new Color(0, 0, 0));
	    boton02.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	descubrir(boton02);
	        }
	    });
	    contentPane.add(boton02);

	    boton03 = new JButton(textosBotones.get(2));
	    boton03.setForeground(new Color(0, 0, 0));
	    boton03.setBackground(new Color(0, 0, 0));
	    boton03.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	descubrir(boton03);
	        }
	    });
	    contentPane.add(boton03);

	    boton04 = new JButton(textosBotones.get(3));
	    boton04.setForeground(new Color(0, 0, 0));
	    boton04.setBackground(new Color(0, 0, 0));
	    boton04.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	descubrir(boton04);
	        }
	    });
	    contentPane.add(boton04);

	    boton05 = new JButton(textosBotones.get(4));
	    boton05.setForeground(new Color(0, 0, 0));
	    boton05.setBackground(new Color(0, 0, 0));
	    boton05.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	descubrir(boton05);
	        }
	    });
	    contentPane.add(boton05);
   
	    boton06 = new JButton(textosBotones.get(5));
	    boton06.setForeground(new Color(0, 0, 0));
	    boton06.setBackground(new Color(0, 0, 0));
	    boton06.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	descubrir(boton06);
	        }
	    });
	    contentPane.add(boton06);
	    
	    boton07 = new JButton(textosBotones.get(6));
	    boton07.setForeground(new Color(0, 0, 0));
	    boton07.setBackground(new Color(0, 0, 0));
	    boton07.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	descubrir(boton07);
	        }
	    });
	    contentPane.add(boton07);
	    
	    boton08 = new JButton(textosBotones.get(7));
	    boton08.setForeground(new Color(0, 0, 0));
	    boton08.setBackground(new Color(0, 0, 0));
	    boton08.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	descubrir(boton08);
	        }
	    });
	    contentPane.add(boton08);

	    boton09 = new JButton(textosBotones.get(8));
	    boton09.setForeground(new Color(0, 0, 0));
	    boton09.setBackground(new Color(0, 0, 0));
	    boton09.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	descubrir(boton09);
	        }
	    });
	    contentPane.add(boton09);

	    boton10 = new JButton(textosBotones.get(9));
	    boton10.setForeground(new Color(0, 0, 0));
	    boton10.setBackground(new Color(0, 0, 0));
	    boton10.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	descubrir(boton10);
	        }
	    });
	    contentPane.add(boton10);

	    boton11 = new JButton(textosBotones.get(10));
	    boton11.setForeground(new Color(0, 0, 0));
	    boton11.setBackground(new Color(0, 0, 0));
	    boton11.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	descubrir(boton11);
	        }
	    });
	    contentPane.add(boton11);

	    boton12 = new JButton(textosBotones.get(11));
	    boton12.setForeground(new Color(0, 0, 0));
	    boton12.setBackground(new Color(0, 0, 0));
	    boton12.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	descubrir(boton12);
	        }
	    });
	    contentPane.add(boton12);

	    boton13 = new JButton(textosBotones.get(12));
	    boton13.setForeground(new Color(0, 0, 0));
	    boton13.setBackground(new Color(0, 0, 0));
	    boton13.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	descubrir(boton13);
	        }
	    });
	    contentPane.add(boton13);

	    boton14 = new JButton(textosBotones.get(13));
	    boton14.setForeground(new Color(0, 0, 0));
	    boton14.setBackground(new Color(0, 0, 0));
	    boton14.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	descubrir(boton14);
	        }
	    });
	    contentPane.add(boton14);


	    boton15 = new JButton(textosBotones.get(14));
	    boton15.setForeground(new Color(0, 0, 0));
	    boton15.setBackground(new Color(0, 0, 0));
	    boton15.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	descubrir(boton15);
	        }
	    });
	    contentPane.add(boton15);

	    boton16 = new JButton(textosBotones.get(15));
	    boton16.setForeground(new Color(0, 0, 0));
	    boton16.setBackground(new Color(0, 0, 0));
	    boton16.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	descubrir(boton16);
	        }
	    });
	    contentPane.add(boton16);
	    
	}
	
	//Método para descubrir los botones
	public void descubrir(JButton boton){
			
		/*
		 * Almacenamos cada uno de los botones clickados en botonA y botonB
		 * Como cada botón envía su información, se controla que se almacene el primero en botonA y el segundo 
		 * en botonB mediante la variable "descubiertos".
		 * Al iniciarse en cero entra dentro del bucle if al llamarse al método por primera vez, una vez dentro, 
		 * se almacena el primer boton en botonA, se le descubre cambiando el color de fondo y se suma 1 a la variable.
		 * La segunda vez que se llama a la función, la variable vale 1, por lo que entra en la sección 
		 * "else if (descubiertos ==1)" almacenando la información del segundo boton y cambniándiole de color.
		 */
		if (descubiertos == 0){
			botonA = boton;
			botonA.setBackground(new Color(184, 207, 229));
			descubiertos++;
		} else if (descubiertos==1) {
			botonB = boton;
			botonB.setBackground(new Color(184, 207, 229));
			comprobar(botonA, botonB);
		}
		
	}
	
	public void comprobar(JButton boton1, JButton boton2){
		botonA= boton1;
		botonB= boton2;
		
		/* Se comprueba que los textos de los botones correspondan con las opciones correctas. Si es así,
		 * se llama al método acierto pasándole los valores de los botones. En caso contrario se llama al método fallo.
		 */
		if ((botonA.getText() == "Perímetro del triángulo" && botonB.getText() == "lado1 + lado2 + lado3") ||
			(botonA.getText() == "lado1 + lado2 + lado3" && botonB.getText() == "Perímetro del triángulo"))	{
			acierto (botonA, botonB);
		} else if ((botonA.getText() == "Área del triángulo" && botonB.getText() == "(b*h)/2") ||
					(botonA.getText() == "(b*h)/2" && botonB.getText() == "Área del triángulo"))	{
			acierto (botonA, botonB);
		} else if ((botonA.getText() == "Perímetro del cuadrado" && botonB.getText() == "4*lado") ||
					(botonA.getText() == "4*lado" && botonB.getText() == "Perímetro del cuadrado"))	{
			acierto (botonA, botonB);
		} else if ((botonA.getText() == "Área del cuadrado" && botonB.getText() == "lado*lado") ||
					(botonA.getText() == "lado*lado" && botonB.getText() == "Área del cuadrado"))	{
			acierto (botonA, botonB);
		} else if ((botonA.getText() == "Perímetro del círculo" && botonB.getText() == "2πr") ||
					(botonA.getText() == "2πr" && botonB.getText() == "Perímetro del círculo"))	{
			acierto (botonA, botonB);
		} else if ((botonA.getText() == "Área del círculo" && botonB.getText() == "πr^2") ||
					(botonA.getText() == "πr^2" && botonB.getText() == "Área del círculo"))	{
			acierto (botonA, botonB);
		} else if ((botonA.getText() == "Perímetro del rectángulo" && botonB.getText() == "2*(base+altura)") ||
					(botonA.getText() == "2*(base+altura)" && botonB.getText() == "Perímetro del rectángulo"))	{
			acierto (botonA, botonB);
		} else if ((botonA.getText() == "Perímetro del pentágono" && botonB.getText() == "5*lado") ||
					(botonA.getText() == "5*lado" && botonB.getText() == "Perímetro del pentágono"))	{
			acierto (botonA, botonB);
		} else {
			fallo(botonA, botonB);
		}
		descubiertos=0; //Una vez comprobado ambos botones, se resetea la variable descubiertos
		
	}
	
	//Método cuando se ha fallado la pareja
	public void fallo(JButton boton1, JButton boton2){
		botonA= boton1;
		botonB= boton2;
		//Se muestran los botones de color rojo para que el usuario sepa que se ha equivocado
		botonA.setBackground(Color.red);
		botonB.setBackground(Color.red);
		incrementar(); //Llamamos al método incrementar para contabilizar un intento
        Timer timer = new Timer(600, new ActionListener() { //Se muestra durante 600 milisegundos
            public void actionPerformed(ActionEvent e) {
            	//Se vuelven a "voltear" colocando los botones en negro de nuevo.
                botonA.setBackground(Color.black);
                botonB.setBackground(Color.black);
            }
        });
        timer.setRepeats(false);
        timer.start();
		
	}
	
	//Método cuando se ha acertado la pareja
	public void acierto(JButton boton1, JButton boton2){
		//Se colocan ambos botones en color verde para que el usuario sepa que ha acertado.
		//Adicionalmente se inhabilitan para que no pueda pulsarlos por error.
		botonA= boton1;
		botonA.setBackground(Color.green);
		botonA.setEnabled(false);
		botonB= boton2;
		botonB.setBackground(Color.green);
		botonB.setEnabled(false);
		incrementar(); //Llamamos al método incrementar para contabilizar un intento
		//Se comprueba que todos los botones están acertados (en color verde) para que se pueda llamar a fin.
		if (boton01.getBackground()==Color.green && boton02.getBackground()==Color.green &&
			boton03.getBackground()==Color.green && boton04.getBackground()==Color.green &&	
			boton05.getBackground()==Color.green && boton06.getBackground()==Color.green &&	
			boton07.getBackground()==Color.green && boton08.getBackground()==Color.green &&	
			boton09.getBackground()==Color.green && boton10.getBackground()==Color.green &&	
			boton11.getBackground()==Color.green && boton12.getBackground()==Color.green &&
			boton13.getBackground()==Color.green && boton14.getBackground()==Color.green &&
			boton15.getBackground()==Color.green && boton16.getBackground()==Color.green){
			fin(); //Llamamos al método fin para indicar que ha finalizado el juego
		}
	}
	
	//Método que incrementa en 1 la variable intentos
	public int incrementar() { 
		intentos++;
		return intentos;
	}

	//Método para señalar la finalización de la partida
	public void fin (){
		Fin pantallafin = new Fin(); //Creamos una pantalla para mostrar el mensaje de fin de juego
		dispose(); //Cerramos la pantalla actual
		pantallafin.setVisible(true); //Mostramos la siguiente pantalla
		
	}
	
}