package day08_16;

public class Overloading {
	 String name = "정지운";
     int number = 5;

     public Overloading(){

     }

     public Overloading(String name){
         this.name = name;
     }

     public Overloading(String name, int number){
         this.name = name;
         this.number = number;
     }// 같은 이름의 메서드라도 매개변수의 갯수 혹은 타입이 다르면 선언 가능

	void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	void add(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
	
	void add(double num1, double num2) {
		System.out.println(num1 + num2);
	}

	public static void main(String[] args) {
		 Overloading c1 = new Overloading();
		 Overloading c3 = new Overloading("구급차", 1234);
		 System.out.println(c3.name+c3.number);
		 Overloading c2 = new Overloading("소방차");
		 System.out.println(c2.name);
		Overloading o = new Overloading();
		o.add(10.4, 20.5);//두 실수의 합
		o.add(10, 20);//두 정수의 합
		o.add(10, 20, 30);//세 정수의 합
	}
}

