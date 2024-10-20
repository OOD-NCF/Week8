//This interface defines the contract for the collection that can return an iterator.
interface IterableCollection<T> {
    Iterator<T> createIterator();
}

