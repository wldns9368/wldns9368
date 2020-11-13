package day0913;

public abstract class Shape {//추상 클래스 필드
	double area;
	
	public abstract void draw(double w, double h);
	
	final static void function() {
		System.out.println("추상 클래스의 일반 메서드 입니다.");
	}

}

class Rect extends Shape{
	@Override
	public void draw(double w, double h) {
		System.out.println("직사각형 점 4개 연결");
		area = w * h;
		System.out.println("넓이 : " + area);
		
	}
	
}

class Tri extends Shape{
	@Override
	public void draw(double w, double h) {
		System.out.println("삼각형 점 3개 연결");
		area = (w*h)/2;
		System.out.println("넓이 : " + area);
		
	}
}

