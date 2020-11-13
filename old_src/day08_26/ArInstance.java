package day08_26;

import java.util.Scanner;


public class ArInstance { //클래스 배열 > 객체를 여러개 선언해야 하는 경우
	                      //배열 타입으로 한 번에 선언 후 사용한다.
	
	                      //상속을 해도 생성자는 상속되지 않는다.(반드시 따로 선언해야 된다는 뜻)
	                      //대신 자식 클래스로 인스턴스를 생성할 때 부모 클래스의 기본 생성자를 자동 호출하게 된다.
	                       
	                      //그냥 부모 클래스에 생성자만큼 자식 클래스에도 그 만큼 똑같이 만들어라.
	             
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Animal[] arAni = new Animal[3];//클래스 배열 선언
		for (int i = 0; i < arAni.length; i++) {
			String name;
			int age;
			String feed;
			//arAni[i] = new Animal();//클래스 i번 째 생성자 객체화
			
			System.out.println(i+1 + "번 동물 이름 : ");
			//arAni[i].name = sc.next();
			name = sc.next();
			//System.out.println(arAni.name + "의 나이 : ");
			//arAni[i].age = sc.nextInt();
			System.out.println("나이 : ");
			age = sc.nextInt();
			//System.out.println(arAni.name + "의 먹이 : ");
			//arAni[i].feed = sc.next();
			System.out.println("먹이 : ");
			feed = sc.next();
			//System.out.println(a instanceof Life);
			
			Animal a = new Life(name, age, feed);
			System.out.println(arAni[0]);
		
			//arAni[i] = new Life(name, age, feed);//객체화 
			System.out.println(arAni[0]);
			System.out.println(arAni[0] instanceof Life);
			
		}
	
		for (int i = 0; i < arAni.length; i++) {
			System.out.println(arAni[i]);
		}
	}

}
class Life extends Animal{
	
	public Life(String name, int age, String feed) {
		// TODO Auto-generated constructor stub
		System.out.println("에우에웅");
	}
	void a2() {
		
	}
	@Override
	public void a1() {
		System.out.println("옹");
	}
	
	public Life() {
		System.out.println("에[옹");
		// TODO Auto-generated constructor stub
	}

	
	
	
}
class Dd{
	
}
class Animal {
	public void a1() {
		System.out.println("앙");
	}
	public Animal() {
		System.out.println("에오에오에옹ㅇ");
	}
	
	/*public Animal(String name, int age, String feed) {
		
		this.name = name;
		this.age = age;
		this.feed = feed;
	}*/

	String name;
	int age;
	String feed;
	
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", feed=" + feed + "]";
	}
	
}