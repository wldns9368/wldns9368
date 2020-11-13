package day08_26_1;

import java.util.Random;

/*
 * ������ Ÿ���� Ȯ���� �� ����ϴ� ����
 * 
 * �� instanceof Ŭ����Ÿ�� : ���� Ŭ���� Ÿ���̴�?(���� �Ϳ��� ū ��)
 * 
 * �ڳఴü instanceof �θ�Ÿ�� = true
 * �θ�ü instanceof �ڽ�Ÿ�� = false// �ڽ��� �θ��� ������ �� �� �־
 *                                // �θ� �ڽ��� ������ �� �� ���� �����̴�.
 *   ��ü   instanceof ��üŸ�� = true
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
	//Ÿ�Ը� ��ü�� = new Ŭ������  
	//Avengers a = new Avengers <<< ����� Ÿ�Կ� ���� ����� ���� ���
	//Avengers a = new IronMan  <<< ����� Ÿ�Կ� ���� ���̾�� ���� ���
	
	//Avengers a <<< ����� Ÿ�� ��, ����� Ÿ���� Ŭ������ ��� ��������� ������ ���� �Ҵ�� ���� �����Ƿ�,
	//               new�� ���� ���� ��� ����� Ÿ���� �ϳ��� Ŭ���� ��ü�� �� �� �ִ�.
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
		Avengers[] avengers = { //����� �θ�Ŭ������ ���� �͵鸸 ����
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
			if(p.whoAreYou(avengers[index])) break;//��Ű�� ã���� boolean�� ���� �Ǿ� if�� ����
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}












