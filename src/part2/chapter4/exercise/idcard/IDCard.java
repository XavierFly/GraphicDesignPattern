package part2.chapter4.exercise.idcard;

import part2.chapter4.exercise.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serial;

    public IDCard(String owner, int serial) {
        System.out.println("制作" + owner + "(" + serial + ")" + "的 ID 卡。");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "(" + serial + ")" + "的 ID 卡。");
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
