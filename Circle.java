public class Circle extends Dot
{
    int d;
    
    public Circle(int x, int y, int d, String color) {
        super(x, y, color);
        this.d =  d;
    }
    
    public String print() {
        return super.print() + ", Circle " + d;
    }
}