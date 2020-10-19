public class Point {
	private double x,y;
	
	public Point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double getDistance(Point P)
	{
		return Math.sqrt(Math.pow(P.x-this.x,2)+Math.pow(P.y-this.y,2));
	}
}