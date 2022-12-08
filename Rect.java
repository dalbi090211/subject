public class Rect extends Dot
{
    int w, h;
    
    public Rect(int x, int y, int w, int h, String color) {
        super(x, y, color);
        this.w =  w;
        this.h =  h;
    }
    
    public String print() {
        return super.print() + ", Rect " + w + ", "+ h;
    }
}
