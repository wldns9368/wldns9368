package day08_14;//(A < B)일 때, A % B 값 연습 클래스

public class DAS {
	public static void main(String[] args) {
		
	
		for (int i = 1; i < 90; i++) {
			System.out.printf("%d*%d=%d\n", (i / 10)+1, i % 10, ((i / 10)+1) * (i % 10));
		}                                //a % b 에서 a가 b보다 작으면 나눌 수 없으니 a자체가 나머지
	}

}
