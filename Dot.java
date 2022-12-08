public class Dot extends Graphic
{
    //int x, y;
    String color;
    
    public Dot(int x, int y, String color) {
        super(x, y);
        this.color =  color;
    }
    
    public String print() {
        return "Dot " + x + ", "+ y + ", "+ color;
    }
}