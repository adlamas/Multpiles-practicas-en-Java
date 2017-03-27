/* * 2. Dada una tabla de hash de tamaño 7 y la función de hashing h(x) = x mod 7, 
 * inserte los números 1, 8, 27, 125, 216, 343, resolviendo los choques con:
a) el método de hashing cerrado
b) el método de hashing abierto
y dibuje las tablas resultantes en cada caso.
 */


public class GuiaNueveBEjDos {

	static int[] arreglo = new int[7];
	
	public static Integer hashing(Integer clave){
		Integer i =  (clave & 0x7fffffff) % 7; //Hace que "i" sea: |i| >= 0
		/* if(i >= 7){ i = 0; 
			while(arreglo[i] != 0){				
				i++;
				if(arreglo[i] == 0){ arreglo[i] = clave; }
				}
			if(arreglo[0] == 0){arreglo[0] = clave; }			
		}*/
		if(arreglo[i] == 0){arreglo[i] = clave; 
		}	else{
				if(i == 6){ i = 0; }
					while(arreglo[i] != 0){				
						i = i+1;
						if(arreglo[i] == 0){ arreglo[i] = clave; }
							break;
						}
				if(arreglo[0] == 0){ arreglo[0] = clave; 
						}
				}
							
		return i;
		}
			
		
	
	
	public int obtenerClave(int i){
		return arreglo[i];
	}
	
	
	
	public static void main(String args[]){
		
		
		System.out.println(hashing(1));
		System.out.println(hashing(8));
		System.out.println(hashing(27));		
		System.out.println(hashing(125));
		//System.out.println(hashing(216));
		//System.out.println(hashing(343));
		
		System.out.println();
		
		System.out.println(arreglo[1]);
		System.out.println(arreglo[2]);
		System.out.println(arreglo[6]);
		System.out.println(arreglo[0]);
		
		
		
		
		
	}
	

	
}
