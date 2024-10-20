//Now we can use the BookIterator to iterate over the BookCollection:
public class IteratorPatternDemo {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection(5);
        bookCollection.addBook("Design Patterns");
        bookCollection.addBook("Clean Code");
        bookCollection.addBook("Effective Java");

        Iterator<String> iterator = bookCollection.createIterator();

        while (iterator.hasNext()) {
            String book = iterator.next();
            System.out.println(book);
        }
    }
}
