

import java.util.LinkedList;
import java.util.List;

/**
 * Implementación simple de la estructura dinámica de datos Cola.
 * 
 * @param <T>
 * 
 * @author Mariano Tugnarelli
 */

public class Cola<T> {

    /**
     * Elementos que componen la pila.
     */
    private List<T> elementos;

    /**
     * @post construye la instancia vacia.
     */
    public Cola() {

        this.elementos = new LinkedList<T>();
    }

    /**
     * @post agrega elemento al final de la Cola
     * @param elemento
     */
    public void acolar(T elemento) {

        this.elementos.add(elemento);
    }

    /**
     * @pre la Cola no está vacía.
     * @post retira el frente de la Cola y lo devuelve.
     * @return
     */
    public T desacolar() {

        return this.elementos.remove(0);
    }

    /**
     * @pre la Cola no está vacía.
     * @post devuelve el frente de la Cola.
     * @return
     */
    public T frente() {

        return this.elementos.get(0);
    }

    /**
     * @return si la Cola está o no vacía.
     */
    public boolean vacia() {

        return this.elementos.isEmpty();
    }

}