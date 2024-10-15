package interfacedefaultstaticmethod;

public class Edge implements Browser{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Browser edge=new Edge();
        edge.brower();
        edge.mediaPlayer();
	}

	@Override
	public void brower() {
		// TODO Auto-generated method stub
		System.out.println("Edge Browser");
	}

}
