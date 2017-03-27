
public class SingletonExample {

	private static SingletonExample singletonInstance; //Instancia de la clase, es un objeto tipo SingletonExample
	//es privado Y EST�TICO
	
	private SingletonExample(){ //Constructor privado		
		
	}
	
	public static SingletonExample getSingletonExample(){
		//getInstance() es la �nica manera de obtener la instancia desde el mundo exterior (m�todo est�tico).
		
		if(singletonInstance == null ){ singletonInstance = new SingletonExample(); }
		
		return singletonInstance;
	}
	
}
