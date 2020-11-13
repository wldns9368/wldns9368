package exception;

public class Try2 {

	public static void main(String[] args) {
		int [] arData = new int[5];
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			try {//Alt + Shift + Z 하면 자동 생성
				arData[i] = i+1;
			} catch (Exception e) {//index가 5가 될 때 catch로 넘어오고 catch로 넘어오면 break를 해서 반복문 탈출;
				System.out.println(e.getMessage());
				e.printStackTrace();
				break;			
			}
		}
		
		System.out.println("정상 종료");
	}
}
