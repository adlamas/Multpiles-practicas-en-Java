
public class PruebaPolimorfismo {

	public static void main(String args[]){
		
		 EmpleadosPorComision EPC = new EmpleadosPorComision("Sue", "Jones", "222-22-2222", 10000, .06, 0);
		 EmpleadoBaseMasComision EBMC = new EmpleadoBaseMasComision("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
		 
		 System.out.printf( "%s %s:\n\n%s\n\n",
		"Llamada a toString de EmpleadoPorComision con referencia de superclase ",
		"a un objeto de la superclase", EPC.toString() );
		 
		 System.out.printf( "%s %s:\n\n%s\n\n",
				 "Llamada a toString de EmpleadoBaseMasComision con referencia",
				 "de subclase a un objeto de la subclase", EBMC.toString() );
		 
		 EmpleadosPorComision EBMC2 =  EBMC;
		 System.out.printf("%s %s:\n\n%s\n","Llamada a toString de EmpleadoBaseMasComision con referencia de superclase",
				 "a un objeto de la subclase",EBMC2.toString());
		 
	}
	
}
