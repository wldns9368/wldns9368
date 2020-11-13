package Instanceof;
//instanceof : 객체 타입을 확인하는데 사용한다.
//             속성은 이항연산자이고 '> 형변환 가능여부 <'를
//             가능하면 true, 불가능하면 false로 리턴
// > 주로 상속 관계에서 부모 객체인지 자식 객체인지 확인하는데 사용 <

//instanceof 사용 방법 : 객체 instanceof 클래스

//a가 부모 b가 자식일 때
//A a = new A();
//B b = new B();

//객체 a는 자기 자신의 객체이기 때문에 형변환 가능.
//System.out.println(a instanceof A);  //true 출력

//객체 b는 A의 자식객체이기 때문에 A로 형변환 가능.
//System.out.println(b instanceof A);  //true 출력

//객체 a는 B의 부모객체이기때문에 형변환 불가능.
//System.out.println(a instanceof B);  //false 출력

//객체 b는 자기 자신의 객체이기때문에 형변환 가능.
//System.out.println(b instanceof B);  //true 출력

//즉, 자식은 부모로 형변환 가능하지만    자식  > 부모  O 
//  부모는 자식으로 형변환 불가능하다. 부모  > 자식  X

// 객체(자식) instanceof 클래스(부모) 
// or
// 객체(자신) instanceof 클래스(자신) 일 때만 true
public class Avengers {
	public static void main(String[] args) {
		Hurk h = new Hurk();
		Ironman i = new Ironman();
		Loki l = new Loki();
		A a = new A();
		
		if(a instanceof KindTeam) {
			System.out.println("어벤져스 팀입니다.");
		}
		else if(a instanceof KindTeam){
			System.out.println("dd");
		}
		else {
			System.out.println("악당입니다.");
		}
	}
}
