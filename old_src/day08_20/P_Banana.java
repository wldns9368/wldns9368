package day08_20;

public class P_Banana extends P_Fruit { //������
	int n2 = 2;
	P_Banana(){	
		System.out.println("�ٳ���");
		Price = 5;
		color = "���";
		from = "�ѱ�";
	}
	@Override
	void a() {
		System.out.println("2");
		show();
		
	}
	void b1() {
		System.out.println("�ٳ���");
	}
}
