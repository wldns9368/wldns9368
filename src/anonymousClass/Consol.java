package anonymousClass;

public class Consol {//�͸�Ŭ���� ���� (�͸�Ŭ������ �ν��Ͻ� ���� {} ���� �ִ� Ŭ�����̴�.
	public static void main(String[] args) {
		Rice r = new Rice() {//�Ϲ� Ŭ������ �͸�Ŭ������ ����� ��
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
				System.out.println("��ǻ�͸� �մϴ�.");
			}
			
			@Override
			public void off() {
				System.out.println("��ǻ�͸� ���ϴ�.");
			}
		});
	}
}
