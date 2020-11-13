package day08_12;

public class Test01 {
	/*
	 * 메서드이름() - 메서드
	 * 
	 * 매서드임(매개변수) {
	 * }
	 * 
	 * 매개변수 - 외부에서 받는 값
	 * 
	 * 메서드 선언
	 * 
	 * 1) 리턴타입 메서드명(매개변수){
	 * return 리턴값;
	 * }
	 * 
	 * 2) void 메서드명() {
	 * 
	 * }
	 */
	public static void main(String[] args) {
		Test01 t = new Test01();
		t.a1();
		t.a2();
		t.a3();
		if(t.a3()==0) {
			System.out.println("a3 매서드는 0 입니다.");
		}
		else if(!(t.a3()==0)) {
			System.out.println("a3 매서드는 0이 아닙니다.");
		}
		System.out.println(t.a4(10, 20));
		
	}
	void a1() {
		System.out.println("안농 >3<");
	}
	void a2() {
		System.out.println("난 정지운이얌~");
	}
    int a3() {
		System.out.println("dd");
		return 0;
	}
	int a4(int a1,int a2) {
		return a1+a2;
	}
	
}
