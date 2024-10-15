package interfacedefaultstaticmethod;

public class DefaultMethod implements Contract1,Contract2 {

	 public int salary(int basic)
	 {
		 return Contract2.super.salary(basic);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       DefaultMethod dm=new DefaultMethod();
      System.out.println( dm.salary(125000));
      dm.test();
       
	}

}
