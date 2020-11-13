package Field_main;

public class Aaaa extends Ssss{//생성자 상속에 대한 궁금증 실험
	public Aaaa() {
		super("Aaaa");
		System.out.println("자식");
	}
	public void a() {
		System.out.println("성공");
	}
	public static void main(String[] args) {
		Aaaa a = new Aaaa();
	}
}
