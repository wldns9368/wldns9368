package GameMain1;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



import Field.EasyMonster1;
import Field.MonsterPhysical;
import Field_main.Dd;
import Field_main.Field1;


public class Main {
	static int count = 0;

	
	public static void main(String[] args) {

		ImageIcon img = new ImageIcon("game/img/dddddddddddddddddds212221.jpg");
		ImageIcon img1 = new ImageIcon("game/img/던전.jfif");
		ImageIcon img2 = new ImageIcon("game/img/마이룸.jpg");
		ImageIcon img3 = new ImageIcon("game/img/아키네이터.png");

		String[] start1 = { "게임시작", "나가기" };
		String[] start2 = { "던전입장", "체력 회복", "내 정보", "마이룸" };
		String[] start3 = { "하급던전", "중급던전", "상급던전" };
		String[] start4 = { "보유 아이템 검색", "보유 아이템 수정", "보유 아이템 삭제", "보유 아이템 목록" }; 
		int inputStart1 = JOptionPane.showOptionDialog(null, "", "지운이의 이세계 탐험", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, img, start1, null);
		if (inputStart1 == 1) {
			JOptionPane.showMessageDialog(null, "나가기를 누르셨습니다.");
		} else {
			/*
			 * Timer timer1 = new Timer();// 타이머 객체 생성 TimerTask task1 = new TimerTask() {
			 * // 작업 객체 생성
			 * 
			 * @Override public void run() {
			 * 
			 * if (count == 0) { JOptionPane.showMessageDialog(null, "이세계로 빨려들어갑니다...");
			 * count++; } else if (count == 1) { JOptionPane.showMessageDialog(null, ".");
			 * count++; } else if (count == 2) { JOptionPane.showMessageDialog(null, "..");
			 * count++; } else if (count == 3) { JOptionPane.showMessageDialog(null, "...");
			 * count++; } else if (count == 4) { JOptionPane.showMessageDialog(null,
			 * "와! 여기구나!"); timer1.cancel(); } } }; timer1.schedule(task1, 500, 1000);
			 */
			// 최대체력, 현재체력, 공격력, 방어력
			Field1 f1 = new Field1(100, 100, 20, 5);
			String name = f1.setName();
			f1.setName(name);
			f1.showMyinpormation();
			Dd a23 = new Field1();
			a23.ff();
			while (true) {
				int inputstart2 = JOptionPane.showOptionDialog(null, "", "지운이의 이세계 탐험", JOptionPane.DEFAULT_OPTION,
						JOptionPane.PLAIN_MESSAGE, img, start2, null);
				if (inputstart2 == -1) {
					JOptionPane.showMessageDialog(null, "강제종료를 누르셨습니다. \n종료됩니다.");
					break;
				}
				switch (inputstart2) {

				case 0://던전 입장
					int inputstart3 = JOptionPane.showOptionDialog(null, "", "지운이의 이세계 탐험", JOptionPane.DEFAULT_OPTION,
							JOptionPane.PLAIN_MESSAGE, img1, start3, null);//던전 선택
					switch (inputstart3) {

					case 0:
						Random r1 = new Random();
						f1.monsterFight(1); //몬스터 종류 넘버, 던전 넘버 //하급던전 = 1
					case 1:

					case 2:
					}

					/*
					 * JOptionPane.showMessageDialog(null, "등장dfsdsadsadasdsadsadsadsa", "몬스터 등장",
					 * JOptionPane.WARNING_MESSAGE, img);//몬스터 등장시 이미지 출력
					 */

					break;
				case 1://회복하기
					f1.HpRecover();
					break;
				case 2://내 정보
					f1.showMyinpormation();
					break;
				case 3://내 아이템	ww
					int inputstart4 = JOptionPane.showOptionDialog(null, "당신의 마이룸입니다.", "지운이의 마이룸", JOptionPane.DEFAULT_OPTION,
							JOptionPane.PLAIN_MESSAGE, img2, start4, null);//아이템 관련 선택
					switch (inputstart4) {
					case 0://아이템 검색
						
						String keyword = (String) JOptionPane.showInputDialog(null, "아키네이터에게 보유 장비 정보를 물어보세요", "무엇이든 물어보살", JOptionPane.PLAIN_MESSAGE, img3,null , null);
						f1.searchParts(keyword);
						break;
					case 1://아이템 수정
						int number = Integer.parseInt(JOptionPane.showInputDialog("바꾸실 장비 번호를 입력해주세요."));
						f1.renamePartsReCheck(number);
						break;
					case 2://아이템 삭제
						
						break;
					case 3://아이템 목록
						f1.showPartsList();
						break;
					}
					break;
				}

			} // while 경계
		} // 시작 else 경계
	}
}
