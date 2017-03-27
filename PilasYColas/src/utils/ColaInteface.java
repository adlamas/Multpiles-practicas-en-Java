package utils;

public interface ColaInteface<T> {
	public void encolar(T e) throws ColaException;
	public T desencolar()throws ColaException;
	public boolean colaVacia();
	

}
