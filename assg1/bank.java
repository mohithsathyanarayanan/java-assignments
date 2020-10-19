import java.util.Scanner;

public class bank
{
    public savingsaccount addaccount(String name,int rate,int bal )
    {
         savingsaccount sa=new savingsaccount(name , rate, bal);   
         sa.addintrest(rate);
         return sa ;
    }
    public void  printaccount(savingsaccount a[])
    {
        int i ;
        for(i=0;i<a.length && a[i]!=null ;i++)
        {
            System.out.println("name:"+a[i].getname()+ "balance:"+a[i].getbalance());
        }
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        bank b=new bank() ;
        savingsaccount a[]=new savingsaccount[10];
        boolean last=false ;
        int j=-1 ;
        while(!last)
        {
            String scan = input.next() ;
            switch(scan)
            {
                case "N" :
                j++ ;
                a[j]= b.addaccount(input.next(), input.nextInt(),input.nextInt());
                break ;
                case "W" :
                a[j].withdrawl(input.nextInt()) ;
                break;
                case "D":
                a[j].deposit(input.nextInt());
                break ;
                default :
                last=true ;
            }
        b.printaccount(a);
        input.close();    
        }
        
    }
}
	
