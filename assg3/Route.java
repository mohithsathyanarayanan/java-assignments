import java.util.ArrayList;


public class Route 
{
	ArrayList<Road> r;
	Route(ArrayList<Road> r)
	{
		this.r=r;
	}
	static boolean isConnected(ArrayList<Road> r)
	{
		boolean flag=true;
		for(int i=0;i<=r.size()-2;i++)
		{
			if(r.get(i).el.P.getX()!=r.get(i+1).sl.P.getX() || r.get(i).el.P.getY()!=r.get(i+1).sl.P.getY())
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	public double computeRouteLength()
	{
		ArrayList<Line> l=new ArrayList<Line>();
		for(int i=0;i<r.size();i++)
		{
			Line line=new Line(r.get(i).sl.P,r.get(i).el.P);
			l.add(line);
		}
		double ans=Line.totalLength(l);
		return ans;
	}
	
	public double computeMaxWidth()
	{
		double ans=0;
		ans=r.get(0).width;
		for(int i=1;i<r.size();i++)
		{
			if(ans>r.get(i).width)
				ans=r.get(i).width;
		}
		return ans;
	}
	
	public  String printDetails()
	{
		String rr = new String();
		rr += " Start at "+r.get(0).sl.name+".";
		//System.out.print(" Start at "+r.get(0).sl.name+".");
		for(int i=0;i<r.size();i++)
		{
		rr+=" Follow "+r.get(i).name+" to "+r.get(i).el.name+".";
		//System.out.print(" Follow "+r.get(i).name+" to "+r.get(i).el.name+".");
		}
		return rr;
	}
}
