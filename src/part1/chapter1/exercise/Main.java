package part1.chapter1.exercise;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("AAA"));
        bookShelf.appendBook(new Book("BBB"));
        bookShelf.appendBook(new Book("CCC"));
        bookShelf.appendBook(new Book("DDD"));
        bookShelf.appendBook(new Book("EEE"));
        bookShelf.appendBook(new Book("FFF"));

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
