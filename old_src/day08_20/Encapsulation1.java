package day08_20;

public class Encapsulation1 {//ĸ��ȭ
	//Ŭ���� �� �������� �� ������ private�� �ϴ°� ���� 
		//�ֳ��ϸ� ���߿� �ڵ带 ��ĥ �� ������ private�� �� ������ �� Ŭ���� �ȿ�����
		//����ϰ� �ִ� ���� �ٷ� �� �� �ֱ� ������ �ٸ� Ŭ������ Ȯ���ϸ� ã�� �ٴ� �ʿ䰡
		//��������.
		int Atk1;
		int Spd1;
		private int Atk;
		private int Spd;
		public int getAtk() {
			return Atk;
		}
		public void setAtk(int atk) {
			if(atk < 0 || atk > 120) return;//������ �´ٸ� �޼��� ����������
			Atk = atk;
		}
		public int getSpd() {
			return Spd;
		}
		public void setSpd(int spd) {
			Spd = spd;
		}
		
		
}
