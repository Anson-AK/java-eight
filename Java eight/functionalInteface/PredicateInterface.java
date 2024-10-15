package functionalInteface;

import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		
		Predicate<Integer> p=age->age>=60;
		int []arr= {11,22,33,44,55,21,5,7};
		Predicate<Integer> odd=n->n%2==1;
		Predicate<Integer> greater20=n->n>20;
		
		System.out.println(p.test(59));
		System.out.println("Test Method");
		for(Integer i:arr)
		{
			System.out.println(odd.test(i)+" "+greater20.test(i));
		}
	      //odd.negate();
	      //Predicate<Integer> ps=odd.and(even);
	      And(odd.and(greater20),arr);
	      Or(odd.or(greater20),arr);
	      Negate(odd.negate(),arr);
	      System.out.println("***************");
	      System.out.println(odd.negate().test(12));
	      AND(odd,greater20,arr);
         
	}
	private static void AND(Predicate<Integer> odd, Predicate<Integer> greater20, int[] arr) 
	{
		Predicate<Integer> p=odd.and(greater20);
		
		for(Integer i:arr)
		{
			if(odd.and(greater20).test(i))
				System.out.println(odd.and(greater20).test(i)+"  "+i);
   		}
		System.out.println("Negate");
		for(int i:arr)
		{
			if(p.negate().test(i))
				System.out.println(p.negate().test(i)+"  "+i);
		}
		
	}
	public static void Negate(Predicate<Integer> p,int []ar)
	  {
		  System.out.println("Negate Method");
		  for(int i:ar)
		  {
		  boolean result=p.test(i);
		  if(result)
			  System.out.println(result+" "+i);
		  
		  }
		  
	  }
  public static void Or(Predicate<Integer> p,int []ar)
  {
	  System.out.println("OR Method");
	  for(int i:ar)
	  {
	  boolean result=p.test(i);
	  if(result)
		  System.out.println(result+" "+i);
	  
	  }
	  
  }
public static void And(Predicate<Integer> p,int []ar)  
{
	System.out.println("AND Method");
	  for(int i:ar)
	  {
	  boolean result=p.test(i);
	  if(result)
		  System.out.println(result+" "+i);
	  
	  }
	  
  }
}
