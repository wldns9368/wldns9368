package Job;

public class Job2 {
	static String Mouse;
	static int Keybord;
	public Job2(){}
	public Job2(String mouse, int keybord) {//생성자 선언 시 객체명 맨 앞은 대문자
		Mouse = mouse;
		Keybord = keybord;
	}
	
	void love() {
		System.out.println(Mouse+Keybord);
	}
	
	int main(int a) {
		return Keybord += a;
	}
	void main2() {
		System.out.println("안녕");
	}
}
