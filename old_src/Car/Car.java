package Car;

public class Car {
	/*
	 * ������ �ʱ�ȭ ������ �����ִ�. �޼���� ���� ����� ������ ������, ������ ������, ����Ÿ�Ե� ����. ���� �̰Ŵ� �޼����� �θ����ʰ�
	 * �����ڶ�� �θ���. Alt + Shift + s -> o
	 */
	String Brand;
	int Price;
	String Color;
	int Speed;

	// ���⼭ Car�� Ŭ���� ���ϸ�

	void info() {
		System.out.println("���� : " + Brand + "\n���� : " + Price + "\n���� : " + Color);
	}

	void speedup() {
		Speed++;
		System.out.println("���� �ӵ� : " + Speed);
	}

	
	

}
