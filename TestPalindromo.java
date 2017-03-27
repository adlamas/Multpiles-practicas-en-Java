import junit.framework.Assert;
import org.junit.Test;


public class TestPalindromo {

@Test
public void Prueba1(){
	
	PilaYColaPalindromo P = new PilaYColaPalindromo();
	Assert.assertFalse(P.main() );
}
	
}
