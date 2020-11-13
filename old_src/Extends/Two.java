package Extends;

public class Two implements Interpac{

	@Override
	public void shot() {
		System.out.println("Ï¥? Îπ?");
	}

	@Override
	public void eat() {
		System.out.println("Ï≥êÎ¨¥Í≤®Î¨µ");
	}

	@Override
	public void sleep() {
		System.out.println("Í∑∏ÎÉ• ?û†");
	}

	@Override
	public void hello() {
		System.out.println("Ï∏µÏ∏µÏ∏µÏÑ±?Ñ±?Ñ±!");
	}

	@Override
	public void info() {
		shot();
		eat();
		sleep();
		hello();
		
	}

}
