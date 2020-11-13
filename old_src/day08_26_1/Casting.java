package day08_26_1;



public class Casting {//부모
	/*
	 * - 클래스 배열 캐스팅과 instanceof -
	 * 클래스 배열도 업캐스팅이 가능하다 
	 * 하지만 클래스 배열만 선언하고 
	 * (클래스 배열 객체) instanceof (클래스) = 무조건 false이다
	 * 클래스 배열 선언만하면 배열 선언 했을 때의 클래스 타입 값이 들어가는 것이 아니다.
	 * 그 클래스 타입과 관계된 클래스만 들어갈 수 있는 할당 공간을 
	 * 아파트처럼 1번방, 2번방 ... 저장 공간을 만들어주는 것 뿐이다 
	 */

	/*
	 * up casting : 부모 클래스 타입으로 자식 생성자를 호출하는 것
	 * 
	 * 부모와 자식간의 공통 요소(재정의 메서드)만 사용 가능하고,
	 * 자식클래스에서 추가된 것들은 사용할수 없다.
	 * 부모 타입으로 선언 되었기 때문에 부모의 필드만 사용가능 하고 
	 * 자식클래스에서 재정의 했다면 그 재정의 된 메서드로 사용된다.+
	 * 
	 * - java 규칙 중 상위클래스에 기본 생성자가 없는 클래스를 상속받는 경우
	 * 하위 클래스에 기본 생성자를 생성 할 때나 사용 할 때컴파일 오류가 나기 때문에
     * 슈퍼클래스에 있는 생성자만을 호출해야 된다는 규칙이 있다.
     * 또는 슈퍼클래스에 기본생성자를 만들어준다. 
     * 상위 클래스에 기본 생성자가 있으면 업캐스팅이 된거거나 안된거거나
     * 상관없이 상위 클래스에 없는 생성자를 선언할 수 있다.
     */
	public static void main(String[] args) {
		Casting a = new A();
		a.a1();
		a.a1();
	}
	
	public void a1() {
		System.out.println("난 지운이야~");
	}
}

class A extends Casting{
	
	public void a1(int a) {
		System.out.println("응 아니야");
	}
	
	@Override
	public void a1() {
		
	}
	public void a2() {
		System.out.println("앙");
	}
	
}