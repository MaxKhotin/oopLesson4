package Task1;

public class Trapezoid extends Figure {
    private int b;
    private int h;
    Trapezoid(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }
    public double calculateArea(){
        return 0.5*(a+b)*h;
    }
}
