package part4.chapter9.exercise2;

public class Main {
    public static void main(String[] args) {
        Display display = new Display(new FileDisplayImpl("star.txt"));
        display.display();
    }
}
