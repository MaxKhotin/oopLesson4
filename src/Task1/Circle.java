package Task1;

public class Circle extends Figure {
    private final double PI = 3.14;
    public Circle(int a) {
        this.a = a;
    }
    @Override
    public double calculateArea() {
        return PI*(Math.pow(a,2));
    }
}
