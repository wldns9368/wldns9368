package day08_26_1;



public class Casting {//�θ�
	/*
	 * - Ŭ���� �迭 ĳ���ð� instanceof -
	 * Ŭ���� �迭�� ��ĳ������ �����ϴ� 
	 * ������ Ŭ���� �迭�� �����ϰ� 
	 * (Ŭ���� �迭 ��ü) instanceof (Ŭ����) = ������ false�̴�
	 * Ŭ���� �迭 �����ϸ� �迭 ���� ���� ���� Ŭ���� Ÿ�� ���� ���� ���� �ƴϴ�.
	 * �� Ŭ���� Ÿ�԰� ����� Ŭ������ �� �� �ִ� �Ҵ� ������ 
	 * ����Ʈó�� 1����, 2���� ... ���� ������ ������ִ� �� ���̴� 
	 */

	/*
	 * up casting : �θ� Ŭ���� Ÿ������ �ڽ� �����ڸ� ȣ���ϴ� ��
	 * 
	 * �θ�� �ڽİ��� ���� ���(������ �޼���)�� ��� �����ϰ�,
	 * �ڽ�Ŭ�������� �߰��� �͵��� ����Ҽ� ����.
	 * �θ� Ÿ������ ���� �Ǿ��� ������ �θ��� �ʵ常 ��밡�� �ϰ� 
	 * �ڽ�Ŭ�������� ������ �ߴٸ� �� ������ �� �޼���� ���ȴ�.+
	 * 
	 * - java ��Ģ �� ����Ŭ������ �⺻ �����ڰ� ���� Ŭ������ ��ӹ޴� ���
	 * ���� Ŭ������ �⺻ �����ڸ� ���� �� ���� ��� �� �������� ������ ���� ������
     * ����Ŭ������ �ִ� �����ڸ��� ȣ���ؾ� �ȴٴ� ��Ģ�� �ִ�.
     * �Ǵ� ����Ŭ������ �⺻�����ڸ� ������ش�. 
     * ���� Ŭ������ �⺻ �����ڰ� ������ ��ĳ������ �ȰŰų� �ȵȰŰų�
     * ������� ���� Ŭ������ ���� �����ڸ� ������ �� �ִ�.
     */
	public static void main(String[] args) {
		Casting a = new A();
		a.a1();
		a.a1();
	}
	
	public void a1() {
		System.out.println("�� �����̾�~");
	}
}

class A extends Casting{
	
	public void a1(int a) {
		System.out.println("�� �ƴϾ�");
	}
	
	@Override
	public void a1() {
		
	}
	public void a2() {
		System.out.println("��");
	}
	
}