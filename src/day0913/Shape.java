package day0913;

public abstract class Shape {//�߻� Ŭ���� �ʵ�
	double area;
	
	public abstract void draw(double w, double h);
	
	final static void function() {
		System.out.println("�߻� Ŭ������ �Ϲ� �޼��� �Դϴ�.");
	}

}

class Rect extends Shape{
	@Override
	public void draw(double w, double h) {
		System.out.println("���簢�� �� 4�� ����");
		area = w * h;
		System.out.println("���� : " + area);
		
	}
	
}

class Tri extends Shape{
	@Override
	public void draw(double w, double h) {
		System.out.println("�ﰢ�� �� 3�� ����");
		area = (w*h)/2;
		System.out.println("���� : " + area);
		
	}
}

