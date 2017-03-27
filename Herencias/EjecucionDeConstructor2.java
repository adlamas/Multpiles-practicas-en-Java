
public class EjecucionDeConstructor2 extends EjecucionDeConstructor {

	public EjecucionDeConstructor2(double primer, double segundo, String PP, String SP){
		
		super(primer, segundo, PP,SP);
		
		System.out.printf("Ejecución constructor subClase", this);
	}
	
}
