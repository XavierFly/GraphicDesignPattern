package part3.chapter8.example.tablefactory;

import part3.chapter8.example.factory.Factory;
import part3.chapter8.example.factory.Link;
import part3.chapter8.example.factory.Page;
import part3.chapter8.example.factory.Tray;

public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
