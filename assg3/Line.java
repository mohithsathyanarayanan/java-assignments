import java.util.ArrayList;

public class Line {
	private Point P1,P2;
	public Line(Point P1,Point P2)
	{
		this.P1=P1;
		this.P2=P2;
	}
	double length()
	{
		return P1.getDistance(P2);
	}
	
	public static double totalLength(ArrayList<Line> lines)
	{
		double total=0;
		for(int i=0;i<lines.size();i++)
		{
			total+=lines.get(i).length();
		}
		return total;
	}
}