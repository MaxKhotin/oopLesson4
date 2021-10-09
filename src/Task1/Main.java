package Task1;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Circle(5);
        figures[1] = new Rectangle(3,8);
        figures[2] = new RightTriangle(6,7);
        figures[3] = new Trapezoid(4,8,6);

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].calculateArea());
        }
    }
}
