 package Field;

public class EasyMonster1 extends Character_Monster_Com {
	
	//30, 30, 20, 0, "성격만 사나운 아기 슬라임[★]", 500
	public EasyMonster1() {
		setAtk(20);
		setMaxHp(30);
		setHp(30);
		setDfe(0);
		setName("성격만 사나운 아기 슬라임[★]");
		setMoney(500);
		// TODO Auto-generated constructor stub
	}

	public EasyMonster1(int maxhp, int hp, int atk, int dfe, String name, int money) {
		super(maxhp, hp, atk, dfe);
		setName(name);
		setMoney(money);
		// TODO Auto-generated constructor stub
	}

	public EasyMonster1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	

}
