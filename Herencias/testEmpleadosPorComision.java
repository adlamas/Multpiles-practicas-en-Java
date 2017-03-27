import junit.framework.Assert;

import org.junit.Test;


public class testEmpleadosPorComision {

@Test
public void obtenerVentasBrutas(){
	
	//En el primero va a devolver 0.0 ya que -4 no es un valor válido
	EmpleadosPorComision EPC = new EmpleadosPorComision("Carlito", "Seguro La caja", "20", -4, 5, 0);
	
	Assert.assertEquals(0.0, EPC.obtenerVentasBrutas());
	EmpleadosPorComision EPC2 = new EmpleadosPorComision("Juancito", "Seguro Alliance", "15", 30, 5, 0);
	Assert.assertEquals(30.0, EPC2.obtenerVentasBrutas());
	
		}

@Test
public void obtenerTPC(){
	
	EmpleadosPorComision EPC = new EmpleadosPorComision("Juancito", "Seguro Alliance", "15", 30, 0.6, 0);
	Assert.assertEquals(0.6, EPC.obtenerTC());
	EmpleadosPorComision EPC2 = new EmpleadosPorComision("Pedrito", "Seguro Alliance", "15", 30, -2, 0);
	Assert.assertEquals(0.0, EPC2.obtenerTC());
		}
	
}
