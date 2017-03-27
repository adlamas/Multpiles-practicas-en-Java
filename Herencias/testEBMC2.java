import junit.framework.Assert;

import org.junit.Test;


public class testEBMC2 {

@Test
public void LlenarConstructor(){
	
	EmpleadoBaseMasComision2 E = new EmpleadoBaseMasComision2
	("Carlitos", "Rodriguez", "Seguro Patagonia", 20, 0.1, 7000); 
//Este método no está en la subClase pero si en la SuperClase, por lo cual, puedo usarlo en el objeto de la subClase
	Assert.assertEquals("Carlitos", E.obtenerNombre());
	Assert.assertEquals("Seguro Patagonia", E.obtenerSeguro());
}


}
