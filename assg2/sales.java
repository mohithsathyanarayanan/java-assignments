import java.util.*;
public class sales 
{
    ArrayList<saledata> sd = new ArrayList<saledata>() ;
    void ret_data(ArrayList<book> b) 
    {
        Scanner s2 = new Scanner(System.in) ;
        int year2 ;
        String id2 ;
        int temp;
        int spl = 0 ;
        while(true)
        {   
            year2 = s2.nextInt() ;
            id2= s2.next();
            saledata d = new saledata();
            if(year2==0 )
            {
                temp = Integer.parseInt(id2);
                if(temp==0)
                {
                    break;
                }
            }
            for(book new_b : b)
            {
                if(new_b.id == id2)
                {
                spl = new_b.sell_price;
                }
            }
            d.year = year2;
            d.id = id2;
            d.sp = spl ;
            sd.add(d);
            

        }
        

    }

    void printar2(ArrayList<book> b)
    {
        ArrayList<Integer> in = new ArrayList<Integer>() ;
        for(saledata s : sd )
        {
            if(!in.contains(s.year))
            {
                in.add(s.year) ;
            }
        }

        for(int i=0;i< in.size();i++)
        {
            int y= in.get(i) ;
            System.out.print(y+" ");
    	    for(int y1=y;y1>=y-2;y1--)
    	    {
    		    int sp=0;
    		    for(saledata s:sd)
    	        {
    			    if(s.id.startsWith(Integer.toString(y1)) && s.year==y)
    			    {
    				    for(int p=0;p<b.size();p++)
    				    {
    					    if(b.get(p).id.equals(s.id))
                            {    
                               sp +=b.get(p).sell_price;
                            }
                        }
                    }
                }
                System.out.print(sp+" ");
            }
            System.out.println();
        }
    }
    
}
