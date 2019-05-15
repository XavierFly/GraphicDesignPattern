package part6.chapter13.exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class FileFindVisitor extends Visitor {
    private String filetype;
    private ArrayList found = new ArrayList();

    public FileFindVisitor(String filetype) {
        this.filetype = filetype;
    }

    public Iterator getFoundFiles() {
        return found.iterator();
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(filetype)) {
            found.add(file);
        }
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
