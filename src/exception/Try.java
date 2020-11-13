package exception;

public class Try {//예외처리
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e)
	    /*catch (Exception e)*/{
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());//e라는 예외처리를 잡은 객체를 이용해 예외된 오류의 이름 출
			e.printStackTrace();//e라는 예외처리를 잡은 객체를 이용해 예외된 오류의 상세 내용 출력
		}
		
		System.out.println("종료");
		
	}
}
