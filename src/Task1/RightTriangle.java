package Task1;

public class RightTriangle extends Figure {
    private int b;
    RightTriangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public double calculateArea() {
        return 0.5*a*b;
    }
}
