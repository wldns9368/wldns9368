package day08_13;

public class Test07 {
	/*
	 * 오버 로딩
	 * 같은 이름의 메서드지만 매개변수의 갯수 혹은 타입이 다르면 선언 가능하다.
	 */
	
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int c) {
		return c;
	}
	double add(double c) {
		return c;
	}
	
	public static void main(String[] args) {
		Test07 t = new Test07();
		System.out.println(t.add(10.5)+"   "+t.add(10));
	}
}
