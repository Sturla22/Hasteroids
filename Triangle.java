public class Triangle extends Shape{
	//pos er midja
	//(height * width)/2 er flatarmal trihyrningsins
	private Point2D pos;
	private Point2D a;
	private Point2D b;
	private Point2D c;
	private final double height;
	private final double width;

	public Triangle(Point2D a, Point2D b, Point2D c){
		this.width = b.getX() - a.getX();
		this.height = c.getY() - a.getY();
		pos = new Point2D(width/2,height/2);
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public double getWidth(){
		return this.width;
	}

	public double getHeight(){
		return this.height;
	}

	public boolean intersects(Shape b){
		Interval ha = new Interval(this.getCenter().getY() + this.getHeight()/2,this.getCenter().getY() - this.getHeight()/2);
		Interval wa = new Interval(this.getCenter().getX() + this.getWidth()/2,this.getCenter().getX() - this.getWidth()/2);
		
		Interval hb = new Interval(b.getCenter().getY() + b.getHeight()/2,b.getCenter().getY() - b.getHeight()/2);
		Interval wb = new Interval(b.getCenter().getX() + b.getWidth()/2,b.getCenter().getX() - b.getWidth()/2);
		return (ha.intersects(hb) && wa.intersects(wb));
	}

	public void move(Point2D m){
		double dx = m.getX() - this.pos.getX();
		double dy = m.getY() - this.pos.getY();
		Point2D a = new Point2D(this.a.getX()+dx,this.a.getY()+dy);
		Point2D b = new Point2D(this.b.getX()+dx,this.b.getY()+dy);
		Point2D c = new Point2D(this.c.getX()+dx,this.c.getY()+dy);
		this.pos.reset(m);
		this.a.reset(a);
		this.b.reset(b);
		this.c.reset(c);

	}
	public void rotate(double deg){
		double rad = Math.toRadians(deg);
		Point2D a = new Point2D(Math.cos(rad)+this.a.getX(), Math.sin(rad)+this.a.getY());
		Point2D b = new Point2D(Math.cos(rad)+this.b.getX(), Math.sin(rad)+this.b.getY());
		Point2D c = new Point2D(Math.cos(rad)+this.c.getX(), Math.sin(rad)+this.c.getY());
		this.a.reset(a);
		this.b.reset(b);
		this.c.reset(c);

	}
	public Point2D getCenter(){return this.pos;}
	public String toString(){
		return "a: " + this.a + " b: " + this.b + " c: " + this.c;
	}
	public void draw(){
			double x[] = new double[] {this.pos.getX()-this.width/2,this.pos.getX()+this.width/2,this.pos.getX()};
			double y[] = new double[] {this.pos.getY()-this.height/2,this.pos.getY()-this.height/2,this.pos.getY()+this.height/2};
			StdDraw.filledPolygon(x,y);
	}

}