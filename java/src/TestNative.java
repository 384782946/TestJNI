
public class TestNative {
	
	static{
		System.loadLibrary("TestJni");
	}

	public TestNative() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestNative().SayHello();
	}
	
	public native void SayHello();
}
