package day08_20;

public class P_Banana extends P_Fruit { //다형성
	int n2 = 2;
	P_Banana(){	
		System.out.println("바나나");
		Price = 5;
		color = "노랑";
		from = "한국";
	}
	@Override
	void a() {
		System.out.println("2");
		show();
		
	}
	void b1() {
		System.out.println("바나나");
	}
}
