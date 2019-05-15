package part6.chapter13.example;

public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
