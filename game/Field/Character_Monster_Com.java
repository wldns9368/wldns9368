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

	public int Cnt = 0; // 장비 획득 카운트
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
		if (hp < 0) {// 들어온 값이 음수일 때 // 몬스터에게 공격받아서 체력이 깎일 때 사용
			if(((hp*-1)/*적 공격력값이 들어올 때 음수로 들어오므로 -1을 곱해서 양수로 바꿔줌*/ 
					- Dfe /*내 방어력*/) <= 0) {//적 공격력 값을 내 방어력 값으로 뺏을 때 0이하면 실행 
				JOptionPane.showMessageDialog(null, "데미지를 입지 않았습니다.");
			}
			if(((hp*-1) - Dfe ) > 0) {//적 공격력 값을 내 방어력 값으로 뺏을 때 0보다 크면 실행
				Hp -= (hp*-1) - Dfe;//적 공격력에서 내 방어력 만큼 뺀 뒤 남은 값으로 현재 체력에 빼준다.
				if(Hp < 0) {
					Hp = 0;
				}
			}
		}
		if (hp >= 0) {// 들어온 값이 양수일 때 //체력회복이나 장비 획득시 체력이 늘어날 때 사용
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
