package functionalInteface;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Supplier<Object>	s=()->{Calendar c=Calendar.getInstance(); 
			  return c.getTime();};
	System.out.println(s.get());
      Supplier<Object> s1=new Supplier<Object>()
    		  {
    	          public Object get()
    	          {
    	        	  Calendar c=Calendar.getInstance();
    	        	  return c.getTime();
    	          }
    	          
    		  };
    		  System.out.println(s1.get());
    		  
    List<Student> l=new ArrayList<Student>();
    l.add(new Student("Raja",80));
    l.add(new Student("Ravi",78));
    l.add(new Student("vishal",60));
    l.add(new Student("Barath",45));
    Supplier<List<Student>> sl=()->l;
    System.out.println(sl.get());
    l.forEach(System.out::println);
	}

}
