package functionalInteface;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class Unaryoperator {

	void basic()
	{
		System.out.println("\nBasic Unary and Binary Operator");
		UnaryOperator<String> uo=str->"Hello "+str;
		System.out.println(uo.apply("World"));
		BinaryOperator<String> bo=(str1,str2)->str1.concat(str2);
		System.out.println(bo.apply("Ave ", "Maria"));
	}
	void integer()
	{
		System.out.println("\nInt Unary and Binary Operator");
		IntUnaryOperator io=d->d*100;
		IntBinaryOperator ibo=(d1,d2)->d1+d2;
		System.out.println(io.applyAsInt(7));
		System.out.println(ibo.applyAsInt(10, 80));
	}
	void lonG()
	{
		System.out.println("\nLong Unary and Binary Operator");
		LongUnaryOperator lu=d->d*10000;
		LongBinaryOperator lb=(d1,d2)->d1*d2;
        System.out.println(lu.applyAsLong(321));
        System.out.println(lb.applyAsLong(120,370));
	}
	void doublE()
	{
		 System.out.println("\nDouble Unary and Binary Operator");
	        DoubleUnaryOperator du=d->d*2;
	        DoubleBinaryOperator db=(d1,d2)->d1+d2;
	        System.out.println(du.applyAsDouble(123.34));
	        System.out.println(db.applyAsDouble(123.45,56.56));
	}
	public static void main(String[] args) {
	
      Unaryoperator uo=new Unaryoperator();
      uo.basic();
      uo.integer();
      uo.lonG();
      uo.doublE();
	}

}
