
public class SingletonExample {

	private static SingletonExample singletonInstance; //Instancia de la clase, es un objeto tipo SingletonExample
	//es privado Y ESTÁTICO
	
	private SingletonExample(){ //Constructor privado		
		
	}
	
	public static SingletonExample getSingletonExample(){
		//getInstance() es la única manera de obtener la instancia desde el mundo exterior (método estático).
		
		if(singletonInstance == null ){ singletonInstance = new SingletonExample(); }
		
		return singletonInstance;
	}
	
}
