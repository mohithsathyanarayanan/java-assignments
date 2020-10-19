public class biochem extends labtest
{
    int pid ;
    String tid ;
    int counter ;
    biochem(int  p,String t, int c) // counter is to get the result,101,102,103 etc..
    {
        super(p,t) ;
        counter=c ;
    }
    
    public int set_result()
    {
        int result = 99+counter ;
        return result ;
    }
}