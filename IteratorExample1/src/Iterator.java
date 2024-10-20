//This interface defines the contract for iteration.
interface Iterator<T> {
    boolean hasNext();
    T next();
}