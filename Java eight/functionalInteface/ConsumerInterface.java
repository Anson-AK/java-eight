package functionalInteface;

import java.util.function.Consumer;

public class ConsumerInterface {

	void methodConsumer()
	{
		String s="Program";
		Consumer<String> c=str->System.out.println(str+" World");
		c.accept("Hello");
        Consumer<String> d=str->{str="My First"+str;
        System.out.println(str);};
        d.accept(s);
        c.andThen(d).accept(" Hello");
        System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ConsumerInterface ci=new ConsumerInterface();
          ci.methodConsumer();
	}

}
