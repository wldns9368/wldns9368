package marker_interface;

public class Check {//marker interface
	public static void main(String[] args) {
		Digimon d = new Digimon();
		PokeMon p = new PokeMon();
		ZzangGu z = new ZzangGu();
		HarryPotter h = new HarryPotter();
		
		if(d instanceof Animation) {
			System.out.println("�������� �ִϸ��̼� �Դϴ�.");
		}
		if(p instanceof Animation) {
			System.out.println("���ϸ��� �ִϸ��̼� �Դϴ�.");
		}
		if(z instanceof Animation) {
			System.out.println("¯���� �ִϸ��̼� �Դϴ�.");
		}
		if(!(h instanceof Animation)) {
			System.out.println("�ظ� ���ʹ� �ִϸ��̼��� �ƴմϴ�.");
		}
		
	}
}













