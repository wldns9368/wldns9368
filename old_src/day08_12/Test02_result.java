package day08_12;

import java.util.Scanner;

import day08_11.Test02;

public class Test02_result {
	/*
	 * °è»ê±â ÇÁ·Î±×·¥ µ¡¼À, °ö¼Á, ³ª´©±â, »¬¼À ÀÔ·Â ¹Ş°í µÎ°¡Áö ¼ö ÀÔ·Â ¹Ş¾Æ¼­ °è»êÀ» ¸Å¼­µå·Î ±¸Çö
	 */
	public static void main(String[] args) {
		Test02_result t = new Test02_result();
		t.re();
	}
	
	
	void re() {
		Scanner s = new Scanner(System.in);
		System.out.println("¿øÇÏ´Â °è»ê½ÄÀ» °ñ¶óÁÖ¼¼¿ä.");
		System.out.println("1.µ¡¼À / 2.»¬¼À / 3.°ö¼À / 4.³ª´°¼À");
		int choice = s.nextInt();
		result(choice);
	}
	
	void result(int a1) {
		Scanner s = new Scanner(System.in);
		System.out.println("µÎ °³ ¼ıÀÚ ÀÔ·ÂÇØÁÖ¼¼¿ä.");
		int number1 = s.nextInt();
		int number2 = s.nextInt();
		if(a1 == 1) {
			System.out.println(number1+"+"+number2+"="+sum(number1, number2));
		}
		else if(a1 == 2) {
			System.out.println(number1+"-"+number2+"="+min(number1, number2));
		}
		else if(a1 == 3) {
			System.out.println(number1+"*"+number2+"="+gob(number1, number2));
		}
		else if(a1 == 4) {
			System.out.println(number1+"/"+number2+"="+nan(number1, number2));
		}
		else {
			System.out.println("¿À·ù");
		}
	}
	
	int sum(int a1, int a2) {
		return a1 + a2;
	}

	int min(int a1, int a2) {
		return a1 - a2;
	}

	int gob(int a1, int a2) {
		return a1 * a2;
	}

	int nan(int a1, int a2) {
		return a1 / a2;
	}
}
