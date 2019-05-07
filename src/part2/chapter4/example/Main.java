package part2.chapter4.example;

import part2.chapter4.example.framework.Factory;
import part2.chapter4.example.framework.Product;
import part2.chapter4.example.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
        System.out.println(((IDCardFactory) factory).getOwners());
    }
}
