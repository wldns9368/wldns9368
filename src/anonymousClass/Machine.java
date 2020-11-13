package anonymousClass;

public class Machine  {//익명 클래스에
	
	Racome tv = new Racome() {
		
		@Override
		public void on() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void off() {
			System.out.println("TV를 끕니다.");
		}
	};
	public void radioWork(){//라디오를 켜는 로직을 포함한 메소드
		Racome radio = new Racome() {
			
			@Override
			public void on() {
				System.out.println("라디오를 켭니다.");
				
			}
			
			@Override
			public void off() {
				System.out.println("라디오를 끕니다.");
			}
		};
		radio.on();
		radio.off();
	}
	public void machineWork(Racome machine) {//넘겨준 쪽에서 직접 로직을 정하는 메소드
		machine.on();
		machine.off();
	}
	
}
		
	
