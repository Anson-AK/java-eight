package functionalInteface;

import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;

public class PrimitiveFunctions {

	void fromInt()
	{
		System.out.println("******From Integer******");
		IntToLongFunction ilf=n->(long)n*n;
	   System.out.println("IntToLongFunction: "+ilf.applyAsLong(12000));
	   IntToDoubleFunction idf=new IntToDoubleFunction()
			   {
		         public double applyAsDouble(int n)
		         {
		        	 System.out.println("IntToDoubleFunction: "+(double)n*n+'\n');
		        	 return (double)n*n;
		         }
			   };
			   idf.applyAsDouble(5);
	}
	void fromDouble()
	{
		System.out.println("******From Double******");
		DoubleToIntFunction dif=d->(int)d;
		System.out.println("DoubleToIntFunction: "+dif.applyAsInt(4.99));
		DoubleToLongFunction dlf=d->(long)d;
		System.out.println("DoubleToLongFunction: "+dlf.applyAsLong(130.92)+'\n');
		
	}
	void fromLong()
	{
		 System.out.println("******From Long******");
		   LongToIntFunction lif=n->(int)n*2;
		   System.out.println("LongToIntFunction: "+lif.applyAsInt(7));
		   LongToDoubleFunction ldf=n->(double)n;
		   System.out.println("LongToDoubleFunction: "+ldf.applyAsDouble(200000)+'\n');

	}
	public static void main(String[] args) {
				  PrimitiveFunctions pf=new PrimitiveFunctions();
				  pf.fromInt();
				  pf.fromDouble();
				  pf.fromLong();
	}

}
