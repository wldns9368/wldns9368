package interface2;

public class Sergeant extends Army{//Solder인터페이스를 어댑터화 시킨 Army추상클래스를 상속받아
	                               //Solder인터페이스의 추상 메서드들을 
	                               //필요한 메서드만 골라서 재정의 가능하다.
	@Override
	public void eat() {
		System.out.println("안먹고 PX");
	}
	
	@Override
	public void sleep() {
		System.out.println("하루 종일 잔다.");
	}
	
	@Override
	public void play() {
		System.out.println("하루 종일 논다.");
	}
}











