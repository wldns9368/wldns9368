package Extends;

/*
 * ??‹ ?´?˜?Š¤
 */
public class B extends A{
	
	void a1() {
		a1=a1+a1;
		System.out.println(a1);
		System.out.println(sum());
		setAge(10);
		System.out.println(getAge());
	}
	public static void main(String[] args) {
		B b = new B();
		b.a1();
	}
}	
