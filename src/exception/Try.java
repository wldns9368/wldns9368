package exception;

public class Try {//����ó��
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e)
	    /*catch (Exception e)*/{
			System.out.println("0���� ���� �� �����ϴ�.");
			System.out.println(e.getMessage());//e��� ����ó���� ���� ��ü�� �̿��� ���ܵ� ������ �̸� ��
			e.printStackTrace();//e��� ����ó���� ���� ��ü�� �̿��� ���ܵ� ������ �� ���� ���
		}
		
		System.out.println("����");
		
	}
}
