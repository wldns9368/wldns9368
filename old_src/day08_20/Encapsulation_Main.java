package day08_20;

import java.util.Scanner;

public class Encapsulation_Main {//ĸ��ȭ
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Encapsulation1 c = new Encapsulation1();
		System.out.println("���� �Է��غ�����");
		c.setAtk(s.nextInt());
		System.out.println(c.getAtk());
	}

}
