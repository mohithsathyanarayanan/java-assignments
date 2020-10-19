

public class savingsaccount
{
    String name ;
    int rate;
    int balance ;
    savingsaccount(String n,int r,int b)
    {
        this.name=n ;
        this.rate=r ;
        this.balance=b ;
    }
    public int getbalance()
    {
        return this.balance ;
    }
    public int deposit(int amount)
    {
        this.balance=this.balance+amount ;
        return this.balance ;
    }
    public int withdrawl(int amount)
    {
        this.balance=this.balance-amount ;
        return this.balance ;
    }
    public String getname()
    {
        return this.name ;

    }

    float addintrest(int w)
    {
        float a ;
        a=this.balance+(this.balance*w)/100 ;
        return a ;
    }



    
}
