import java.util.EmptyStackException;

// Generic Stack class implementation
public class Stack<T> {
    private T[] data;
    private int size;

    // Suppressing unchecked cast warning implicitly by casting Object array to generic array
    public Stack(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    // Pushes an element to the top of the stack, checking for overflow
    public void push(T element) {
        if (size == data.length) {
            throw new RuntimeException("Стек переполнен!");
        }
        data[size] = element;
        size++;
    }

    // Pops and returns the top element, dereferencing it for Garbage Collection
    public T pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        size--;
        T element = data[size];
        data[size] = null;
        return element;
    }

    // Returns the top element without removing it
    public T peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return data[size - 1];
    }
}
