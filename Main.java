// Abstract class only
public class Main
{
    Graphic g1, g2, g3;     Dot d1, d2, d3;
    Rect r1, r2, r3;        Circle c1, c2, c3;
    
    public Main() {
        //g1 = new Graphic(3, 4);
        g1 = new Dot(3, 4, "M");
        System.out.println( g1.print() );
        
        g2 = new Rect(3, 4, 5, 6, "K");
        System.out.println( g2.print() );
        g3 = new Circle(3, 4, 5, "P");
        System.out.println( g3.print() );
        
        d1 = new Dot(3, 4, "B"); 
        d2 = new Dot(4, 5, "R"); 
        d3 = new Dot(7, 8, "G");
        
        System.out.println( d1.print() );
        System.out.println( d2.print() );
        System.out.println( d3.print() );

        r1 = new Rect(3, 4, 5, 6, "B"); 
        r2 = new Rect(4, 5, 6, 7, "R"); 
        r3 = new Rect(7, 8, 9, 0, "G");
        
        System.out.println( r1.print() );
        System.out.println( r2.print() );
        System.out.println( r3.print() );        

        c1 = new Circle(3, 4, 5, "B"); 
        c2 = new Circle(4, 5, 6, "R"); 
        c3 = new Circle(7, 8, 9, "G");
        
        System.out.println( c1.print() );
        System.out.println( c2.print() );
        System.out.println( c3.print() );
    }
	public static void main(String[] args) {
		Main m = new Main();
	}
}
