package day08_20;

public class Encapsulation1 {//캡슐화
	//클래스 한 곳에서만 쓸 변수는 private로 하는게 좋다 
		//왜냐하면 나중에 코드를 고칠 때 변수가 private면 이 변수는 이 클래스 안에서만
		//사용하고 있는 것을 바로 알 수 있기 때문에 다른 클래스를 확인하며 찾아 다닐 필요가
		//없어진다.
		int Atk1;
		int Spd1;
		private int Atk;
		private int Spd;
		public int getAtk() {
			return Atk;
		}
		public void setAtk(int atk) {
			if(atk < 0 || atk > 120) return;//조건이 맞다면 메서드 빠져나오기
			Atk = atk;
		}
		public int getSpd() {
			return Spd;
		}
		public void setSpd(int spd) {
			Spd = spd;
		}
		
		
}
