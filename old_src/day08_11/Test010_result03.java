package day08_11;

import java.util.Random;
import java.util.Scanner;

public class Test010_result03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		while (true) {
			int try1 = 0;
			int randomnumber = r.nextInt(20);
			randomnumber = randomnumber + 1;
			while (true) {
				System.out.println("1부터 20까지 숫자를 입력해주세요.");
				int numberchoice = s.nextInt();
				if (numberchoice > 20 || numberchoice < 0) {
					System.out.println("오류발생");
					break;
				} else {
					if (randomnumber > numberchoice) {
						try1 = try1 + 1;
						System.out.println("더 큽니다."+" 시도 횟수: "+try1);
					} else if (randomnumber < numberchoice) {
						try1 = try1 + 1;
						System.out.println("더 작습니다."+" 시도 횟수: "+try1);
					} else if (randomnumber == numberchoice) {
						try1 = try1 + 1;
						System.out.println("총 "+try1+"번 시도하여 정답을 맞추셨습니다.");
						break;
					}
				}
			}
		}
	}
}
