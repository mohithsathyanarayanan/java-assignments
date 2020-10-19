import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		ArrayList<Location> loc=new ArrayList<Location>();
		for(int i=0;i<n1;i++)
		{
			int x,y;
			String name;
			x=sc.nextInt();
			y=sc.nextInt();
			name=sc.next();
			Location l=new Location(new Point(x,y),name);
			loc.add(l);
		}
		int n2=sc.nextInt();
		ArrayList<Road> rd=new ArrayList<Road>();
		for(int i=0;i<n2;i++)
		{
			int sind,eind;
			String name;
			double width;
			sind=sc.nextInt();
			eind=sc.nextInt();
			name=sc.next();
			width=sc.nextDouble();
			Road r=new Road(loc.get(sind),loc.get(eind),name,width);
			rd.add(r);
		}
		int n3=sc.nextInt();
		String a[] = new String[n3];
		for(int i=1;i<=n3;i++)
		{
			int z=sc.nextInt();
			ArrayList<Road> route=new ArrayList<Road>();
			for(int j=0;j<z;j++)
			{
				int y=sc.nextInt();
				route.add(rd.get(y));
			}
			String s = new String();
			s+= "Route "+i+":";
			//System.out.print("Route "+i+":");
			if(Route.isConnected(route))
			{
				
				Route rot=new Route(route);
				double r = Math.round(rot.computeRouteLength()*100.0)/100.0;				
				//System.out.print(" Length "+rot.computeRouteLength()+",");
				s+=" Length "+ r +",";
				//System.out.print(" Length "+ r +",");
				//System.out.print("max width "+rot.computeMaxWidth()+":");
				s+="max width "+rot.computeMaxWidth()+":";
				s+=rot.printDetails();
				//System.out.println();
				a[i-1] = s;
			}
			else
			{
				a[i-1] = "Route "+i+": Invalid route";
				//System.out.println("Route "+i+": Invalid route");
			}
				
		}
		for(int i=0;i<n3;i++)
			{
			System.out.println(a[i]);
				}
		
		
	}

}
