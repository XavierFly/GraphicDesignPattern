package part5.chapter11.exercise;

public abstract class Entry {
    protected Entry parent;

    public abstract String getName();

    public abstract int getSize();

    public void add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String getFullName() {
        StringBuffer fullname = new StringBuffer();
        Entry entry = this;
        do {
            fullname.insert(0, "/" + entry.getName());
            entry = entry.parent;
        } while (entry != null);
        return fullname.toString();
    }

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
