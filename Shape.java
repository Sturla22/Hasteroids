public abstract class Shape {
// Notkun: p = s.getCenter()
// Fyrir: ekkert
// Eftir: p er midjan a s
	public abstract Point2D getCenter();
// Notkun: c = s.intersects(o)
// Fyrir: ekkert
// Eftir: c er true of s og o skarast
	public abstract boolean intersects(Shape o);

	public abstract void move(Point2D m);

	public abstract void draw();

	public abstract double getWidth();

	public abstract double getHeight();
}