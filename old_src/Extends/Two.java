package Extends;

public class Two implements Interpac{

	@Override
	public void shot() {
		System.out.println("�? �?");
	}

	@Override
	public void eat() {
		System.out.println("쳐무겨묵");
	}

	@Override
	public void sleep() {
		System.out.println("그냥 ?��");
	}

	@Override
	public void hello() {
		System.out.println("층층층성?��?��!");
	}

	@Override
	public void info() {
		shot();
		eat();
		sleep();
		hello();
		
	}

}
