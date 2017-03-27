
public class PruebaArbol {

	public static void main(String args[]){
	
		ArbolBinarioOrdenado AB = new ArbolBinarioOrdenado();
		AB.insertar(10);
		AB.insertar(7);
		AB.insertar(4);
		AB.insertar(1);
		AB.insertar(9);
		AB.insertar(8);
		AB.insertar(6);
		AB.insertar(3);
		AB.insertar(2);
		AB.insertar(11);
		AB.insertar(15);
		AB.insertar(14);
		AB.insertar(13);
		AB.insertar(12);
		System.out.println(AB.cantidadDeHojas(AB.raiz));
	
	
	}
}
