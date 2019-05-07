package part2.chapter4.exercise.idcard;

import part2.chapter4.exercise.framework.Factory;
import part2.chapter4.exercise.framework.Product;

import java.util.HashMap;

public class IDCardFactory extends Factory {
    private HashMap<Integer, String> database = new HashMap<>();
    private int serial = 100;

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        database.put(card.getSerial(), card.getOwner());
    }

    public HashMap getDatabase() {
        return database;
    }
}