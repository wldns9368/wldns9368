package day08_14;//������ ����

import javax.swing.JOptionPane;

public class Main {
	private static int money1 = 0;// Assignment1_2���� ������ �������� 'My_money' ���� �� ������ �Ű� ����ϱ� ���� ����
	private static int money2 = 0;
	private String name1 = "";
	private static String name2 = "";

	void a(int money1){//���� - ���� X
		System.out.println(Main.money1+money1);
	
	}
	
	public static void main(String[] args) {//�� static�� �޼��忡���� ���������� ���������� ���� �̸��� �� this�� ������ �� ����.
		Main d = new Main();
		//d.a(3)
		Assignment1_2 da = new Assignment1_2(10000, "1p");
	
		JOptionPane.showMessageDialog(null, "������� Ȧ ¦ �������Դϴ�.");
		da.question();// 1p
		Main.money1 = da.My_money;//�� �ű��
		d.name1 = da.Name;// 

		Assignment1_2 da1 = new Assignment1_2(10000, "2p");
		da1.question();//2p
		Main.money2 = da1.My_money;
		Main.name2 = da1.Name;
		System.out.println("�ȳ�");
		
		JOptionPane.showMessageDialog(null, d.name1 + "�ܿ� �ݾ�: " + Main.money1 + "\n" + Main.name2 + "�ܿ� �ݾ�: " + Main.money2);
		//System.out.println(da1);// da1 ��ü���� �ּڰ� ���
	}

}
