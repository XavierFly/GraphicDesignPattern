package part3.chapter6.exercise1_2.framework;

import java.util.HashMap;

public class Manager {
    private HashMap showcase = new HashMap();

    public void register(String name, ConcreteProduct proto) {
        showcase.put(name, proto);
    }

    public ConcreteProduct create(String protoname) {
        ConcreteProduct p = (ConcreteProduct) showcase.get(protoname);
        return p;
    }
}
