package day08_14;//(A < B)�� ��, A % B �� ���� Ŭ����

public class DAS {
	public static void main(String[] args) {
		
	
		for (int i = 1; i < 90; i++) {
			System.out.printf("%d*%d=%d\n", (i / 10)+1, i % 10, ((i / 10)+1) * (i % 10));
		}                                //a % b ���� a�� b���� ������ ���� �� ������ a��ü�� ������
	}

}
