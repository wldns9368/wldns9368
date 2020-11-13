package day08_20;

import java.util.Scanner;

public class Encapsulation_Main {//캡슐화
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Encapsulation1 c = new Encapsulation1();
		System.out.println("값을 입력해보세요");
		c.setAtk(s.nextInt());
		System.out.println(c.getAtk());
	}

}
