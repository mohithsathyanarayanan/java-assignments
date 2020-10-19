
import java.util.ArrayList;
public class billing
{
    public int biller(ArrayList<String> al)
    {   int bill=0 ;
        String str1="Path" ;
        String str2 = "Bio" ;
        for( String s : al )
        {
            if(str1.equals(s))
            {
                bill=bill+1000 ;
            }
            if(str2.equals(s))
            {
                bill=bill+400 ; 
            }
        }
        return bill ;
        
    }
    
}
