package day08_12;

public class Test01 {
	/*
	 * �޼����̸�() - �޼���
	 * 
	 * �ż�����(�Ű�����) {
	 * }
	 * 
	 * �Ű����� - �ܺο��� �޴� ��
	 * 
	 * �޼��� ����
	 * 
	 * 1) ����Ÿ�� �޼����(�Ű�����){
	 * return ���ϰ�;
	 * }
	 * 
	 * 2) void �޼����() {
	 * 
	 * }
	 */
	public static void main(String[] args) {
		Test01 t = new Test01();
		t.a1();
		t.a2();
		t.a3();
		if(t.a3()==0) {
			System.out.println("a3 �ż���� 0 �Դϴ�.");
		}
		else if(!(t.a3()==0)) {
			System.out.println("a3 �ż���� 0�� �ƴմϴ�.");
		}
		System.out.println(t.a4(10, 20));
		
	}
	void a1() {
		System.out.println("�ȳ� >3<");
	}
	void a2() {
		System.out.println("�� �������̾�~");
	}
    int a3() {
		System.out.println("dd");
		return 0;
	}
	int a4(int a1,int a2) {
		return a1+a2;
	}
	
}
