public class Triangle{
	//pos er midja
	//(height * width)/2 er flatarmal trihyrningsins
	private Point2D pos;
	private Point2D a;
	private Point2D b;
	private Point2D c;

	public Triangle(Point2D a, Point2D b, Point2D c){
		this.width = b.getX - a.getX;
		this.height = c.getY - a.getY;
		pos = new Point2D(width/2,height/2);
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public void move(Point2D m){
		dx = m.getX - this.pos.getX;
		dy = m.getY - this.pos.getY;
		Point2D a = new Point2D(this.a.getX+dx,this.a.getY+dy);
		Point2D b = new Point2D(this.b.getX+dx,this.b.getY+dy);
		Point2D c = new Point2D(this.c.getX+dx,this.c.getY+dy);
		this.pos.reset(m);
		this.a.reset(a);
		this.b.reset(b);
		this.c.reset(c);

	}
	public void rotate(double deg){
		rad = Math.toRadians(deg);
		this.a.reset(Math.cos(rad)+this.a.getX, Math.sin(rad)+this.a.getY);
		this.b.reset(Math.cos(rad)+this.b.getX, Math.sin(rad)+this.b.getY);
		this.c.reset(Math.cos(rad)+this.c.getX, Math.sin(rad)+this.c.getY);

	}
	public Point2D getCenter(){return this.pos;}
	public String toString(){
		return "a: " + this.a + " b: " + this.b + " c: " + this.c;
	}

}