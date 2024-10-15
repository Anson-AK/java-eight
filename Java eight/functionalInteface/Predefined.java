package functionalInteface;

import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongFunction;

public class Predefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        IntFunction<String> i=n->(n<0)?"Negative":"Positive";
        System.out.println(i.apply(8));
        LongFunction<Boolean> lf=n->(n<1)?false:true;
        System.out.println(lf.apply(0));
        DoubleFunction<Integer> df=n->(n==0)?0:1;
        System.out.println(df.apply(4.3));
        
        IntPredicate ip=n->(n<=0)?false:true;
        System.out.println(ip.test(5));
	}

}
