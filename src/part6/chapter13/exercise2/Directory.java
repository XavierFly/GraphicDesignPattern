package part6.chapter13.exercise2;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String name;
    private ArrayList dir = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        SizeVisitor sizeVisitor = new SizeVisitor();
        accept(sizeVisitor);
        return sizeVisitor.getSize();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

    public Iterator iterator() {
        return dir.iterator();
    }
}
