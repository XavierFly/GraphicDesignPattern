package part3.chapter8.exercise.factory;

public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("没有找到" + classname + "类。");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);

    public Page createYahooPage() {
        Link link = createLink("yahoo", "http://www.yahoo.com");
        Page page = createPage("yahoo", "yahoo");
        page.add(link);
        return page;
    }
}
