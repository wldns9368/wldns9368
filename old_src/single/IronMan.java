package single;

public class IronMan {//�̱��� (��ü�� 1���� �����ؾ� �� �� ���)
	//private IronMan(){}//�̱��� �� �� Ŭ���� �⺻ ������ �����̺���Ʈ ó����Ű��
	                   //�����̺���Ʈ�� ���ϸ� ��ü�� 2�� �̻� ���� ��������
	public static IronMan getInstance /*��ü ���� ���� �� ���*/() {//Ŭ������ �̱���ȭ ��Ŵ 
		                                 //getInstance�� �ܺ� Ŭ�������� IronMan.�޼��� ���ƴ�
		                                 //���� Ŭ���� �� ��� ��ü������ .��� �ϰ� ���� ��
		                                 //IronMan a = IronMan.getInstance�� ����ϴ� ���̴�.
		
									     //IronMan a = new IronMan() < �� IronMan�⺻ �����ڰ�
										 //private �Ǿ� �ܺ� Ŭ�������� �ҷ��� �� ���� ������ 
		                                 //IronMan.getInstance�� new IronMan() ��� ����Ѵ�.
		
		                                 //getInstance�� �ϵ� a�� �ϵ� �������.
		                                 //public static IronMan qwer() << �ص� ��� ��
		                                 //�ܺ� Ŭ�������� IronMan a = IronMan.qwer�ϸ� ��
		
										 //static�� ���ϸ� �ܺ� Ŭ�������� IronMan.�޼��� < �� �� �� ������
										 //IronMan a = IronMan.getInstance�� �� �� ����.
										 //�޸𸮿� IronMan.getInstance�� ���� �������� �ʱ� ����
		
		IronMan a = new IronMan();
		return a;//Ŭ������ return�� �ҷ��� Ŭ������ �̱���ȭ �Ǿ�� �Ѵ�.
		         //IronManŬ���� Ÿ�� ���� (IronMan a = new IronMan)�� �����
	}
	public static void fight() {
		System.out.println("�� �߻�");
	}
	public static void walk() {
		System.out.println("���ư���.");
	}

}
