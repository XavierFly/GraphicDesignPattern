package part6.chapter13.exercise2;

import java.util.Iterator;

public class SizeVisitor extends Visitor {
    private int size = 0;

    public int getSize() {
        return size;
    }

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.accept(this);
        }
    }
}
