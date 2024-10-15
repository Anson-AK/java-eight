package lambda;

import java.util.function.Function;

public class MoreFunctionalInterfaces {

	void stringLength()
	{
		Function<String,Integer> f=new Function<String,Integer>()
				{
			      public Integer apply(String str)
			       {
			    	   return str.length();
			       }
				};
			System.out.println("String Length: "+f.apply("courage"));
	}
	void toUpper()
	{
		Function<String,String> f=new Function<String,String>()
				{
			       public String apply(String str)
			       {
			    	   return str.toUpperCase();
			       }
				};
		System.out.println(f.apply("bravery"));
	}
	void lambdaStrlen()
	{
		Function<String,Integer> f=str->str.length();
		System.out.println(f.apply("courage"));
	}
	void lambdaToupper()
	{
		Function<String,String> f=str->str.toUpperCase();
     		System.out.println(f.apply("bravery"));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MoreFunctionalInterfaces more=new MoreFunctionalInterfaces();
      more.stringLength();
      more.toUpper();
      more.lambdaStrlen();
      more.lambdaToupper();
      Function<String,String> first=str->
      {
    	  System.out.println(str);
    	  return "Second";
      };
      Function<String,String> second=s->
      {
    	  //System.out.println("Second");
    	  //System.out.println(s);
    	  return s;
      };
      
      System.out.println(first.andThen(second).apply("First"));
      System.out.println("##############");
      //System.out.println(second.andThen(first).apply("Second"));
     // System.out.println(second.andThen(first).apply(""));
     //System.out.println( first.compose(second).apply("Second"));
      
	}

}
