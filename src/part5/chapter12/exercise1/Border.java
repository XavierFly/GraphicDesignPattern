package part5.chapter12.exercise1;

public abstract class Border extends Display {
    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
