package single;

public class IronMan { //�̱��� ���� < �޸� ���� 
	
	private IronMan() {}//�⺻ �����ڸ� private ���ش�
	
	public static IronMan getInstance() {//static
		
		IronMan im = new IronMan();
		return im;		
	}
	
	public static void fight(){
		System.out.println("�� �߻�");
	}
	
	public void walk() {
		System.out.println("���ư���.");
	}
	
}
