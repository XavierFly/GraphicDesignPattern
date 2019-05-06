package part1.chapter2.exercise1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("C:\\Users\\XavierWang\\Desktop\\Test\\file.txt");
            fileIO.setValue("year", "2004");
            fileIO.setValue("month", "4");
            fileIO.setValue("day", "21");
            fileIO.writeToFile("C:\\Users\\XavierWang\\Desktop\\Test\\newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
