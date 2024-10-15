package lambda;

import java.util.function.Function;

public class BuildInFunInterface {

	void anonymousMethod()
	{
		Function<Integer,Double>  f = new Function<Integer, Double>() {
			           public Double apply(Integer usd)
			              {
			              	 return usd*82.5;
			             }
		};
		System.out.println("Anonymous: "+f.apply(10000));
	}
	void lamdaMethod()
	{
		Function<Integer, Double> f= usd->usd*82.5;
		System.out.println("lamda :"+f.apply(10000));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         BuildInFunInterface b=new BuildInFunInterface();
         b.anonymousMethod();
         b.lamdaMethod();
	}

}
