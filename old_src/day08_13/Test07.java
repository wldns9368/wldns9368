package day08_13;

public class Test07 {
	/*
	 * ���� �ε�
	 * ���� �̸��� �޼������� �Ű������� ���� Ȥ�� Ÿ���� �ٸ��� ���� �����ϴ�.
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
