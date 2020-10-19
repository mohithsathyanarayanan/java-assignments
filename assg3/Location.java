

public class Location 
{
	String name;
	Point P;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Point getP() {
		return P;
	}
	public void setP(Point p) {
		P = p;
	}
	Location(Point P,String name)
	{
		this.P=P;
		this.name=name;
	}
}