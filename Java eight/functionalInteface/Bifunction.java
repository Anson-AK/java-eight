package functionalInteface;

import java.util.function.BiFunction;

public class Bifunction {

	public static void main(String[] args) {
		
		BiFunction<String,String,String> bi2= String :: concat;
	    System.out.println(bi2.apply("Jesus","Christ"));
	    BiFunction<String,String,Boolean> bi=(str1,str2)->str1.equalsIgnoreCase(str2);
	    System.out.println(bi.apply("Super","super"));
	    
	    
	}

}
