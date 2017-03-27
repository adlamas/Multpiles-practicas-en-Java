import java.awt.Color;
import java.awt.FlowLayout;//especifica cómo se van a ordenar los componentes
import javax.swing.JFrame; // proporciona las características básicas de una ventana
import javax.swing.JLabel; // muestra texto e imágenes
import javax.swing.SwingConstants; // constantes comunes utilizadas con Swing
import javax.swing.Icon; // interfaz utilizada para manipular imágenes
import javax.swing.ImageIcon; // carga las imágenes


public class LabelFrame extends JFrame {

	private JLabel etiqueta1;// JLabel sólo con texto
	private JLabel etiqueta2; // JLabel construida con texto y un icono
	private JLabel etiqueta3; // JLabel con texto adicional e icono
	
	public LabelFrame(){
		
		super("Prueba de JLabel"); //Constructor de la superClase JFrame
		//El constructor de JFrame utiliza este objeto String como el texto en la barra	de título de la ventana.
		setLayout( new FlowLayout() ); // establece el esquema del marco, centra y manda para arriba el texto
		
		
		etiqueta1 = new JLabel("Etiqueta con texto");
		etiqueta1.setToolTipText( "Esta es etiqueta1" );
		etiqueta1.setForeground(Color.red);
	
		add( etiqueta1 ); // agrega etiqueta1 a JFrame
		
	}
	
}
