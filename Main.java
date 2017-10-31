public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList();
        figures.add(new Point());
        figures.add(new LineSegment(133));
        figures.add(new Triangle(10, 17, 55));
    }
}