public interface QueueInterface<T> {

      public boolean isEmpty();
       // If queue is full, queue is expanded first.

       public void enqueue(T newItem);

       public T dequeue() throws java.util.NoSuchElementException;   

       public T peek() throws java.util.NoSuchElementException;

     

    }