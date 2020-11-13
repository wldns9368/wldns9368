package single;

public class IronMan { //싱글톤 패턴 < 메모리 절약 
	
	private IronMan() {}//기본 생성자를 private 해준다
	
	public static IronMan getInstance() {//static
		
		IronMan im = new IronMan();
		return im;		
	}
	
	public static void fight(){
		System.out.println("빔 발사");
	}
	
	public void walk() {
		System.out.println("날아간다.");
	}
	
}
