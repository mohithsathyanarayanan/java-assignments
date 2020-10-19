import java.util.*;

public class test{
    public static void main(String[] args){
        store ss = new store();
       // System.out.println("Enter purchase data - year,price");
        ss.p.book_store();
        
        //System.out.println("Enter sales data - year,id");
        ss.s.ret_data(ss.p.b);
        ss.s.printar2(ss.p.b);
    }
}
