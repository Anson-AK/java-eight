package functionalInteface;

import java.util.function.BiPredicate;

public class Bipredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BiPredicate<String,String> bi=(s,str)->s.equals(str);
        System.out.println(bi.test("string", "String"));
        
        BiPredicate<String, String>bi1=String :: equalsIgnoreCase;
        System.out.println(bi1.test("string", "String"));       

}
}