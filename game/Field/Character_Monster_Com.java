package Field;

import javax.swing.JOptionPane;
import javax.xml.crypto.Data;





public class Character_Monster_Com extends Parts {
	
	private int money = 0;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money += money;
	}

	private int MaxHp;
	private int Hp;

	public int Cnt = 0; // ��� ȹ�� ī��Ʈ
	public String[][] Parts = new String[8][4];

	/**
	 * @return the hp
	 */
	public int getHp() {
		return Hp;
	}

	/**
	 * @param hp the hp to set
	 */

	public void setHp(int hp) {
		if (hp < 0) {// ���� ���� ������ �� // ���Ϳ��� ���ݹ޾Ƽ� ü���� ���� �� ���
			if(((hp*-1)/*�� ���ݷ°��� ���� �� ������ �����Ƿ� -1�� ���ؼ� ����� �ٲ���*/ 
					- Dfe /*�� ����*/) <= 0) {//�� ���ݷ� ���� �� ���� ������ ���� �� 0���ϸ� ���� 
				JOptionPane.showMessageDialog(null, "�������� ���� �ʾҽ��ϴ�.");
			}
			if(((hp*-1) - Dfe ) > 0) {//�� ���ݷ� ���� �� ���� ������ ���� �� 0���� ũ�� ����
				Hp -= (hp*-1) - Dfe;//�� ���ݷ¿��� �� ���� ��ŭ �� �� ���� ������ ���� ü�¿� ���ش�.
				if(Hp < 0) {
					Hp = 0;
				}
			}
		}
		if (hp >= 0) {// ���� ���� ����� �� //ü��ȸ���̳� ��� ȹ��� ü���� �þ �� ���
			if ((Hp + hp) == MaxHp || (Hp + hp) < MaxHp) {
				Hp += hp;
			} 
			else if ((Hp + hp) > MaxHp) {
				Hp = MaxHp;
			}
		}
	}

	private int Atk;

	/**
	 * @return the maxHp
	 */
	public int getMaxHp() {
		return MaxHp;
	}

	/**
	 * @param maxHp the maxHp to set
	 */
	public void setMaxHp(int maxHp) {
		MaxHp += maxHp;
	}

	private String Name;
	private int Dfe;

	public int getAtk() {
		return Atk;
	}

	public void setAtk(int atk) {
		Atk += atk;
	}

	public int getDfe() {
		return Dfe;
	}

	public void setDfe(int dfe) {
		Dfe += dfe;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Character_Monster_Com() {
	}

	public Character_Monster_Com(String name) {
		Name = name;
	}

	public Character_Monster_Com(int maxhp, int hp, int atk, int dfe) {
		super();
		Atk = atk;
		Dfe = dfe;
		Hp = hp;
		MaxHp = maxhp;
	}

	

}
