import java.util.ArrayList ;

import java.util.* ;
public class purchase 
{
    ArrayList<book> b=new ArrayList<book>() ;
    void book_store()
    {
        int year ;
        int pu_year ;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            year= s.nextInt();
            pu_year= s.nextInt() ;
            if(year==0 && pu_year==0)
            {
                break;
            }
            book new_b = new book() ;
            new_b.insert_id(pu_year, year);
            b.add(new_b) ;
        }
    }
    void output()
    {
        for(book new_b: b)
        {
            System.out.println( new_b.id + " " + new_b.pur_price + " " + new_b.pur_year + " " + new_b.sell_price);
        }
    }
    
}