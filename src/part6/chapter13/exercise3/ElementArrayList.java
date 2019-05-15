package part6.chapter13.exercise3;

import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList extends ArrayList implements Element {
    @Override
    public void accept(Visitor v) {
        Iterator iterator = iterator();
        while (iterator.hasNext()) {
            Element element = (Element) iterator.next();
            element.accept(v);
        }
    }
}
