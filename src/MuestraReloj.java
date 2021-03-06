import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.SwingConstants;


public class MuestraReloj /*implements AlarmaListener*/ {

	/*public synchronized alarmaActivada(AlarmaEvent evt){
		//Mandar mensaje
	}
	*/
	public static void main(String[] args) {
		Reloj relojChetumal = new Reloj();
		Reloj relojMexico = new Reloj();
		Reloj relojParis = new Reloj();
		Reloj relojLondres = new Reloj();
		Reloj relojPekin = new Reloj();
		
//		AlarmaListener oyenteAlarma1 = new AlarmaListener();
//		relojChetumal.addAlarmaListener(this);
		
		
		JFrame ventana = new JFrame("Relojes");
		Container contentpane = ventana.getContentPane();
		
		ventana.setSize(500, 500);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		contentpane.setLayout(new FlowLayout(FlowLayout.LEFT));
		contentpane.add(relojChetumal);
		contentpane.add(relojMexico);
		*/
		//relojChetumal.setAlignmentY(SwingConstants.CENTER);
		
		contentpane.add(relojChetumal, BorderLayout.NORTH);
		contentpane.add(relojMexico, BorderLayout.CENTER);
		contentpane.add(relojLondres, BorderLayout.SOUTH);
		contentpane.add(relojParis, BorderLayout.WEST);
		contentpane.add(relojPekin, BorderLayout.EAST);

		relojChetumal.start();
		relojMexico.start();
		relojParis.start();
		relojLondres.start();
		relojPekin.start();
	
		ventana.setVisible(true);
	}

}
