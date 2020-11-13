package anonymousClass;

public class Consol {//익명클래스 메인 (익명클래스는 인스턴스 옆에 {} 블럭이 있는 클래스이다.
	public static void main(String[] args) {
		Rice r = new Rice() {//일반 클래스를 익명클래스로 사용한 것
			@Override
			public void on() {
				// TODO Auto-generated method stub
				super.on();
			}
			@Override
			public void off() {
				// TODO Auto-generated method stub
				A = 2;
				super.on();
			}
		};
		r.on();
		r.off();
		Machine m = new Machine();
		m.tv.on();
		m.tv.off();
		m.radioWork();
		m.machineWork(new Racome() {
			
			@Override
			public void on() {
				System.out.println("컴퓨터를 켭니다.");
			}
			
			@Override
			public void off() {
				System.out.println("컴퓨터를 끕니다.");
			}
		});
	}
}
