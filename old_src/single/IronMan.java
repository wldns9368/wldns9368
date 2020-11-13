package single;

public class IronMan {//싱글톤 (객체가 1개만 존재해야 할 때 사용)
	//private IronMan(){}//싱글톤 할 땐 클래스 기본 생성자 프라이베이트 처리시키기
	                   //프라이베이트를 안하면 객체를 2개 이상 생성 가능해짐
	public static IronMan getInstance /*객체 값을 얻어올 때 사용*/() {//클래스를 싱글톤화 시킴 
		                                 //getInstance는 외부 클래스에서 IronMan.메서드 가아닌
		                                 //따로 클래스 명 대신 객체명으로 .찍고 하고 싶을 때
		                                 //IronMan a = IronMan.getInstance에 사용하는 것이다.
		
									     //IronMan a = new IronMan() < 는 IronMan기본 생성자가
										 //private 되어 외부 클래스에서 불러올 수 없기 때문에 
		                                 //IronMan.getInstance를 new IronMan() 대신 사용한다.
		
		                                 //getInstance로 하든 a로 하든 상관없다.
		                                 //public static IronMan qwer() << 해도 상관 ㄴ
		                                 //외부 클래스에서 IronMan a = IronMan.qwer하면 됨
		
										 //static을 안하면 외부 클래스에서 IronMan.메서드 < 는 할 수 있지만
										 //IronMan a = IronMan.getInstance는 할 수 없다.
										 //메모리에 IronMan.getInstance할 값이 존재하지 않기 때문
		
		IronMan a = new IronMan();
		return a;//클래스에 return을 할려면 클래스가 싱글톤화 되어야 한다.
		         //IronMan클래스 타입 값에 (IronMan a = new IronMan)가 담아짐
	}
	public static void fight() {
		System.out.println("빔 발사");
	}
	public static void walk() {
		System.out.println("날아간다.");
	}

}
