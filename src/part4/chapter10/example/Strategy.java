package part4.chapter10.example;

public interface Strategy {
    public abstract Hand nextHand();

    public abstract void study(boolean win);
}
