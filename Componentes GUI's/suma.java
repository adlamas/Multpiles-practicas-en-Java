import javax.swing.JOptionPane;

public class suma {

	public static void main(String args[]){
		
		//Variables String que salen en el cartel
		//Me pide que escriba lo primero y luego lo guarda en primerNumero y así con segundoNumero
		//Por defecto el título es entrada
		String primerNumero = JOptionPane.showInputDialog("Introduzca el primer entero");
		String segundoNumero = JOptionPane.showInputDialog("Introduzca el segundo entero");
		
		// convierte las entradas String en valores int para usarlos en un cálculo
		// método parseInt de la clase Integer
		int numero1 = Integer.parseInt(primerNumero);
		int numero2 = Integer.parseInt(segundoNumero);
		int suma = numero1 + numero2; // suma números
		
		//El título es "El numero es"  y lo que devuelve es la suma + "Suma de dos enteros"
		JOptionPane.showMessageDialog(null, "Suma de dos enteros " + suma, "El numero es", JOptionPane.PLAIN_MESSAGE );
		
/* 
Las líneas 22 y 23 usan el método static showMessageDialog de JOptionPane para mostrar un diálogo de
mensaje (la última captura de pantalla de la fi gura 11.2) que contiene la suma. El primer argumento ayuda a la
aplicación de Java a determinar en dónde debe colocar el cuadro de diálogo. El valor null indica que el diálogo
debe aparecer en el centro de la pantalla de la computadora. El primer argumento puede usarse también para
especifi car que el diálogo debe aparecer centrado sobre una ventana específi ca, lo cual demostraremos más adelante
en la sección 11.8. El segundo argumento es el mensaje a mostrar; en este caso, el resultado de concatenar
el objeto String "La suma es " y el valor de suma. El tercer argumento ("Suma de dos enteros") representa la
cadena que debe aparecer en la barra de título del diálogo, en la parte superior. El cuarto argumento (JOption-
Pane.PLAIN_MESSAGE) es el tipo de diálogo de mensaje a mostrar. Un diálogo PLAIN_MESSAGE no muestra un
icono a la izquierda del mensaje. La clase JOptionPane proporciona varias versiones sobrecargadas de los métodos
showInputDialog y showMessageDialog, así como métodos que muestran otros tipos de diálogos.*/
		
//Para obtener información completa acerca de la clase JOptionPane, visite el sitio java.sun.com/javase/6/docs/api/javax/swing/JOptionPane.html.		
	}
}
