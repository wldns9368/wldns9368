package Field_main;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.ChangedCharSetException;

import Field.Character_Monster_Com;
import Field.EasyMonster1;
import Field.EasyMonster2;
import Field.MonsterPhysical;


public class Field1 extends Character_Monster_Com implements Dd {

	// ImageIcon monsterimg = new ImageIcon("game/img/슬라임.jfif");
	ImageIcon exit = new ImageIcon("game/img/탈출구.jfif");
	ImageIcon victory = new ImageIcon("game/img/승리.jfif");
	ImageIcon death = new ImageIcon("game/img/패배.jfif");
	ImageIcon chest = new ImageIcon("game/img/보물상자.png");
	ImageIcon recover = new ImageIcon("game/img/체력회복.jpg");
	ImageIcon renameParts = new ImageIcon("game/img/매직.jfif");

	String[] recoverChoice = { "50% 회복", "100% 회복", "나가기" };
	String[] reGameChoice = { "한 번 더 입장", "나가기" };
	boolean lifeCheck = true;
	ImageIcon[] easyMonsterImg = { new ImageIcon("game/img/슬라임.jfif"), new ImageIcon("game/img/슬라임2.png" + "") };
	ImageIcon[] nomalMonsterImg;
	ImageIcon[] hardMonsterImg;

	Character_Monster_Com[] eazyMonster1 = { new EasyMonster1(), new EasyMonster2() };
	Character_Monster_Com[] nomalMonster;
	Character_Monster_Com[] hardMonster;

	public Field1() { // Character_Monster_Com 클래스의 생성자 호출
		super();
		// TODO Auto-generated constructor stub
	}

	public Field1(int maxhp, int hp, int atk, int dfe) {
		super(maxhp, hp, atk, dfe);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 플레이어 도움 메서드
	 */

	// public String[][] Parts = new String[8][4];

	public void reinforcementParts() {// 장비 강화

	}

	public void deleteParts() {// 장비 삭제

	}

	public void renamePartsReCheck(int number) {
		if (number <= Cnt ) { //입력한 장비 번호가 보유한 장비 수 이하일 때 실행
			while (true) {
				String changeName = JOptionPane.showInputDialog("'" + number + "번' 아이템의 바꾸실 이름을 입력해주세요.");
				int choice = Integer.parseInt(JOptionPane.showInputDialog("정말" + "'" + number + "번' 의 이름을\n'"
						+ Parts[number - 1][0] + "' 에서" + "'" + changeName + "'로 바꾸시겠습니까?\n1.바꾸겠습니다.\n2.다시 입력하겠습니다."));
				if (choice == 1) {
					renameParts(number, changeName);
					break;
				}
				if (choice == 0) {
					JOptionPane.showMessageDialog(null, "변경할 닉네임을 다시 입력해주세요.");
				}
			}
		}
		if (number > Cnt) { //입력한 장비 번호가 보유한 장비 수보다 클 때
			JOptionPane.showMessageDialog(null, "입력한 번호의 장비 아이템이 없습니다.");
		}
	}

	public void renameParts(int number, String changeName) {// 검색한 장비 이름 바꾸기
		String before = Parts[number - 1][0];
		String after = Parts[number - 1][0] = changeName;
		JOptionPane.showMessageDialog(null, "장비 이름이 변경 되었습니다.\n" + "'" + before + "'" + " → " + "'" + after + "'",
				"장비 이름 변경", JOptionPane.DEFAULT_OPTION, renameParts);
	}

	public void searchParts(String keyword) {// 검색한 장비 정보 출력
		String result1 = "[ 1번째 검색한 장비 정보 ]\n\n";
		String result2 = "[ 2번째 검색한 장비 정보 ]\n\n";
		String a = "'";
		int[] saveSearchNumber; // 검색한 정보가 담긴 배열 행번호 저장
		int cnt = 0; // 검색된 장비 갯수
		int hang = 0; // saveSearchNumber[a]배열에 i값을 저장할 때 'a'행 번호 값
		for (int i = 0; i < Cnt; i++) {// 배열 행번호를 저장하는 배열의 크기를 정해주기 위한 반복문
			if (keyword.equals(Parts[i][0])) {
				cnt++;
			}
		}
		saveSearchNumber = new int[cnt];// 배열 크기 설정
		for (int i = 0; i < Cnt; i++) {
			if (keyword.equals(Parts[i][0])) {
				saveSearchNumber[hang] = i;
				hang++;
			}
		}
		if (cnt == 0) {
			result1 += a + keyword + a + "라는 이름의 \n보유 장비 아이템이 없습니다.\n";
			JOptionPane.showMessageDialog(null, result1);
		} else if (cnt > 0 && cnt < 5) { // 검색된 장비 갯수가 1개 이상 4개 이하일 때
			for (int i = 0; i < cnt; i++) {
				result1 += "( " + (saveSearchNumber[i] + 1) + "번 장비 아이템 )\n";
				for (int j = 0; j < 4; j++) {
					if (j == 0) {
						result1 += "장비 아이템 이름 : " + Parts[saveSearchNumber[i]][j] + "\n";
					} else if (j == 1) {
						result1 += "장비 공격력 : " + Parts[saveSearchNumber[i]][j] + "\n";
					} else if (j == 2) {
						result1 += "장비 방어력 : " + Parts[saveSearchNumber[i]][j] + "\n";
					} else if (j == 3) {
						result1 += "장비 최대체력 : " + Parts[saveSearchNumber[i]][j] + "\n";
					}
				}
				result1 += i == cnt - 1 ? "" : "\n";
			}
			JOptionPane.showMessageDialog(null, result1);
		} else if (cnt >= 5) {// 검색된 장비 갯수가 5개 이상 있을 때
			for (int i = 0; i < cnt; i++) {
				if (i < 4) {
					result1 += "( " + (i + 1) + "번 장비 아이템 )\n";
					for (int j = 0; j < 4; j++) {
						if (j == 0) {
							result1 += "장비 아이템 이름 : " + Parts[saveSearchNumber[i]][j] + "\n";
						} else if (j == 1) {
							result1 += "장비 공격력 : " + Parts[saveSearchNumber[i]][j] + "\n";
						} else if (j == 2) {
							result1 += "장비 방어력 : " + Parts[saveSearchNumber[i]][j] + "\n";
						} else if (j == 3) {
							result1 += "장비 최대체력 : " + Parts[saveSearchNumber[i]][j] + "\n";
						}
					}
					result1 += i == cnt - 1 ? "" : "\n";

				} else if (i >= 4) {
					result2 += "( " + (i + 1) + "번 장비 아이템 )\n";
					for (int j = 0; j < cnt; j++) {
						if (j == 0) {
							result2 += "장비 아이템 이름 : " + Parts[saveSearchNumber[i]][j] + "\n";
						} else if (j == 1) {
							result2 += "장비 공격력 : " + Parts[saveSearchNumber[i]][j] + "\n";
						} else if (j == 2) {
							result2 += "장비 방어력 : " + Parts[saveSearchNumber[i]][j] + "\n";
						} else if (j == 3) {
							result2 += "장비 최대체력 : " + Parts[saveSearchNumber[i]][j] + "\n";
						}
					}
					result2 += i == cnt - 1 ? "" : "\n";
				}

			}
			JOptionPane.showMessageDialog(null, result1);
			JOptionPane.showMessageDialog(null, result2);
		}

	}

	public void showPartsList() { // 내 보유 장비 아이템 목록 출력 메서드
		String result1 = "[ 보유 아이템 1번째 목록 ] \n\n";
		String result2 = "[ 보유 아이템 2번째 목록 ]\n\n";
		if (Cnt == 0) {
			result1 += "보유한 장비 아이템이 아직 없습니다.\n던전에서 획득하여 주세요.";
			JOptionPane.showMessageDialog(null, result1);
		} else if (Cnt > 0 && Cnt < 5) { // 장비 갯수가 1개 이상 4개 이하일 때
			for (int i = 0; i < Cnt; i++) {
				result1 += "( " + (i + 1) + "번 장비 아이템 )\n";
				for (int j = 0; j < 4; j++) {
					if (j == 0) {
						result1 += "장비 아이템 이름 : " + Parts[i][j] + "\n";
					} else if (j == 1) {
						result1 += "장비 공격력 : " + Parts[i][j] + "\n";
					} else if (j == 2) {
						result1 += "장비 방어력 : " + Parts[i][j] + "\n";
					} else if (j == 3) {
						result1 += "장비 최대체력 : " + Parts[i][j] + "\n";
					}
				}
				result1 += i == Cnt - 1 ? "" : "\n";
			}
			JOptionPane.showMessageDialog(null, result1);
		} else if (Cnt >= 5) {// 장비 갯수가 5개 이상 있을 때
			for (int i = 0; i < Cnt; i++) {
				if (i < 4) {
					result1 += "( " + (i + 1) + "번 장비 아이템 )\n";
					for (int j = 0; j < 4; j++) {
						if (j == 0) {
							result1 += "장비 아이템 이름 : " + Parts[i][j] + "\n";
						} else if (j == 1) {
							result1 += "장비 공격력 : " + Parts[i][j] + "\n";
						} else if (j == 2) {
							result1 += "장비 방어력 : " + Parts[i][j] + "\n";
						} else if (j == 3) {
							result1 += "장비 최대체력 : " + Parts[i][j] + "\n";
						}
					}
					result1 += i == Cnt - 1 ? "" : "\n";

				} else if (i >= 4) {
					result2 += "( " + (i + 1) + "번 장비 아이템 )\n";
					for (int j = 0; j < Cnt; j++) {
						if (j == 0) {
							result2 += "장비 아이템 이름 : " + Parts[i][j] + "\n";
						} else if (j == 1) {
							result2 += "장비 공격력 : " + Parts[i][j] + "\n";
						} else if (j == 2) {
							result2 += "장비 방어력 : " + Parts[i][j] + "\n";
						} else if (j == 3) {
							result2 += "장비 최대체력 : " + Parts[i][j] + "\n";
						}
					}
					result2 += i == Cnt - 1 ? "" : "\n";
				}

			}
			JOptionPane.showMessageDialog(null, result1);
			JOptionPane.showMessageDialog(null, result2);
		}

	}

	public void HpRecover() { // 플레이어 HP회복 메서드
		boolean check = true;
		while (check) {
			int choice = JOptionPane.showOptionDialog(null, "당신을 치료해 드릴게요.\n\n현재체력 : " + getHp() + "/" + getMaxHp(),
					"병원", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, recover, recoverChoice, null);
			switch (choice) {
			case -1:
				JOptionPane.showMessageDialog(null, "강제종료를 누르셨습니다. \n종료됩니다.");
				check = false;
			case 0:
				setHp((int) (getMaxHp() * 0.5));
				JOptionPane.showMessageDialog(null, "체력의 50%가 회복되었습니다.\n" + "현재 체력 : " + getHp() + "/" + getMaxHp());
				break;
			case 1:
				setHp(getMaxHp());
				JOptionPane.showMessageDialog(null, "체력의 100%가 회복되었습니다.\n" + "현재 체력 : " + getHp() + "/" + getMaxHp());

				break;
			case 2:
				JOptionPane.showMessageDialog(null, "나가기를 누르셨습니다.\n메인 메뉴로 이동합니다.");
				check = false;
				break;
			}
		}
	}

	public String setName() {// 게임 시작 후 닉네임 설정 메서드
		String name = JOptionPane.showInputDialog("자신의 닉네임을 입력해주세요.");
		return name;
	}

	public void showMyinpormation() { // 내 정보 출력 메서드
		String a = "내 닉네임 : " + getName() + "\n현재 체력 : " + getHp() + "/" + getMaxHp() + "\n현재 공격력 : " + getAtk()
				+ "\n현재 방어력 : " + getDfe() + "\n보유 머니 : " + getMoney();
		JOptionPane.showMessageDialog(null, a);
	}

	/*
	 * 장비 획득 알고리즘 관련 메서드
	 */

	public void partsDrop(int dungunNumber/* 던전 번호에 따라서 장비 드랍이 달라짐 */) {// 일정한 확률로 장비를 획득하는 메서드
		Random r = new Random();
		Random r1 = new Random();
		int a = r.nextInt(99);
		int b = r1.nextInt(99);
		if (dungunNumber == 1) {// 중급 던전일 때
			if (b < 40) {// (확률 40%)
				JOptionPane.showMessageDialog(null, "적을 처치하여 장비를 획득하셨습니다!", "아이템 획득", JOptionPane.DEFAULT_OPTION,
						chest);
				if (a < 50 && a >= 0) {// 난수가 전체 100 중에서 0~49면 장비획득 (확률 : 50%)
					easyDrop(Cnt);
				} else if (a >= 50 && a < 85) {// (확률 35%)
					nomalDrop(Cnt);
				} else if (a >= 85) { // (확률 15%);
					hardDrop(Cnt);
				}
			} else if (b >= 40) {// (확률 60%)
				JOptionPane.showMessageDialog(null, "적을 처치했지만 장비를 획득하지 못했습니다.");
			}
		}
		if (dungunNumber == 2) {// 중급 던전일 때
			if (b < 40) {// (확률 40%)
				JOptionPane.showMessageDialog(null, "적을 처치하여 장비를 획득하셨습니다!", "아이템 획득", JOptionPane.DEFAULT_OPTION,
						chest);
				if (a < 30 && a >= 0) {// (확률 : 30%)
					easyDrop(Cnt);
				} else if (a >= 30 && a < 75) {// (확률 45%)
					nomalDrop(Cnt);
				} else if (a >= 75) { // (확률 25%);
					hardDrop(Cnt);
				}
			} else if (b >= 40) {// (확률 60%)
				JOptionPane.showMessageDialog(null, "적을 처치했지만 장비를 획득하지 못했습니다.");
			}
		}
		if (dungunNumber == 3) {// 상급 던전일 때
			if (b < 40) {// (확률 40%)
				JOptionPane.showMessageDialog(null, "적을 처치하여 장비를 획득하셨습니다!", "아이템 획득", JOptionPane.DEFAULT_OPTION,
						chest);
				if (a >= 0 && a < 60) {// (확률 60)
					nomalDrop(Cnt);
				} else if (a >= 60) { // (확률 15%);
					hardDrop(Cnt);
				}
			} else if (b >= 40) {// (확률 60%)
				JOptionPane.showMessageDialog(null, "적을 처치했지만 장비를 획득하지 못했습니다.");
			}
		}
	}

	public void partsPutOn(String[][] partsTypeElement, int a) { // 장비 획득시 장비 스탯 만큼 능력치에 추가
		setAtk(Integer.parseInt(partsTypeElement[a][1]));
		setDfe(Integer.parseInt(partsTypeElement[a][2]));
		setMaxHp(Integer.parseInt(partsTypeElement[a][3]));
		setHp(Integer.parseInt(partsTypeElement[a][3]));
	}

	public void easyDrop(int cnt) {// 초급 장비 획득
		if (cnt == 8) {
			JOptionPane.showMessageDialog(null, "장비칸이 꽉 차서\n더 이상 장비 획득이 불가능합니다.");
		} else {
			Random r = new Random();
			int a = r.nextInt(4);
			Parts[cnt] = partsTypeElement[a];// 장비 데이터 저장
			partsDropShow(a);
			partsPutOn(partsTypeElement, a);
			Cnt++;
		}
	}

	public void nomalDrop(int cnt) {// 중급 장비 획득
		if (cnt == 8) {
			JOptionPane.showMessageDialog(null, "장비칸이 꽉 차서\n더 이상 장비 획득이 불가능합니다.");
		} else {
			Random r = new Random();
			int a = r.nextInt(8); // +4
			Parts[cnt] = partsTypeElement[a + 4];
			partsDropShow(a + 4);
			partsPutOn(partsTypeElement, a + 4);
			Cnt++;
		}
	}

	public void hardDrop(int cnt) {// 고급 장비 획득
		if (cnt == 8) {
			JOptionPane.showMessageDialog(null, "장비칸이 꽉 차서\n더 이상 장비 획득이 불가능합니다.");
		} else {
			Random r = new Random();
			int a = r.nextInt(5); // +8
			Parts[cnt] = partsTypeElement[a + 8];
			partsDropShow(a + 8);
			partsPutOn(partsTypeElement, a + 8);
			Cnt++;
		}
	}

	public void partsDropShow(int a/* 장비가 저장된 배열 행 번호 */) { // 장비 획득시 획득한 장비 정보 출력
		String result = "이름 : " + partsTypeElement[a][0] + "\n공격력 : +" + partsTypeElement[a][1] + "\n방어력 : +"
				+ partsTypeElement[a][2] + "\n최대체력 : +" + partsTypeElement[a][3];
		result += "\n장비를 획득하셨습니다!";
		JOptionPane.showMessageDialog(null, result);
	}

	/*
	 * 전투 관련 메서드
	 */
	public void monsterFight(int dungunNumber) {// 던전 입장
		lifeCheck = true;
		while (lifeCheck) {
			Random r = new Random();
			int a = r.nextInt(2);
			if (dungunNumber == 1) {
				eazyMonster1[a].setHp(eazyMonster1[a].getMaxHp());// 클래스 배열에서 랜덤 몬스터 객체를 가져옴
				JOptionPane.showMessageDialog(null,
						eazyMonster1[a].getName() + "\n(이)라는 몬스터가 등장했습니다!\n" + "체력 : " + eazyMonster1[a].getHp() + "/"
								+ eazyMonster1[a].getMaxHp() + "\n공격력 : " + eazyMonster1[a].getAtk() + "\n방어력 : "
								+ eazyMonster1[a].getDfe() + "\n처치 보상 : " + eazyMonster1[a].getMoney() + "원",
						"하급 던전 몬스터", JOptionPane.PLAIN_MESSAGE, easyMonsterImg[a]);
				fight(eazyMonster1[a], dungunNumber);
			}
		}
	}

	public void fight(Character_Monster_Com a/* 입력 받은 몬스터 객체 */, int dungunNumber) {

		while (true) {
			String choice1 = JOptionPane.showInputDialog(null, "내 체력 : " + getHp() + "/" + getMaxHp() + "\n\n몬스터 체력 : "
					+ a.getHp() + "/" + a.getMaxHp() + "\n\n1. 전투하기 \n2. 도망가기");
			if (Integer.parseInt(choice1) == 1) {

				a.setHp(-getAtk());
				JOptionPane.showMessageDialog(null, getName() + "(이)가 " + a.getName() + "을(를)\n " + getAtk()
						+ "의 공격력으로 공격하여\n "
						+ (getAtk() - a.getDfe() > 0 ? getAtk() - a.getDfe() + "만큼의 데미지를 입혔습니다" : "0만큼의 데미지를 입혔습니다."));
				if (a.getHp() == 0) { // 공격 후 몬스터 체력 0이 될 시 처치보상 획득 후 메인메뉴 이동
					setMoney(a.getMoney());// 처치 보상 획득
					partsDrop(dungunNumber);
					JOptionPane.showMessageDialog(null,
							a.getName() + " 몬스터가 처치되었습니다!\n처치 보상 획득 : +" + a.getMoney() + "원");
					int choice = JOptionPane.showOptionDialog(null, "용사님 감사합니다!", "승리", JOptionPane.DEFAULT_OPTION,
							JOptionPane.PLAIN_MESSAGE, victory, reGameChoice, null);
					if (choice == 0) {
						JOptionPane.showMessageDialog(null, "던전에 재입장 합니다.");
						break;
					}
					if (choice == 1) {
						JOptionPane.showMessageDialog(null, "메인메뉴로 이동합니다.");
						lifeCheck = false;// 나가기 누르면 반복문 탈출
						break;
					}
				}
				setHp(-a.getAtk());
				JOptionPane.showMessageDialog(null, a.getName() + "(이)가 " + getName() + "을(를)\n " + a.getAtk()
						+ "의 공격력으로 공격하여\n "
						+ (a.getAtk() - getDfe() > 0 ? a.getAtk() - getDfe() + "만큼의 데미지를 입혔습니다" : "0만큼의 데미지를 입혔습니다."));
				if (getHp() == 0) {// 공격 받은 후 체력이 0이 되면 메인메뉴로 이동
					if (getMoney() == 0) {
						JOptionPane.showMessageDialog(null, "몬스터에게 사망하셨습니다.\n메인메뉴로 이동합니다.", "Death",
								JOptionPane.PLAIN_MESSAGE, death);
						break;
					} else if (getMoney() >= 2000) {// 사망 시 보유 돈이 2000원 이상일 경우 -2000원
						JOptionPane.showMessageDialog(null, "몬스터에게 사망하셨습니다.\n회복 비용으로 -2000원 되셨습니다. \n메인메뉴로 이동합니다.",
								"Death", JOptionPane.PLAIN_MESSAGE, death);
						break;
					}
				}
			}

			if (Integer.parseInt(choice1) == 2) { // 몬스터 등장 후 도망가기 선택 시 실행되는 메서드
				JOptionPane.showMessageDialog(null, "도망가기를 누르셨습니다.\n메인메뉴로 이동합니다.", "빤스런", JOptionPane.PLAIN_MESSAGE,
						exit);
				lifeCheck = false;
				break;
			}
		} // while 경계
	}

	@Override
	public void ff() { // 인터페이스에서 받아온 추상 메서드를 이렇게 오버라이드 하면 그냥
						// 여기 클래스안에서 선언한거랑 같은 기능을 한다. (그냥 인터페이스에서 받아온거라고 생각할 필요 없다고 생각)
		System.out.println("안녕");
		// TODO Auto-generated method stub

	}

}
