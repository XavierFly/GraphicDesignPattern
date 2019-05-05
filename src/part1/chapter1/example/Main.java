package part1.chapter1.example;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("AAA"));
        bookShelf.appendBook(new Book("BBB"));
        bookShelf.appendBook(new Book("CCC"));
        bookShelf.appendBook(new Book("DDD"));

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
