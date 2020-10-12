package space.alex.freeman.adapter.shape;

import space.alex.freeman.adapter.shape.library.TextView;

public class TextAdapter implements Shape {
    private TextView textView;

    public TextAdapter(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void boundingBox() {
        textView.getExtent();
    }

    @Override
    public Manipulator createManipulator() {
        return new TextManipulator();
    }
}
