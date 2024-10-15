package methodReference;
interface Instance
{
	void vanakkam(String name);
}
public class InstanceMethodExample {

	void greet(String name)
	{
		System.out.println("Vanakkam "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         InstanceMethodExample ime=new InstanceMethodExample();
         Instance i=ime::greet;
         i.vanakkam("Raja");
	}

}
