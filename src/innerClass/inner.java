package innerClass;

public class inner {
	public static void main(String[] args) {
		inner in = new inner();
		inner.inner1 in1 = in.new inner1();
		in1.hello();
	}
	public class inner1{
		public void hello() {
			System.out.println("hi");
		}
		
	}

}
