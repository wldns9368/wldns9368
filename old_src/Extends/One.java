package Extends;

public class One implements Interpac{

	@Override
	public void shot() {
		System.out.println("??·??· μ΄? λΉ?~");
	}

	@Override
	public void eat() {
		System.out.println("90?λ‘? ?? κΊΎμΌλ©΄μ λ¨ΉκΈ°");
	}

	@Override
	public void sleep() {
		System.out.println("??±?κ² μ΅??€! ?κ³? ?κΈ?");
	}

	@Override
	public void hello() {
		System.out.println("μΆ©μ°?°?°?°?°?°??°?°?°????????????΄?΄?΄");
	}

	@Override
	public void info() {
		shot();
		eat();
		sleep();
		hello();
	}
	
}
