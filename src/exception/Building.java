package exception;

import java.util.Random;
import java.util.Scanner;

public class Building {
	public static void main(String[] args) {
		Elevator e = new Elevator();
		Random r = new Random();
		int cnt = 0;
		int floor = 0;
		String check = "";
		int [] arElevator = new int[5];
		
		cnt = r.nextInt(6);
		for (int i = 0; i < cnt; i++) {
			arElevator[i] = 1;
		}
		
		while(true) {
			//�ִ� : 10��
			//�ּ� : -3��
			//0~13 - 3 > -3 ~ 10
			floor = r.nextInt(e.maxFloor+(e.minFloor*-1)+1) + e.minFloor;
			if(floor!=0) break;
		}
		if(cnt == 0) {
			System.out.println("���� ž�� �ο� : ����(�ִ�5��)");
		}else {
			System.out.println("���� ž�� �ο� : "+cnt+"��(�ִ�5��)");
		}
		System.out.println("Y : Ÿ��               N : ������");
		check = new Scanner(System.in).next().toUpperCase();
		if(check.equals("Y")) {
			cnt++;
			try {
				arElevator[cnt-1] = 1;
				Elevator.floor = floor;
				e.go();
			} catch (Exception e1) {
				System.out.println("���� �ʰ�");
			}
		}
	}
}













