package Task1;

public class Circle extends Figure {
    static final double PI = 3.14;
    @Override
    public double calculateArea() {
        return PI*(Math.pow(a,2));
    }
}
