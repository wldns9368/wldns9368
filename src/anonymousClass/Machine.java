package anonymousClass;

public class Machine  {//�͸� Ŭ������
	
	Racome tv = new Racome() {
		
		@Override
		public void on() {
			System.out.println("TV�� �մϴ�.");
		}
		
		@Override
		public void off() {
			System.out.println("TV�� ���ϴ�.");
		}
	};
	public void radioWork(){//������ �Ѵ� ������ ������ �޼ҵ�
		Racome radio = new Racome() {
			
			@Override
			public void on() {
				System.out.println("������ �մϴ�.");
				
			}
			
			@Override
			public void off() {
				System.out.println("������ ���ϴ�.");
			}
		};
		radio.on();
		radio.off();
	}
	public void machineWork(Racome machine) {//�Ѱ��� �ʿ��� ���� ������ ���ϴ� �޼ҵ�
		machine.on();
		machine.off();
	}
	
}
		
	
