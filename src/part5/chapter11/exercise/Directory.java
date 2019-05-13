package part5.chapter11.exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String name;
    private ArrayList directory = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            size += entry.getSize();
        }
        return size;
    }

    public void add(Entry entry) {
        directory.add(entry);
        entry.parent = this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
