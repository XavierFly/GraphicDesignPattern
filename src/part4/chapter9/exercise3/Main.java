package part4.chapter9.exercise3;

public class Main {
    public static void main(String[] args) {
        IncreaseDisplay increaseDisplay1 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        IncreaseDisplay increaseDisplay2 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);
        increaseDisplay1.increaseDisplay(4);
        increaseDisplay2.increaseDisplay(6);
    }
}
