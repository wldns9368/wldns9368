package day08_26_1;

import java.util.Random;

/*
 * 각각의 타입을 확인할 떄 사용하는 문법
 * 
 * 값 instanceof 클래스타입 : 값이 클래스 타입이니?(작은 것에서 큰 것)
 * 
 * 자녀객체 instanceof 부모타입 = true
 * 부모객체 instanceof 자식타입 = false// 자식이 부모의 종류가 될 수 있어도
 *                                // 부모가 자식의 종류가 될 순 없기 때문이다.
 *   객체   instanceof 객체타입 = true
 */	
class Avengers{
	public void fight() {
		System.out.println("Avengers Assemble");
	}
}

class IronMan extends Avengers{
	@Override
	public void fight() {
		System.out.println("Beam!");
	}
}

class Thor extends Avengers{
	@Override
	public void fight() {
		System.out.println("Thunder from Hammer!");
	}
}

class Hulk extends Avengers{
	@Override
	public void fight() {
		System.out.println("Big green monster!");
	}
}

class CaptainAmerica extends Avengers{
	@Override
	public void fight() {
		System.out.println("Throw the SHIELD!");
	}
}

class HawkEye extends Avengers{
	@Override
	public void fight() {
		System.out.println("Arrow Bomb!");
	}
}

class BlackWidow extends Avengers{
	@Override
	public void fight() {
		System.out.println("kick and punch!");
	}
}

class Loki extends Avengers{
	@Override
	public void fight() {
		System.out.println("Duplication!");
	}
}

public class Polymorphism {
	//타입명 객체명 = new 클래스명  
	//Avengers a = new Avengers <<< 어벤저스 타입에 속한 어벤저스 값을 사용
	//Avengers a = new IronMan  <<< 어벤저스 타입에 속한 아이언맨 값을 사용
	
	//Avengers a <<< 어벤저스 타입 즉, 어벤저스 타입의 클래스가 담긴 저장공간일 뿐이지 실제 할당된 값은 없으므로,
	//               new를 했을 때의 모든 어벤저스 타입의 하나의 클래스 객체가 될 수 있다.
	public boolean whoAreYou(Avengers a){
		boolean isLoki = false;
		
		if(a instanceof IronMan) {
			System.out.println("I AM IRONMAN");
		}else if(a instanceof Thor) {
			System.out.println("I AM Thor");
		}else if(a instanceof CaptainAmerica) {
			System.out.println("I AM CaptainAmerica");
		}else if(a instanceof Hulk) {
			System.out.println("I AM Hulk");
		}else if(a instanceof BlackWidow) {
			System.out.println("I AM BlackWidow");
		}else if(a instanceof HawkEye) {
			System.out.println("I AM HawkEye");
		}else if(a instanceof Loki) {
			isLoki = true;
			System.out.println("We found Loki!!");
		}else {
			System.out.println("Villain");
		}
		return isLoki;
	}
	
	
	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		Random r = new Random();
		Avengers[] avengers = { //어벤저스 부모클래스에 속한 것들만 가능
				new IronMan(),
				new Thor(),
				new CaptainAmerica(),
				new HawkEye(),
				new Hulk(),
				new BlackWidow(),
				new Loki()
				
		};
		
		for (int i = 0; i < 100; i++) {
			int index = r.nextInt(7);
			if(p.whoAreYou(avengers[index])) break;//로키를 찾으면 boolean이 참이 되어 if문 실행
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}












