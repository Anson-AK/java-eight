package lambda;

public class Runner {

	public void classicalMethod()
	{
		ImpClass ic=new ImpClass();
		ic.method();
	}
	void anonymousInnerClass()
	{
		IFunctional ic=new IFunctional()
				{
			     public void method()
			      {
			    	  System.out.println("Using Anonymous Inner Class Method");
			      }
				};
				ic.method();
	}
	void lambda()
	{
		IFunctional ic =()->
					System.out.println("Using Lamda Function");
					ic.method();
	 Addition ad=(a,b)->{return a+b;};
	 //(a,b)->a+b; instead of (a,b)->{return a+b;};
		System.out.println("Addition: "+ad.add(10, 102));
	Lambda l=s->s+" WelCome";
			//(s)->{ return s+" WelCome";};
	System.out.println(l.wish("Vanakkam!"));
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Runner r =new Runner();
          r.classicalMethod();
          r.anonymousInnerClass();
          r.lambda();
	}

}
