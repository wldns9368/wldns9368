package Extends;

public class One implements Interpac{

	@Override
	public void shot() {
		System.out.println("?��?��?��?�� �? �?~");
	}

	@Override
	public void eat() {
		System.out.println("90?���? ?��?�� 꺾으면서 먹기");
	}

	@Override
	public void sleep() {
		System.out.println("?��?��?��겠습?��?��! ?���? ?���?");
	}

	@Override
	public void hello() {
		System.out.println("충우?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��");
	}

	@Override
	public void info() {
		shot();
		eat();
		sleep();
		hello();
	}
	
}
