 package Field;

public class EasyMonster1 extends Character_Monster_Com {
	
	//30, 30, 20, 0, "���ݸ� �糪�� �Ʊ� ������[��]", 500
	public EasyMonster1() {
		setAtk(20);
		setMaxHp(30);
		setHp(30);
		setDfe(0);
		setName("���ݸ� �糪�� �Ʊ� ������[��]");
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
