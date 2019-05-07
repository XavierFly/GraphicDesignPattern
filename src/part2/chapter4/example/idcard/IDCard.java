package part2.chapter4.example.idcard;

import part2.chapter4.example.framework.Product;

public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        System.out.println("制作" + owner + "的 ID 卡。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡。");
    }

    public String getOwner() {
        return owner;
    }
}
