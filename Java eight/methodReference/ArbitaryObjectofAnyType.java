package methodReference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ArbitaryObjectofAnyType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Function<String,String> f=str->str.concat(" Nadu");
       System.out.println(f.apply("Thamizh"));
      Function<String,String> s=String :: toLowerCase;
      System.out.println(s.apply("Thamizh"));
       BiFunction<String,String,String> bi=String::concat;
       System.out.println( bi.apply("Thamizh", "Nadu"));
       
       Function<String,Integer> l=String::length;
       System.out.println(l.apply("ThamizhNadu"));
       
      
       
	}

}
