
import java.awt.FlowLayout; // especifica c�mo se van a ordenar los componentes

import javax.swing.JButton;
 import javax.swing.JFrame; // proporciona las caracter�sticas b�sicas de una ventana
 import javax.swing.JLabel; // muestra texto e im�genes
 import javax.swing.SwingConstants; // constantes comunes utilizadas con Swing
 import javax.swing.Icon; // interfaz utilizada para manipular im�genes
import javax.swing.ImageIcon; // carga las im�genes

public class LabelFrame extends JFrame {

	
	
	//Label: Etiqueta
	private JLabel etiqueta1; // JLabel s�lo con texto
	private JLabel etiqueta2; // JLabel construida con texto y un icono
	private JLabel etiqueta3; // JLabel con texto adicional e icono
	JButton finalizar;
	JButton aceptar;
	
	public LabelFrame(){
   /*   setLayout( new FlowLayout() ); // establece el esquema del marco, ordena el contenido de la etiqueta
		etiqueta1 = new JLabel("Esta es etiqueta 1"); //Cuerpo de la etiqueta, objeto JLabel
		etiqueta1.setToolTipText( "Esta es etiqueta1" );
		add(etiqueta1); //A�ade la etiqueta al "marco", si se borra queda este �ltimo sin contenido    */
		
		
		
		super( "Prueba de JLabel" ); //T�tulo del marco en el que estar� la etiqueta
		setLayout( null ); // establece el esquema del marco
		//SetLayout est� llamado de la clase que extiende, por herencia, osea, JFrame
		//especifica que el esquema del objeto LabelFrame debe ser FlowLayout.
		
		/*El m�todo setLayout se hereda en la clase LabelFrame, indirectamente de la clase Container. El argumento para
		el m�todo debe ser un objeto de una clase que implemente la interfaz LayoutManager (es decir, FlowLayout).
		La l�nea 20 crea un nuevo objeto FlowLayout y pasa su referencia como argumento para setLayout.*/
		
		 aceptar = new JButton("Aceptar");
		
		 finalizar = new JButton("Comenzar");
		 // Constructor de JLabel con un argumento String
		 etiqueta1 = new JLabel( "Etiqueta con texto" );
		 etiqueta1.setToolTipText( "Esta es etiqueta1" );
		 /*utiliza el m�todo
		setToolTipText (heredado por JLabel de JComponent) para especifi car la informaci�n sobre herramientas que
		se muestra cuando el usuario coloca el cursor del rat�n sobre el objeto JLabel en la GUI
		  */
		 
		 finalizar.setBounds(100, 400, 200, 50);
		 add( etiqueta1 ); // agrega etiqueta1 a JFrame
		 add(finalizar);
		 add(aceptar);
		
		
		 etiqueta2 = new JLabel( "Etiqueta con texto e icono", SwingConstants.LEFT );
		 etiqueta2.setToolTipText( "Esta es etiqueta2" );
		 add( etiqueta2 );
		 
		 etiqueta3 = new JLabel(); // Constructor de JLabel sin argumentos
		 etiqueta3.setText( "Etiqueta con icono y texto en la parte inferior" );
		 etiqueta3.setHorizontalTextPosition( SwingConstants.CENTER );
		 etiqueta3.setVerticalTextPosition( SwingConstants.BOTTOM );
		  etiqueta3.setToolTipText( "Esta es etiqueta3" );
		  add( etiqueta3 );
		}
	
	public void segundaEtiqueta(){
		
		
	}
}
