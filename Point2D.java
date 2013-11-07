public class Point2D {
    private double x,y;
	// Notkun: p = new Point2D(x,y)
    // Fyrir:  ekkert
    // Eftir:  p er punkturinn med hnitin (x,y)
    public Point2D(double x, double y) {
	this.x = x;
	this.y = y;
    }
    // Notkun: a = p.getX()
    // Fyrir:  punkturinn p er til
    // Eftir:  a er x-hnit p
    public double getX() { return x;}
    // Notkun: a = p.getY()
    // Fyrir:  punkturinn p er til
    // Eftir:  a er y-hnit p
    public double getY() { return y;}
    // Notkun: x = a.distanceTo(b)
	// Fyrir: ekkert
	// Eftir: x er fjarlaegdin milli a og b
	public double distanceTo(Point2D b) {
	return Math.sqrt(Math.pow(this.getX()-b.getX(),2) + Math.pow(this.getY()-b.getY(),2));
	}
    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}
    public void reset(Point2D b) {
        this.setX(b.x);
        this.setY(b.y);
    }
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
}


