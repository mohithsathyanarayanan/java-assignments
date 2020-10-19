public class pathogen extends labtest
{
    int pid ;
    String tid ;
    int counter ; // to set the result, b,b,m 
    pathogen(int p,String t,int c)
    {
        super(p, t);
        counter=c ;

    }

    public String set_result()
    {
        String result=null ;
        int mod = counter%3 ;
        if(counter<3)
        {
            switch(counter)
            {
                case(1):
                result="benign" ;

                case(2):
                result="benign" ;
            }   
        }

        if(counter>=3)
        {
            if(mod==0)
            {
                result="malignant" ;
            }
            if(mod==1)
            {
                result="benign" ;
            }
            if(mod==2)
            {
                result="benign" ;
            }
        }
        return result ;
    }
}