package part8.chapter18.example;

import part8.chapter18.example.game.Gamer;
import part8.chapter18.example.game.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("当前状态：" + gamer);

            gamer.bet();

            System.out.println("所持金钱为 " + gamer.getMoney() + " 元。");
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("（所持金钱增加了许多，因此保持游戏当前状态。）");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("（所持金钱减少了许多，因此将游戏恢复至以前的状态。）");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println();
        }
    }
}
