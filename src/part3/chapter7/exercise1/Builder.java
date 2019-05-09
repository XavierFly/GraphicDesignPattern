package part3.chapter7.exercise1;

public abstract class Builder {
    private boolean initialized = false;

    protected void makeTitle(String title) {
        if (!initialized) {
            buildTitle(title);
            initialized = true;
        }
    }

    protected void makeString(String str) {
        if (initialized) {
            buildString(str);
        }
    }

    protected void makeItems(String[] items) {
        if (initialized) {
            buildItems(items);
        }
    }

    protected void close() {
        if (initialized) {
            buildDone();
        }
    }

    public abstract void buildTitle(String title);

    public abstract void buildString(String str);

    public abstract void buildItems(String[] items);

    public abstract void buildDone();
}
