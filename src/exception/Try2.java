package exception;

public class Try2 {

	public static void main(String[] args) {
		int [] arData = new int[5];
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			try {//Alt + Shift + Z �ϸ� �ڵ� ����
				arData[i] = i+1;
			} catch (Exception e) {//index�� 5�� �� �� catch�� �Ѿ���� catch�� �Ѿ���� break�� �ؼ� �ݺ��� Ż��;
				System.out.println(e.getMessage());
				e.printStackTrace();
				break;			
			}
		}
		
		System.out.println("���� ����");
	}
}
