import junit.framework.Assert;

import org.junit.Test;


public class RedefinirEquals {

	static Cuenta C1 = new Cuenta(100);
	Cuenta C2 = new Cuenta(100);
	
	
@Test
public void iguales(){
	
	Assert.assertEquals(C1,C2);
	
}

public boolean Equals(Object O){
	if (!Cuenta.class.isInstance(O))    return false;
	
	Cuenta C = (Cuenta) O;
	
	return ((Cuenta) O).getN() == C.getN();
}

public static void main(String args[]){
	
	//System.out.println(!Cuenta.isInstance() == true); NO SE
	
}


	
	
}
	
	
	
	 





class Cuenta{
	
	int n;
	
	public Cuenta(int i){
		n = i;
	}
	
	public int getN(){
		
		return n;
	}
}
