public class asteroids{
	public static void main(String[] args){
		StdDraw.setCanvasSize();
		StdDraw.setScale(0.0,100.0);
		//StdDraw.setXscale(0.0,100.0);
		//StdDraw.setYscale(100.0,0.0);
		StdDraw.picture(50,50,"background.png");
		//StdDraw.clear(StdDraw.BLUE);
		StdDraw.setPenColor(StdDraw.ORANGE);
		Point2D a = new Point2D(45,50);
		Point2D b = new Point2D(50,50);
		Point2D c = new Point2D(47.5,55);
		Triangle ship = new Triangle(a,b,c);
		ship.draw();
		Point2D d = ship.getCenter();
		Point2D mid = new Point2D(d.getX() + 10,d.getY());
		ship.move(mid);
		ship.rotate(1000); //er ekki ad virka rett
		ship.draw();
		StdDraw.setPenRadius(.02);
		StdDraw.point(10,10);
		//StdDraw.point(0.200,0.100);
		double j[] = new double[] {45,50,47.5};
		double k[] = new double[] {50,50,55}; 
		//StdDraw.filledPolygon(j,k);

	}
}