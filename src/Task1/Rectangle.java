package Task1;

public class Rectangle extends Figure {
    private int b;
    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculateArea() {
        return (b*a);
    }
}
