package interface2;

public class Sergeant extends Army{//인터페이스가 아닌 인터페이스를 어댑터한 클래스 Army를 상속받아 필요한 메서드만 골라서 재정의 가능하다.
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











