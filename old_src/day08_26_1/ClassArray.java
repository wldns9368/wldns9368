package day08_26_1;

public class ClassArray {
	/*
	 * Ŭ���� �迭 ����
	 */
	static Ar[] aray1 = new Ar[100];
	static Ar[] aray2 = {
			new Ar(),
			new Br()
	};
	Ar a = new Ar();
	
	public static void main(String[] args) {
//		System.out.println(aray2[1].a2());
	}
}

class Ar extends ClassArray{
	public int a1() {
		System.out.println("�ȳ�");
		return 10;
	}
}

class Br extends Ar{

	void a2() {
		
	}
}