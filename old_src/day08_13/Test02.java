package day08_13;

public class Test02 {
	/*
	 * 지역 변수
	 * 메서드 안에서만 사용할수 있다.
	 * 전역 변수
	 * 어디든 사용할수있다.
	 * this 가 전역변수 쓰는것이다.
	 * 
	 */
	static int i = 50;

	public static void main(String[] args) {
		Test02 t = new Test02();
		t.a1();
	}
	
	void a1() {
		int i = 30;
		System.out.println(this.i);
	}
	
}
