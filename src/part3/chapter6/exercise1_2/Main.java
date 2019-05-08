package part3.chapter6.exercise1_2;

import part3.chapter6.exercise1_2.framework.ConcreteProduct;
import part3.chapter6.exercise1_2.framework.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        ConcreteProduct p1 = manager.create("strong message");
        p1.use("Hello, world.");
        ConcreteProduct p2 = manager.create("warning box");
        p2.use("Hello, world.");
        ConcreteProduct p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}
