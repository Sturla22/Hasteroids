public class asteroids{
	public static void main(String[] args){
		StdDraw.setCanvasSize();
		StdDraw.setScale(0.0,100.0);
		//StdDraw.picture(50,50/2,"background.png");
		//StdDraw.clear(StdDraw.BLUE);
		//StdDraw.setPenColor(StdDraw.ORANGE);
		Point2D a = new Point2D((10.0)-2,(50.0)-5);
		Point2D b = new Point2D((10.0)+2,(50.0)-5);
		Point2D c = new Point2D((10.0),(50.0)+5);
		Triangle ship = new Triangle(a,b,c);
		Point2D mid = new Point2D(50,50);
		ship.move(mid);
		ship.rotate(90);
		ship.draw();
		//StdDraw.setPenRadius(2.02);
		//StdDraw.point(10,10);
		//StdDraw.point(0.200,0.100);

	}
}