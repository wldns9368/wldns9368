package Job;

public class Job1 {
	public static void main(String[] args) {
		
		Job2 test1 = new Job2("제닉스", 10);//가져올 클래스 안에 생성자가 존재하면 ()안에 생성자 초기화 값을 넣어야 한다.
		
		test1.love();
		test1.main2();
		Job2 test2 = new Job2();//생성자 오버로딩
		System.out.println(Job2.Keybord);//Keybord 변수가 static이면 매개변수가 비어있는 생성자를 써도 전 생성자에서 초기화 시킨 값으로 남아있음
		
	}


}
