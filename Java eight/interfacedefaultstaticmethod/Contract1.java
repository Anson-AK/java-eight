package interfacedefaultstaticmethod;

public interface Contract1 {
      
	default int salary(int basic)
	{
		return basic+bonus();
	}

     static	int bonus()
     {
    	 return 2000*12;
     }
}
