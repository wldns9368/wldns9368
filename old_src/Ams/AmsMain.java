package Ams;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.sun.net.httpserver.Authenticator.Result;



public class AmsMain {
	public static void main(String[] args) {
		String result1 = "1, 2, 3, 4, 5";
		String result2 = "6, 7, 8, 9, 0";
		AmsField af = new AmsField();
		String[] arPlane = new String[5];
		int[] ar = new int[2];
		int choice = 0;
		String keyword = "";
		String insertMsg = "[추가하실 정보를 그대로 입력하세요](, 포함)]\n" + "항공사," + " 항공기번호, 최대승객수, 출발지, 도착지";
		String[] serchMenu = { "항공사", "항공기 번호", "최대승객수", "출발지", "도착지" };
		String[] fixMenu = { "출발지", "도착지" };
		ImageIcon img = new ImageIcon("src/img/1.gif");
		while (true) {
			String[] menu = { "추가하기", "검색하기", "수정하기", "삭제하기", "목록보기" };
			choice = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, img, menu, null);

			if (choice == -1) {
				break;
			}

			switch (choice) {
			// 추가하기
			case 0: {
				arPlane = JOptionPane.showInputDialog(insertMsg).split(", ");
				if (arPlane.length != 5) {
					JOptionPane.showMessageDialog(null, "값이 이상합니다.");
					break;
				}
				af.insert(arPlane);

				break;
			}
			// 검색하기
			case 1: {
				int index = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION,
						JOptionPane.PLAIN_MESSAGE, img, serchMenu, null);
				if (index != -1) {
					keyword = JOptionPane.showInputDialog("검색하실 " + serchMenu[index] + " (을)를 입력해주세요.");
					JOptionPane.showMessageDialog(null, af.search(keyword, index));
				} else {
					JOptionPane.showMessageDialog(null, "나가기를 누르셨습니다.\n메인 메뉴로 돌아갑니다.");
					break;
				}
				break;
			}
			// 수정하기
			// 출발지, 목적지
			// 출발지 수정 목적지 수정
			// 항공기 번호를 입력받고 해당 항공기의 출발지와 목적지를 수정
			// 출발지와 목적지가 동일하면 수정 실패
			case 2: {
				
				keyword = JOptionPane.showInputDialog("수정하실 항공기 번호를 입력해주세요");
				if (keyword == null) {// 문자열 변수에 연결된 'JOptionpane'을 강제종료하면 인트형 변수는 정수 '-1'이 들어가지만
										// 문자열형 변수에는 아무 값도 들어가지 않아
										// 주솟값이 'null'이므로 'keyword'의 주솟값을 'null'이랑 비교하여 강제종료 문구가 뜨게함.
										// String 같은 클래스형은 문자값이 같아도 주솟값이 다르다.

					// int, double같은 기본형 변수들은 같은 타입끼리 문자값이 같으면 주솟값이 같다.
					// (배열도 포함) (★ 타입이 다른데 값이 같으면 주솟값이 다르다 ★)
					// (★ 주솟값이 같다 → 할당된 값이 같다 ★)

					// 2차원 배열을 열번호 없이 '='하면 주솟값을 할당해주는거임 (아래서 계속)
					// 만약 그렇게 위처럼 했다면 다시 행번호 열번호 둘 다 넣어서 할당을 해도 주솟 행번호 주솟값이 같아진다.
					// 그러면 이제 주솟값이 같은 것의 하나의 열 번호에 값을 넣으면 주솟값이 같은 다른 행번호의 같은 열 번호 안에 //서로 값이 공유됨
					// (주솟값이 같기 때문)
					// 방금 넣은 값이 그대로 들어간다

					// a[][]<2차원배열
					// a[1] = a[2] 이렇게하면 행번호 1, 2끼리의 행 주솟값이 같아진다.
					// ※ 그런데 위에 처럼 했다고 a[1]의 주솟값과 a[1][n]이 서로 같아지는 것은 아니다 ※
					//(행 주솟값과 열 주솟값이 같아 진다는 것은 아니라는 말 )
         			// ※ 위에처럼 하기 전까지는 a[1] = a[2]의 주솟값은 a[1] = a[2]안에 들어간 값이 서로 같아도 주솟값이 다르다 ※
					
					// 그래서 a[2][1] = "안녕하세요" 이렇게 넣으면
					// 다른 행 같은 열 번호의 a[1][1]에도 값이 똑같이 들어간다.
					
					// 다시 a[1][1] = 반값습니다" 이렇게 넣으면
					// a[2][1]에도 값이 똑같이 들어간다. (주솟값이 같은 값끼리 서로 합쳐서 가장 마지막으로 받은 값을 서로에게 저장시킨다)
					
					//값 우선순위 (행 주솟값 > 열 주솟값) << 행 주솟값이 같으면 열 주솟값이 달라도 값이 공유된다.
					// ※
					String [][]a = new String[5][5];
					System.out.println(System.identityHashCode(a[1]));
					System.out.println(System.identityHashCode(a[2]));
					a[1] = a[2];
					System.out.println(System.identityHashCode(a[1]));
					System.out.println(System.identityHashCode(a[2]));
					
					a[1][2]= "잉";
					System.out.println(System.identityHashCode(a[1]));
					System.out.println(System.identityHashCode(a[2][2]));
					System.out.println(System.identityHashCode(a[1][2]));

					
					a[3] = a[1];
					a[1][2]= "잉";
					System.out.println(a[1][2]);
					System.out.println(a[3][2]);
					a[2][2] = "앙";
					System.out.println(a[1][2]);
					System.out.println(a[3][2]);
					JOptionPane.showMessageDialog(null, "강제종료");
					break;
				}
				if (af.a(keyword) == true) {
					JOptionPane.showMessageDialog(null, "해당 항공기 번호가 없습니다.");
				} else {
					int fixNum = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION,
							JOptionPane.PLAIN_MESSAGE, img, fixMenu, null);
					String newValue = JOptionPane.showInputDialog("새로 바꾸실 " + fixMenu[fixNum] + "(을)를 입력해주세요.");
					af.update(keyword, fixNum, newValue);
					break;
				}
				break;
			}

			// 삭제하기
			case 3: {
				keyword = JOptionPane.showInputDialog("삭제할 항공기 번호를 입력해주세요.");
				if (af.delete(keyword)) {
					JOptionPane.showMessageDialog(null, "삭제 완료");
				} else {
					JOptionPane.showMessageDialog(null, "삭제 실패");
				}
				break;

			}
			// 목록보기
			case 4: {

				JOptionPane.showMessageDialog(null, af.show());
				break;
			}
			}
		}
	}
}
