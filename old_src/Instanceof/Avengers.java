package Instanceof;
//instanceof : ��ü Ÿ���� Ȯ���ϴµ� ����Ѵ�.
//             �Ӽ��� ���׿������̰� '> ����ȯ ���ɿ��� <'��
//             �����ϸ� true, �Ұ����ϸ� false�� ����
// > �ַ� ��� ���迡�� �θ� ��ü���� �ڽ� ��ü���� Ȯ���ϴµ� ��� <

//instanceof ��� ��� : ��ü instanceof Ŭ����

//a�� �θ� b�� �ڽ��� ��
//A a = new A();
//B b = new B();

//��ü a�� �ڱ� �ڽ��� ��ü�̱� ������ ����ȯ ����.
//System.out.println(a instanceof A);  //true ���

//��ü b�� A�� �ڽİ�ü�̱� ������ A�� ����ȯ ����.
//System.out.println(b instanceof A);  //true ���

//��ü a�� B�� �θ�ü�̱⶧���� ����ȯ �Ұ���.
//System.out.println(a instanceof B);  //false ���

//��ü b�� �ڱ� �ڽ��� ��ü�̱⶧���� ����ȯ ����.
//System.out.println(b instanceof B);  //true ���

//��, �ڽ��� �θ�� ����ȯ ����������    �ڽ�  > �θ�  O 
//  �θ�� �ڽ����� ����ȯ �Ұ����ϴ�. �θ�  > �ڽ�  X

// ��ü(�ڽ�) instanceof Ŭ����(�θ�) 
// or
// ��ü(�ڽ�) instanceof Ŭ����(�ڽ�) �� ���� true
public class Avengers {
	public static void main(String[] args) {
		Hurk h = new Hurk();
		Ironman i = new Ironman();
		Loki l = new Loki();
		A a = new A();
		
		if(a instanceof KindTeam) {
			System.out.println("����� ���Դϴ�.");
		}
		else if(a instanceof KindTeam){
			System.out.println("dd");
		}
		else {
			System.out.println("�Ǵ��Դϴ�.");
		}
	}
}
