package space.alex.freeman.adapter.shape;

import space.alex.freeman.adapter.shape.library.TextView;

public class DrawingEditor {
    public static void main(String[] args) {
        Shape line = new LineShape();
        handleShape(line);
        System.out.println();
        Shape text = new TextAdapter(new TextView());
        handleShape(text);
    }

    public static void handleShape(Shape shape) {
        shape.boundingBox();
        shape.createManipulator().move();
    }
}
