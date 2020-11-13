package day08_11;

public class Test02 {
	public static void main(String[] args) {
		/*
		 * 자동형 변환
		 * 실수와 정수의 연산
		 * 
		 * 정수 타입에 실수
		 * 실수 타입에 정수
		 * (int) 변수명
		 * (double) 변수명
		 */
		int a1 = 10;
		double a2 = 10.3;
		int a3 = a1+(int)a2;
		String z1 = "안녕";
		String z2 = "하세요";
		String z3 = z1+z2;
		
		System.out.println(z3);
	}
}
