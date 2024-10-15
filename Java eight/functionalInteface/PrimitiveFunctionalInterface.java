package functionalInteface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;

public class PrimitiveFunctionalInterface {

	void function()
	{
		System.out.println("Fuction<Return> ");
        IntFunction<String> fi=n->(n>0)?"Value":"Not Value";
        System.out.println(fi.apply(7));
        
        DoubleFunction<List<Integer>> df=new DoubleFunction<>(){
        	public List<Integer> apply(double n)
        	{
        		List<Integer> l=Arrays.asList(1,2,3,4,5);
        		return l;
        	}
        };
        System.out.println(df.apply(5.3).get(0));
        LongFunction<Boolean> lf=new LongFunction<Boolean>() {

			@Override
			public Boolean apply(long n) {
				if(n<0) return false;
        		else 
        		return	true;
			}
        };
        System.out.println(lf.apply(33));
	}
	void predicate()
	{
		System.out.println("   Predicate   ");
		IntPredicate ip=n->(n%2==0)?true:false;
		System.out.println(ip.test(10));
		LongPredicate lp=n->(n>10e4)?true:false;
		System.out.println(lp.test(1000));
		DoublePredicate dp=new DoublePredicate() {
			public boolean test(double n)
			{
			if(n<1) return false;
			else return true;
			}	
		};
		System.out.println(dp.test(0.2));
		
	}
	void consumer()
	{
		System.out.println("      Consumer      ");
		IntConsumer ic=n->System.out.println("Int Consumer: "+n);
		ic.accept(120);
		LongConsumer lc =n->System.out.println(n);
		lc.accept((long) 10e4);
		DoubleConsumer dc=n->System.out.println(n);
		dc.accept(1e-4);
    
	}
	void supplier()
	{
		System.out.println("     Supplier     ");
		   IntSupplier is=()->(4*4);
		   System.out.println(is.getAsInt());
		   LongSupplier ls=()->(1000*1000);
		   System.out.println(ls.getAsLong());
		   DoubleSupplier ds=()->(1.2*1.2);
		   System.out.println(ds.getAsDouble());
		   BooleanSupplier bs=()->(true|false);
		   System.out.println(bs.getAsBoolean());
		   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   PrimitiveFunctionalInterface pfi=new PrimitiveFunctionalInterface();
	   pfi.function();
	   pfi.predicate();
	   pfi.consumer();
	   pfi.supplier();
	  	
	   IntFunction<String[]> arr=n->{
		   String []s=new String[n];
		   for(int i=0;i<n;i++)
		   {
			   s[i]="spin to win";
		   }
		   return s;
	   };
	   String[] str=arr.apply(4);
	   for(String i:str)
		   System.out.println(i);
	   
	   IntFunction<details[]> ar=details[]::new;
	   details []st=ar.apply(3);
	   st[0]=new details("Ravi", 1);
	   st[1]=new details("Raja", 2);
	   st[2]=new details("Rani", 3);
	   for(details i:st)
		   System.out.println(i.toString());
	}
	

}
class details
{
	private String name;
	private int rollNo;
	details(String name,int rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
	}
	public String toString()
	{
		return name+"  "+rollNo;
	}
	
}