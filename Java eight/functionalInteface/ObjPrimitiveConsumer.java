package functionalInteface;

import java.util.Arrays;
import java.util.List;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.ObjDoubleConsumer;

public class ObjPrimitiveConsumer {

	void intConsumer()
	{
		System.out.println("*****Object Integer Consumer*****");
		List<Integer> list=Arrays.asList(11,22,33,44,55);
        ObjIntConsumer<List<Integer>> ic=(grp,num)->list.forEach(gp->System.out.println(gp*num));
        ic.accept(list, 10);
	}
	void doubleConsumer()
	{
		System.out.println("\n*****Object Double Consumer*****");
		List<Double> dlist=Arrays.asList(11.12,12.34,23.45,34.32,56.34,76.45);
		ObjDoubleConsumer<List<Double>> dc=(list,num)->list.forEach(data->System.out.println(data*num));
		dc.accept(dlist,10);
	}
	void longConsumer()
	{
		System.out.println("\n*****Object Long Consumer*****");
		List<Integer> l=Arrays.asList(1,2,3,4,5,6,7);
		ObjLongConsumer<List<Integer>> lc=(lst,n)->lst.forEach(list->System.out.println(list*n));
		lc.accept(l,200000);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjPrimitiveConsumer opc=new ObjPrimitiveConsumer();
		opc.intConsumer();
		opc.doubleConsumer();
		opc.longConsumer();
		
	}

}
