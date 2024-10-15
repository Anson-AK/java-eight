package functionalInteface;

public class Student {

	
	private String name;
	private double percentage;
	Student(String name,double percentage)
	{
	  this.name=name;
	  this.percentage=percentage;
	}
	String getName()
	{
		return name;
	}
	double getPercentage()
	{
		return percentage;
	}
	public String toString()
	{
		return getName()+" "+getPercentage();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
