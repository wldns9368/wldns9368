package tms;

import java.util.Random;

import javax.swing.JOptionPane;

public class Bus extends Public{
	int fee = 1200;

	@Override
	int pay(int money) {
		money -= fee;
		return money;
	}

	@Override
	String go(int btnIndex, int money) {
		//������� �������� ������ Ȯ�����ְ�
		//���������� ������������ �����ؼ� for���� ���ƾ� �Ѵ�.
		//btnIndex : ������
		//index : �����
		int cnt = 0;
		int index = 0;
		String result = "";
		Random r = new Random();
		while(true) {
			index = r.nextInt(arStation.length);
			if (btnIndex > index) break;
		}
		cnt = btnIndex - index;
		
		if(money - fee < 0) {
			result = "�ܾ׺���,";
		}else {
			result = ""+pay(money)+",";
			result += arStation[index] + ">";
			
			for (int i = 0; i < cnt ; i++) {
				result += i == cnt-1 ? arStation[index+i+1] : arStation[index+i+1] + ">";
			}
			showDestMsg(arStation[btnIndex]);
		}
		return result;
	}
	
	@Override
	void showDestMsg(String destination) {
		JOptionPane.showMessageDialog(null, destination + "�� �����߽��ϴ�.");
	}

}








