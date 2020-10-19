
public class book 
{
    int pur_price ;
    int pur_year ;
    String id ;
    int sell_price ;
    private int pres_year=0 ;
    private int  counter=0 ;
     public void  insert_id(int pp,int py)
    {   
        pur_price=pp ;
        pur_year=py ;
        String id1 ;
        if(pres_year!=py)
        {
            pres_year=py ;
        }
        counter=1 ;
        id1= Integer.toString(py)+"-";
        int rem=Integer.toString(counter).length();
        for(int i=1;i<=6-rem;i++)
        {
            id1+="0";
		    id1+=Integer.toString(counter);
		    counter++;
        }
        id=id1 ;


    }
    public int getsp()
    {
        return pur_price*3/2 ;
    }
    public int  getpp()
    {
        return pur_price ;
    }

        
}