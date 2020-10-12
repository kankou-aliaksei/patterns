package space.alex.freeman.templatemethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Application {
    private List<Document> docs = new ArrayList<>();

    // template method
    final void openDocument(String name) {
        if (canOpenDocument(name)) {
            aboutOpenDocument(name);
            Document document = createDocument(name);
            docs.add(document);
            document.open();
            document.read();
        } else {
            throw new RuntimeException(name + " failed to open");
        }
    }

    // abstract method (factory method)
    public abstract Document createDocument(String name);

    // concrete method
    private void aboutOpenDocument(String name) {
        System.out.println("This is the " + name);
    }

    // hook method
    protected boolean canOpenDocument(String name) {
        return true;
    }


}
