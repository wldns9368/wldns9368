package Extends;

public class Three implements Interpac{

	@Override
	public void shot() {
		System.out.println("?��?��");
		
	}

	@Override
	public void eat() {
		System.out.println("PX�? ?��?���?");
	}

	@Override
	public void sleep() {
		System.out.println("?���? ?��고있?��.");
		
	}

	@Override
	public void hello() {
		System.out.println("?��?��?�� ^^");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		shot();
		eat();
		sleep();
		hello();
	}

}
