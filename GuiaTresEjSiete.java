import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class GuiaTresEjSiete {

	public static void main(String args[]){
		
		Ciudad SanJuanPR = new Ciudad("San Juan", "Puerto Rico", 395326);
		Ciudad SanJuanARG = new Ciudad("San Juan", "Argentina", 738959);
		Ciudad SaoPaulo = new Ciudad("Sao Paulo", "Brasil", 11895932);
		Ciudad Milan = new Ciudad("Milán", "Italia", 1345890);
		
		Map<Integer, Ciudad> Diccionario = new HashMap<Integer, Ciudad>();
		
		Diccionario.put((int) SanJuanPR.getPoblacion(), SanJuanPR);
		Diccionario.put((int) SanJuanARG.getPoblacion(),SanJuanARG);
		Diccionario.put((int) SaoPaulo.getPoblacion(),SaoPaulo);
		Diccionario.put((int) Milan.getPoblacion(),Milan);
		
		System.out.println(Diccionario.get(395326).getNombreYPais());
		System.out.println(Diccionario.get(738959).getNombreYPais());
		
	}
	
}
