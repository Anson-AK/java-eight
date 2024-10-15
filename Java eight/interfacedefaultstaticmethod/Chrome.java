package interfacedefaultstaticmethod;

public class Chrome implements Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Browser chrome=new Chrome();
        chrome.brower();
	     chrome.mediaPlayer();
	}

	@Override
	public void brower() {
		System.out.println("Chrome Browser");
		
	}
	@Override
	public void mediaPlayer()
	{
		System.out.println("Chrome Media Player");
		
	}

}
