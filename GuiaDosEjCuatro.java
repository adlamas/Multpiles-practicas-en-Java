import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * 1) La comparación usando == no se debe usar para comparar el “contenido” de los objetos,
 *    sino únicamente para comparar la información de las variables apuntadoras.
 *    Usar == para comparar objetos es un error frecuente en programadores con poca experiencia.

2) Para comparar el contenido de los objetos hemos de usar, 
   en general, un método especial del que disponen todos los objetos denominado equals.
   Equals se basa en una definición de igualdad que ha de estar establecida. 
   Por ejemplo, podríamos definir que dos objetos son iguales si contienen el mismo número de bolígrafos, 
   de la misma marca, modelo y color. Para algunos tipos de objetos, como los String,
   la definición de igualdad que viene incorporada en el API de Java nos va a resultar suficiente.
   Es decir, if (miCadena1.equals (miCadena2)) va a funcionar correctamente.
   Sin embargo, si hemos definido un tipo Deposito y tratamos de utilizar if (deposito1.equals (deposito2)) 
   no obtendremos un resultado satisfactorio puesto que no hemos definido cuál es el criterio de igualdad.
 */


public class GuiaDosEjCuatro {

	static ArrayList<Integer> lista = new ArrayList();
	
	public static void llenar(){
		//[5, 7, 8, 9, 5, 69, 7, 3, 7]
		
		lista.add(5);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		lista.add(5);
		lista.add(69);
		lista.add(7);
		lista.add(3);
		lista.add(7);
	}
	
	public int main(int n){
		llenar();
		int frecuencia = 0;
		Iterator it = lista.iterator();
		while(it.hasNext()){
			//Igualar lo que está en una lista a un entero
			//Hay que probar esto mannnn!!!
			if( it.next().equals(n))frecuencia = frecuencia + 1; };
			
//El resultado es medio extraño pero funciona la primera vez que se ejecuta (?)			
		return frecuencia;
	}
	
	
	
}
