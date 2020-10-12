package space.alex.freeman.adapter.shape;

import space.alex.freeman.adapter.shape.library.TextView;

public class TextAdapterByInheritance extends TextView implements Shape {
    @Override
    public void boundingBox() {
        getExtent();
    }

    @Override
    public void getExtent() {
        System.out.println("Overriding get extent method");
    }

    @Override
    public Manipulator createManipulator() {
        return new TextManipulator();
    }
}
