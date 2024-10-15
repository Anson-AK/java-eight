package functionalInteface;

import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

public class ToPrimitiveFunctions {

	public static void main(String[] args) {
		System.out.println("*****To Int*****");
        ToIntFunction<Double> tif=n->n.intValue();
        System.out.println(tif.applyAsInt(10.342));
        ToIntBiFunction<Long,String> tibf=(l,s)->l.intValue()+Integer.parseInt(s);
        System.out.println(tibf.applyAsInt((long) 200000, "10"));
        
        System.out.println("\n*****To Double*****");
        ToDoubleFunction<Integer> tdf=n->n.doubleValue();
        System.out.println(tdf.applyAsDouble(23));
        ToDoubleBiFunction<Integer,Long> dbf=(x,y)->(x+y)/2;
        System.out.println(dbf.applyAsDouble(100,75L));
        
        System.out.println("\n*****To Long*****");
        ToLongFunction<String> tlf=str->Long.parseLong(str);
        System.out.println(tlf.applyAsLong("12000")); 
        ToLongBiFunction<String,Integer> lbf=(str,d)->Long.parseLong(str)+d.longValue();
        System.out.println(lbf.applyAsLong("3456", 12));
        System.out.println(Integer.toBinaryString(7));
        		
	}

}
