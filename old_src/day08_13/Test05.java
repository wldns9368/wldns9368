package day08_13;

public class Test05 {//��������
	
	int a1=10;



	void a1() {
		
	}
	
	int b(int a1) {
		return this.a1-a1;
	}
		
	
}

class Test06 {//�ٸ� Ŭ����
	
	public static void main(String[] args) {
		Test05 t = new Test05();
		
		System.out.println(t.b(3));
		System.out.println("�ȳ��");
	}
	
	
}
