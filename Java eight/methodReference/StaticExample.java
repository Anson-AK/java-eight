package methodReference;

@FunctionalInterface
interface Addition
{
    void add(int a,int b);	
}
public class StaticExample {

	public static int sum(int n,float m)
	{
		System.out.println(n+m);
		return n+(int)m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Addition a=StaticExample::sum;
		a.add(10, 20);
	}
	
}
