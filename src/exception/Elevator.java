package exception;

import java.util.Scanner;

public class Elevator extends Lift{
	
	final int maxFloor = 10;
	final int minFloor = -3;
	
	@Override
	void up() {
		floor++;
	}

	@Override
	void down() {
		floor--;
	}

	@Override
	void start(int choice) {
		if(choice < floor) {
			for (int i = 0; i <= floor-choice+i; i++) {
				if(floor!=0) {
					System.out.println(floor+"Ãþ");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
				down();
			}
			stop();
		}else if(choice != floor) {
			for (int i = 0; i <= choice-floor+i ; i++) {
				if(floor!=0) {
					System.out.println(floor+"Ãþ");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
				up();
			}
			stop();
		}else {
			System.out.println("°°Àº Ãþ ¼±ÅÃ ºÒ°¡");
		}
	}

	@Override
	void stop() {
		System.out.println("¡ÜµµÂø¡Ü");
	}

	@Override
	void go() {
		int choice = 0;
		String msg = "";
		while(true) {
			msg = "Ãþ¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä(ÇöÀçÃþ : "+floor+"Ãþ)";
			System.out.println(msg);
			choice = new Scanner(System.in).nextInt();
			if(choice > maxFloor || choice < minFloor) {
				System.out.println("B3Ãþ ºÎÅÍ 10Ãþ±îÁö¸¸ °¡´ÉÇÕ´Ï´Ù.");
			}else {
				break;
			}
		}
		start(choice);
	}
	
}











