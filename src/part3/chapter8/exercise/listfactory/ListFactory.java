package part3.chapter8.exercise.listfactory;

import part3.chapter8.exercise.factory.Factory;
import part3.chapter8.exercise.factory.Link;
import part3.chapter8.exercise.factory.Page;
import part3.chapter8.exercise.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
