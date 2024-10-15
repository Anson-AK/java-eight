package functionalInteface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> l=Arrays.asList(11,22,33,44,55);
        List<Double> d=Arrays.asList(11.2,22.1,23.3,42.1);
        Consumer<Integer> c=n->System.out.println(n);
        l.forEach(c);
        System.out.println("===============================");
        l.forEach(System.out::println);
        System.out.println("===============================");
        l.forEach(n->{
        	n=n*n;
        	System.out.println(n);
        });
        d.forEach(input->System.out.println(input));
        
	}

}
