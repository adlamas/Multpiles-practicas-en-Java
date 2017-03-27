import java.util.LinkedList;
import java.util.Iterator;


public class GuiaDosEjOnce {

	static LinkedList L1 = new LinkedList();
	static LinkedList L2 = new LinkedList();
	
	
	public static void llenar(){
		L1.add(22);
		L1.add(14);
		L1.add(6);
		
		L2.add(39);
		L2.add(41);
		L2.add(17);
		L2.add(22);
		L2.add(14);
		L2.add(6);
		L2.add(3);
		L2.add(11);
		L2.add(73);
		
	}
	
	public static void main(String args[]){
		llenar();
		Iterator it2 = L2.iterator();
		boolean estado = false;
		while(it2.hasNext()){
			if(it2.next() == L1.get(0) && it2.hasNext()){
				if(it2.next() == L1.get(1) && it2.hasNext()){
					if(it2.next() == L1.get(2)) {  estado = true; }
						}
					}
				}
		System.out.print(estado);
		}
}
