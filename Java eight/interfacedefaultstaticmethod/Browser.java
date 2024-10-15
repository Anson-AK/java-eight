package interfacedefaultstaticmethod;

public interface Browser {

	void brower();
	default void mediaPlayer()
	{
		System.out.println("Media Player");
	}
}
