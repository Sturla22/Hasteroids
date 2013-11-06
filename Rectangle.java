public class Rectangle{

	private Point2D pos;
	private final double width, height;


	public Rectangle(Point2D pos,double height, double width){
		this.height = height;
		this.width = width;
		this.pos = pos;

	}

	public void move(Point2D m){
		this.pos.reset(m);
	}

	public Point2D getCenter(){
		return this.pos;
	}

	public double getWidth(){
		return this.width;
	}

	public double getHeight(){
		return this.height;
	}

	public boolean intersects(Shape b){
		Interval ha = new Interval(this.getCenter().getY() + this.height/2,this.getCenter().getY() - this.height/2);
		Interval wa = new Interval(this.getCenter().getX() + this.width/2,this.getCenter().getX() - this.width/2);
		
		Interval hb = new Interval(b.getCenter().getY() + b.height/2,b.getCenter().getY() - b.height/2);
		Interval wb = new Interval(b.getCenter().getX() + b.width/2,b.getCenter().getX() - b.width/2);
		return (ha.intersects(hb) && wa.intersects(wb));
	}
}
