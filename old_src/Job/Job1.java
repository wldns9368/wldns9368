package Job;

public class Job1 {
	public static void main(String[] args) {
		
		Job2 test1 = new Job2("���н�", 10);//������ Ŭ���� �ȿ� �����ڰ� �����ϸ� ()�ȿ� ������ �ʱ�ȭ ���� �־�� �Ѵ�.
		
		test1.love();
		test1.main2();
		Job2 test2 = new Job2();//������ �����ε�
		System.out.println(Job2.Keybord);//Keybord ������ static�̸� �Ű������� ����ִ� �����ڸ� �ᵵ �� �����ڿ��� �ʱ�ȭ ��Ų ������ ��������
		
	}


}
