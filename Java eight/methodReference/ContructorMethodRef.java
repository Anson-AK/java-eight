package methodReference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
public class ContructorMethodRef {

	public ContructorMethodRef (String str)
	{
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> heros_list=new ArrayList<>();
       heros_list.add("spiderman");
       heros_list.add("ironman");
       heros_list.add("Hulk");
       heros_list.add("Thor");
       heros_list.add("ironman");
       System.out.println(heros_list);
       Function<ArrayList<String>,HashSet<String>> fs=hlist->new HashSet<String>();
       fs.apply(heros_list);
       Function<ArrayList<String>,HashSet<String>> heros_set=HashSet::new;
       HashSet<String> heros=heros_set.apply( heros_list);
       System.out.println(heros);
       
       ContructorMethodRef cmf=new ContructorMethodRef("WelCome");
       Developer d=ContructorMethodRef::new;
       d.display("Hello");
       heros.forEach(ContructorMethodRef :: new);
	}
   void print(String str)
   {
	   System.out.println(str);
   }
}
