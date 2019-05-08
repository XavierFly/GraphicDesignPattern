package part3.chapter6.example.framework;

public interface Product extends Cloneable {
    public abstract void use(String s);

    public abstract Product createClone();
}
