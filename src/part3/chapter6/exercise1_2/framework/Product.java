package part3.chapter6.exercise1_2.framework;

public interface Product extends Cloneable {
    public abstract void use(String s);

    public abstract Product createClone();
}
