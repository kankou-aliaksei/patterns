package space.alex.freeman.adapter.shape;

public class LineShape implements Shape {
    @Override
    public void boundingBox() {
        System.out.println("Bounding box of line");
    }

    @Override
    public Manipulator createManipulator() {
        return new LineManipulator();
    }
}
