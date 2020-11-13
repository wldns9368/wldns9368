package Car;

public class Car {
	/*
	 * 생성자 초기화 목적을 갖고있다. 메서드와 같은 기능을 가지고 있지만, 리턴이 없으며, 리턴타입도 없다. 따라서 이거는 메서드라고 부르지않고
	 * 생성자라고 부른다. Alt + Shift + s -> o
	 */
	String Brand;
	int Price;
	String Color;
	int Speed;

	// 여기서 Car는 클래스 파일명

	void info() {
		System.out.println("차종 : " + Brand + "\n가격 : " + Price + "\n색깔 : " + Color);
	}

	void speedup() {
		Speed++;
		System.out.println("현재 속도 : " + Speed);
	}

	
	

}
