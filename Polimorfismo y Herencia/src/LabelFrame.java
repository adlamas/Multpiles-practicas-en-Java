import java.awt.Color;
import java.awt.FlowLayout;//especifica c�mo se van a ordenar los componentes
import javax.swing.JFrame; // proporciona las caracter�sticas b�sicas de una ventana
import javax.swing.JLabel; // muestra texto e im�genes
import javax.swing.SwingConstants; // constantes comunes utilizadas con Swing
import javax.swing.Icon; // interfaz utilizada para manipular im�genes
import javax.swing.ImageIcon; // carga las im�genes


public class LabelFrame extends JFrame {

	private JLabel etiqueta1;// JLabel s�lo con texto
	private JLabel etiqueta2; // JLabel construida con texto y un icono
	private JLabel etiqueta3; // JLabel con texto adicional e icono
	
	public LabelFrame(){
		
		super("Prueba de JLabel"); //Constructor de la superClase JFrame
		//El constructor de JFrame utiliza este objeto String como el texto en la barra	de t�tulo de la ventana.
		setLayout( new FlowLayout() ); // establece el esquema del marco, centra y manda para arriba el texto
		
		
		etiqueta1 = new JLabel("Etiqueta con texto");
		etiqueta1.setToolTipText( "Esta es etiqueta1" );
		etiqueta1.setForeground(Color.red);
	
		add( etiqueta1 ); // agrega etiqueta1 a JFrame
		
	}
	
}
