package day22;

public class OutClass {
	int outData;
	
	public OutClass() {
		System.out.println("외부 클래스 생성자 호출 됨.");
	}
	
	public void showOuter() {
		System.out.println("외부 클래스의 메서드 호출 됨.");
	}
	
	public class InnerClass{
		int inData;
		
		public InnerClass() {
			System.out.println("내부 클래스의 생성자 호출 됨.");
		}
		
		public void showInner() {
			outData = 20;
			
			System.out.println("내부 클래스의 메서드 호출 됨.");
			System.out.println("outData : "+outData);
			showOuter();
		}
		
	}
	
	public static void main(String[] args) {
		OutClass out = new OutClass();
		OutClass.InnerClass in = out.new InnerClass();//내부 클래스는 외부 클래스의 생성자를 불러오지는 않는다.
		in.showInner();
	}
}













