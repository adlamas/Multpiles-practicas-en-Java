import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;


public class hacerEtiqueta extends JFrame {
	
	static JLabel eti = new JLabel("Etiqueta con el texto");
    static JButton aceptar = new JButton("Aceptar");
	
	public void hacer(){
		
		eti.setText("miTexto");
		eti.setSize(0, 0);
		eti.setVisible(true);
		
	
		
	}
	
	public static void main(String args[]){
		
		JFrame miMarco = new JFrame("mi título");
		miMarco.setLayout(null);
		miMarco.setTitle("el titulo");
		miMarco.add(eti, BorderLayout.SOUTH);
		miMarco.add(aceptar);
		aceptar.setBounds(100, 500 , 80, 40);
		eti.setSize(30, 40);
		eti.setBounds(400, 50, 100, 400);
		miMarco.setSize(800,600);
		miMarco.setVisible(true);
		
	
			
		
	}

}
