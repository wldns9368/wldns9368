package day08_13;

public class Test02 {
	/*
	 * ���� ����
	 * �޼��� �ȿ����� ����Ҽ� �ִ�.
	 * ���� ����
	 * ���� ����Ҽ��ִ�.
	 * this �� �������� ���°��̴�.
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
