package part4.chapter9.exercise1;

public class Main {
    public static void main(String[] args) {
        RandomCountDisplay randomCountDisplay = new RandomCountDisplay(new StringDisplayImpl("Hello, China."));
        randomCountDisplay.randomDisplay(5);
    }
}
