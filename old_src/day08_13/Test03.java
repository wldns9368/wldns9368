package day08_13;

public class Test03 {
	/*
	 * 메서드 
	 * 
	 * 클래스(공통 요소로 묶자)
	 * 
	 * class 클래스명 {
	 * 	필드(변수,메서드)
	 * }
	 * 
	 * 추상화 객체화
	 * 전역변수를 쓸때 전역변수와 지역변수 겹치는 변수명 x >> this 안써도 됨
	 */
	public static void main(String[] args) {
		Test04 t = new Test04();
		t.a1();
		t.setA1(20);
		System.out.println(t.getA1());
	}
}
