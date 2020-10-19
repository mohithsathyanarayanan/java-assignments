import java.util.* ;
public class test 

{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in) ;
        int num_req = s.nextInt() ;
        ArrayList<String> arr = new ArrayList<String>();
        reception r = new reception(num_req);
        for(int x=0;x<num_req;x++)
        {
            String req_test = s.next() ;
            r.add_request(req_test,arr) ;
            
        }
        billing bill = new billing() ;
        int total_bill = bill.biller(arr);
        ArrayList<Integer> patientid_list = new ArrayList<Integer>() ;
        patientid_list=r.id_gen(arr) ;
        ArrayList<String> testid_list = new ArrayList<String>() ;
        testid_list=r.testid_gen(arr) ;
        ArrayList<pathogen> path = new ArrayList<>() ;
        ArrayList<biochem> bio = new ArrayList<>() ;
        int j = 0 ;
        int c_p = 1 ;
        int c_b = 1 ;
        for(String test : arr)
        {
            if (test.equals("Path"))
            { 
                pathogen p = new pathogen(patientid_list.get(j),testid_list.get(j),c_p);                
                path.add(p);
                c_p++ ;
                j++ ;
            }

            if(test.equals("Bio"))
            {
                biochem b = new biochem(patientid_list.get(j), testid_list.get(j), c_b);
                bio.add(b) ;
                c_b++ ;
                j++ ;
            }
        }   
        int total_bio=bio.size() ;
        int total_path=path.size() ;
        
        System.out.println("Total billed: "+ total_bill );
        System.out.println("Reports:");
        
      
        int bio_count=0 ;
        int path_count=0 ;
        for(int x :patientid_list)
        {
            String type1="Bio";
            String type2="Path";
            if(type1.equals(arr.get(x-1)))
            {
                
                System.out.println(bio.get(bio_count).get_pid()+" "+bio.get(bio_count).get_tid()+" "+bio.get(bio_count).set_result());
                bio_count++ ;
            }

            if(type2.equals(arr.get(x-1)))
            {
                System.out.println(path.get(path_count).get_pid()+" "+path.get(path_count).get_tid()+" "+path.get(path_count).set_result());
                path_count++ ;
            }
        }
        
        System.out.println("Total tests:");
        System.out.println("BioChem: " + total_bio);
        System.out.println("Path: " + total_path);
        
        
    }
    
}
