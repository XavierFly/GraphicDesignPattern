package part5.chapter12.exercise2;

public class Main {
    public static void main(String[] args) {
        MultiStringDisplay multiStringDisplay = new MultiStringDisplay();
        multiStringDisplay.add("Morning");
        multiStringDisplay.add("Afternoon");
        multiStringDisplay.add("Night");
        multiStringDisplay.show();

        Display d1 = new SideBorder(multiStringDisplay, '#');
        d1.show();

        Display d2 = new FullBorder(multiStringDisplay);
        d2.show();
    }
}
