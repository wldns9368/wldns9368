package marker_interface1;

public class Phone2G extends PhoneAdapter{
	@Override
	public void msg(String str, String tel) {
		System.out.println(tel+"���� ������"+"\n���� : "+str);
	}
	
	@Override
	public void call(String tel) {
		System.out.println(tel+"���� ��ȭ�Ŵ� ��");
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		super.turnOn();
	}

}
