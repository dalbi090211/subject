public abstract class Graphic
{
    int x, y;
    
    public Graphic(int x, int y) {
        this.x =  x;    
        this.y =  y;
    }
    
    public abstract String print();
}
