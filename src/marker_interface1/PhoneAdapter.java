package marker_interface1;

public abstract class PhoneAdapter implements Phone {

	public void turnOn() {
		System.out.println("���� �ѱ�");
	}

	public void turnOff() {
		System.out.println("���� ����");
	}
	
	@Override
	public void msg(String str, String tel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void call(String tel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void useInternet() {
		// TODO Auto-generated method stub

	}

}
