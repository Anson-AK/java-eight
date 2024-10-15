package interfacedefaultstaticmethod;

public interface Contract2 {

	default int salary(int basic)
	{
		return basic+bonus();
	}

     static	int bonus()
     {
    	 return 2500*12;
     }
     default void test()
     {
    	 System.out.println("test method from contract two");
     }
}
