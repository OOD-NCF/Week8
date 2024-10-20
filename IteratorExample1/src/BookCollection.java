//This is the collection (BookCollection) that holds a list of books and provides an iterator.
class BookCollection implements IterableCollection<String> {
    private String[] books;
    private int size = 0;

    public BookCollection(int capacity) {
        books = new String[capacity];
    }

    public void addBook(String book) {
        if (size < books.length) {
            books[size++] = book;
        }
    }

    @Override
    public Iterator<String> createIterator() {
        return new BookIterator();
    }

    // Inner class that implements the Iterator interface
    private class BookIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more books.");
            }
            return books[index++];
        }
    }
}

