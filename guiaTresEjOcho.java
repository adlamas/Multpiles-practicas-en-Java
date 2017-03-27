import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class guiaTresEjOcho {

	public static void main(String args[]){
		
		String textoCastellano = "hola, algo de prueba palabra";
		Map dic = new HashMap();
		String[] S = textoCastellano.split("[ ,]");
		
		dic.put("palabra", "word");
		dic.put("de", "of");
		dic.put("prueba", "test");
		dic.put("hola", "hi");
		dic.put("esto", "this");
		dic.put("una", "a");
		dic.put("es", "is");
		
		
		for(int i =  0; i < S.length; i++ ){
			if(dic.get(S[i]) == null){ System.out.println("<Error, palabra no encontrada>"); }
			System.out.println(S[i]);
		}

		
		
	}
	
	public static String traducir(String textoC){
		
		return textoC;
		
		
	}
	
}
