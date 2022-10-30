
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo d = new MethodsDemo();
		String name = d.getdata();
		System.out.println(name);

		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getuserdata();
		getdata2();
	}

	// Method

	public String getdata() {
		System.out.println("Hello world");
		return "rahul shetty";
	}

	public static String getdata2() {
		System.out.println("Hello world");
		return "rahul shetty";
	}

}
