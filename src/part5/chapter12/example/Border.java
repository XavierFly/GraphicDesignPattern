package part5.chapter12.example;

public abstract class Border extends Display {
    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
