package part4.chapter10.exercise2;

public class Main {
    public static void main(String[] args) {
        String[] data = {"Dumpty", "Bowman", "Carroll", "Elfland", "Alice"};
        // SortAndPrint sortAndPrint1 = new SortAndPrint(data, new SelectionSorter());
        // sortAndPrint1.execute();

        SortAndPrint sortAndPrint2 = new SortAndPrint(data, new QuickSorter());
        sortAndPrint2.execute();
    }
}
