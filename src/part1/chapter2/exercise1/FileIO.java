package part1.chapter2.exercise1;

import java.io.IOException;

public interface FileIO {
    public abstract void readFromFile(String filename) throws IOException;

    public abstract void writeToFile(String filename) throws IOException;

    public abstract void setValue(String key, String value);

    public abstract void getValue(String key);
}
