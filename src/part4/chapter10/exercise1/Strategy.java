package part4.chapter10.exercise1;

public interface Strategy {
    public abstract Hand nextHand();

    public abstract void study(boolean win);
}
