import javax.swing.JOptionPane;

public class suma {

	public static void main(String args[]){
		
		//Variables String que salen en el cartel
		//Me pide que escriba lo primero y luego lo guarda en primerNumero y as� con segundoNumero
		//Por defecto el t�tulo es entrada
		String primerNumero = JOptionPane.showInputDialog("Introduzca el primer entero");
		String segundoNumero = JOptionPane.showInputDialog("Introduzca el segundo entero");
		
		// convierte las entradas String en valores int para usarlos en un c�lculo
		// m�todo parseInt de la clase Integer
		int numero1 = Integer.parseInt(primerNumero);
		int numero2 = Integer.parseInt(segundoNumero);
		int suma = numero1 + numero2; // suma n�meros
		
		//El t�tulo es "El numero es"  y lo que devuelve es la suma + "Suma de dos enteros"
		JOptionPane.showMessageDialog(null, "Suma de dos enteros " + suma, "El numero es", JOptionPane.PLAIN_MESSAGE );
		
/* 
Las l�neas 22 y 23 usan el m�todo static showMessageDialog de JOptionPane para mostrar un di�logo de
mensaje (la �ltima captura de pantalla de la fi gura 11.2) que contiene la suma. El primer argumento ayuda a la
aplicaci�n de Java a determinar en d�nde debe colocar el cuadro de di�logo. El valor null indica que el di�logo
debe aparecer en el centro de la pantalla de la computadora. El primer argumento puede usarse tambi�n para
especifi car que el di�logo debe aparecer centrado sobre una ventana espec�fi ca, lo cual demostraremos m�s adelante
en la secci�n 11.8. El segundo argumento es el mensaje a mostrar; en este caso, el resultado de concatenar
el objeto String "La suma es " y el valor de suma. El tercer argumento ("Suma de dos enteros") representa la
cadena que debe aparecer en la barra de t�tulo del di�logo, en la parte superior. El cuarto argumento (JOption-
Pane.PLAIN_MESSAGE) es el tipo de di�logo de mensaje a mostrar. Un di�logo PLAIN_MESSAGE no muestra un
icono a la izquierda del mensaje. La clase JOptionPane proporciona varias versiones sobrecargadas de los m�todos
showInputDialog y showMessageDialog, as� como m�todos que muestran otros tipos de di�logos.*/
		
//Para obtener informaci�n completa acerca de la clase JOptionPane, visite el sitio java.sun.com/javase/6/docs/api/javax/swing/JOptionPane.html.		
	}
}
