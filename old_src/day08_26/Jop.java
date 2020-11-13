package day08_26;

import java.util.Random;

class Person {//다형성
	String name;
	int age;
	String gender;
	int money;

	public Person() {
	}

	public Person(String name, int age, String gender, int money) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.money = money;
	}
}

class Teacher extends Person {
	String subject; // 과목
	String position; // 직책(직급)
	private int income = 10_000_000;
	int cnt = 0;

	public Teacher(String name, int age, String gender, int money, String position) { // alt + shift + s + c 슈퍼 생성자 단축키
		super(name, age, gender, money);// 부모 생성자에서 이 매개 변수를 받는 것처럼 설정
		this.position = position;
		// TODO Auto-generated constructor stub
	}

	void teach(String subject) {

		cnt++;
		// if(cnt % 10 == 0) income = (income + 1.1); << 컴파일 오류가 난다.
		if (cnt % 10 == 0)
			income += 1.1; // << 위 코드와 같은 의미지만 오류가 나지 않는다.
		// 그 이유는 +=같은 대입 연산자는 암묵적으로 오른쪽 형식을 왼쪽 형식으로 자동 형변환 시켜주기 때문이다.
		// 그래서 income += 1.1은 결국 >> //if(cnt % 10 == 0) income = (int) (income + 1.1) 와
		// 같다.
		money += income; // 한 번 실행될 때마다 money변수 값에 income값 만큼 추가
		System.out.println(name + " " + position + "(이)가 " + subject + " 과목을" + " 강의 중");
		System.out.println("통장잔고 : " + money + "원");
	}

}

public class Jop { // 출력
	public static void main(String[] args) {
		Teacher a = new Teacher("정지운", 18, "남", 100000, "강사");
		String []arSub = {"C언어", "파이썬", "JAVA"};
		Random r = new Random();
		int index;
		index = r.nextInt(3);
		
		a.teach(arSub[index]);

		
		
		
	}
}
