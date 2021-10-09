package Task1;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Circle();
        figures[1] = new Rectangle();
        figures[2] = new RightTriangle();
        figures[3] = new Trapezoid();

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].calculateArea());
        }
    }
}
