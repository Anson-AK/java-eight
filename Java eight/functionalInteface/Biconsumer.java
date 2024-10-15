package functionalInteface;

import java.util.function.BiConsumer;

public class Biconsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       BiConsumer<String,String> bc=(str,s)->System.out.println(str+s);
       bc.accept("United"," Kingdom");
	}

}
