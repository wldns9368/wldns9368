package day08_14;//생성자 연습

import javax.swing.JOptionPane;

public class Main {
	private static int money1 = 0;// Assignment1_2에서 가져온 전역변수 'My_money' 값을 이 변수로 옮겨 출력하기 위한 변수
	private static int money2 = 0;
	private String name1 = "";
	private static String name2 = "";

	void a(int money1){//연습 - 과제 X
		System.out.println(Main.money1+money1);
	
	}
	
	public static void main(String[] args) {//★ static★ 메서드에서는 전역변수와 지역변수가 같은 이름일 시 this로 구별할 수 없다.
		Main d = new Main();
		//d.a(3)
		Assignment1_2 da = new Assignment1_2(10000, "1p");
	
		JOptionPane.showMessageDialog(null, "어서오세요 홀 짝 도박장입니다.");
		da.question();// 1p
		Main.money1 = da.My_money;//돈 옮기기
		d.name1 = da.Name;// 

		Assignment1_2 da1 = new Assignment1_2(10000, "2p");
		da1.question();//2p
		Main.money2 = da1.My_money;
		Main.name2 = da1.Name;
		System.out.println("안녕");
		
		JOptionPane.showMessageDialog(null, d.name1 + "잔여 금액: " + Main.money1 + "\n" + Main.name2 + "잔여 금액: " + Main.money2);
		//System.out.println(da1);// da1 객체명의 주솟값 출력
	}

}
