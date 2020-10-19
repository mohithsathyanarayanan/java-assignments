import java.util.ArrayList;
public class reception 
{
    int total_req ;
    
    reception(int tr)
    {
       total_req=tr ;
    }
    public void add_request(String test,ArrayList<String> arr)
    {
        arr.add(test);
    }  
    
    public ArrayList<Integer> id_gen(ArrayList<String> arr)
    {
        ArrayList<Integer> p_id = new ArrayList<Integer>() ;
        int s= arr.size();
        for(int i=0;i<s;i++)
        {
            p_id.add(i+1) ;
        }

        return p_id ;
    }
        
    public ArrayList<String> testid_gen(ArrayList<String> arr)
    {
        int counter_p=0 ;
        int counter_b=0 ;
        ArrayList<String> t_id = new ArrayList<String>() ;
        for(String s : arr)
        {
            if(s.equals("Path"))
            {
                counter_p=counter_p+1 ;
                String result = "p"+ Integer.toString(counter_p) ;
                t_id.add(result) ;            
            }

            if(s.equals("Bio"))
            {
                counter_b=counter_b+1 ;
                String result2 = "b"+ Integer.toString(counter_b);
                t_id.add(result2);
            }

        }
        return t_id ;
    }

    


    
        
    
   
    
}
