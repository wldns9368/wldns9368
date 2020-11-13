package Extends;

public class One implements Interpac{

	@Override
	public void shot() {
		System.out.println("?…‚?„·?…‚?„· ì´? ë¹?~");
	}

	@Override
	public void eat() {
		System.out.println("90?„ë¡? ?†?„ êº¾ìœ¼ë©´ì„œ ë¨¹ê¸°");
	}

	@Override
	public void sleep() {
		System.out.println("?†Œ?“±?•˜ê² ìŠµ?‹ˆ?‹¤! ?•˜ê³? ?ê¸?");
	}

	@Override
	public void hello() {
		System.out.println("ì¶©ìš°?š°?š°?š°?š°?š°?…œ?š°?š°?š°?›…?…‡?„œ?„œ?„œ?„œ?„œ?…“?„œ?„œ?„œ?–´?–´?–´");
	}

	@Override
	public void info() {
		shot();
		eat();
		sleep();
		hello();
	}
	
}
