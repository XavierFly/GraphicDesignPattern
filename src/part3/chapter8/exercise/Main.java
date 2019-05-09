package part3.chapter8.exercise;

import part3.chapter8.exercise.factory.Factory;
import part3.chapter8.exercise.factory.Link;
import part3.chapter8.exercise.factory.Page;
import part3.chapter8.exercise.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example1: java Main listfactory.ListFactory");
            System.out.println("Example2: java Main tablefactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Page page = factory.createYahooPage();
        page.output();
    }
}
