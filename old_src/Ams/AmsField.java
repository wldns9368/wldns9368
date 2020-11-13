package Ams;

import javax.swing.JOptionPane;

public class AmsField {
	String[][] arrPlane = new String[100][5];

	int cnt = 0;
	int rLength = cnt;
	int cLength = arrPlane[0].length;
	int updateIndex = 0;

	boolean a(String keyword) {//수정하기에서 입력한 값이 메모리에 있는지 확인해주는 메서드
		boolean check = true;
		for (int i = 0; i < cnt; i++) {
			if(arrPlane[i][1].equals(keyword)) {
				check = false;
			}
			check = true;

		}
		return check;
	}

	// 추가하기
	void insert(String[] arPlane) {
		arrPlane[cnt] = arPlane;
		cnt++;
	}

	// 검색하기
	String search(String keyword, int index) {
		String result = "";
		int arIndex[];
		int cnt = 0;
		for (int i = 0; i < this.cnt; i++) {
			if (keyword.equals(arrPlane[i][index])) {// 입력한 값과 저장되어 있는 값과 문자값이 일치하는지 검사
				cnt++;
				updateIndex = i;
				result += "" + i + ", ";// 문자열 result에 i값(문자형태)을 저장
			}
		}
		arIndex = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			arIndex[i] = Integer.parseInt(result.split(", ")[i]);// 검색한 결과에 걸린 i값을 배열에 저장
		}
		return show(arIndex);
	}

	// 검색 목록보기
	String show(int[] arIndex) {
		String result = "";
		for (int i = 0; i < arIndex.length; i++) {
			result += "★";
			for (int j = 0; j < cLength; j++) {
				result += j == cLength - 1 ? arrPlane[arIndex[i]][j] : arrPlane[arIndex[i]][j] + ", ";

			}
			result += "\n";
		}
		if (arIndex.length == 0) {
			result = "검색 결과 없음";
		}
		return result;
	}

	// 수정하기
	// 출발지, 목적지
	// 출발지 수정 목적지 수정
	// 항공기 번호가 존재할 때 JOption.showOptionDialog()사용하기
	// 항공기 번호를 입력받고 해당 항공기의 출발지와 목적지를 수정
	// 출발지와 목적지가 동일하면 수정 실패
	void update(String keyword, int fixNum/* 고칠 항목의 번호(출발지, 도착지) */, String newValue/* 새롭게 들여올 값 */) {
		String result = "";
		if (fixNum == 0) {
			result = "출발지";
		} else {
			result = "도착지";
		}
		String beforeValue = arrPlane[updateIndex][fixNum + 3];
		arrPlane[updateIndex][fixNum + 3] = newValue;
		String afterValue = arrPlane[updateIndex][fixNum + 3];
		JOptionPane.showMessageDialog(null, "'" + keyword + "'" + " 항공기 번호의 " + result + " 항목의 값이 " + "\n'"
				+ beforeValue + "  →  " + afterValue + "'" + " 값으로 변경되었습니다.");
	}

	// 삭제하기
	boolean delete(String keyword) {
		boolean check = false;
		for (int i = 0; i < cnt; i++) {
			if (keyword.equals(arrPlane[i][1])) {
				JOptionPane.showMessageDialog(null, "항공기번호 : " + "'" + arrPlane[i][1] + "'" + " 번호에 대한 정보가 삭제되었습니다.");
				for (int j = i; j < cnt; j++) {// 겹칠 횟수
					arrPlane[j][0] = arrPlane[j +1][0];
					arrPlane[j][1] = arrPlane[j +1][1];
					arrPlane[j][2] = arrPlane[j +1][2];
					arrPlane[j][3] = arrPlane[j +1][3];
					arrPlane[j][4] = arrPlane[j +1][4];
					
				}
				check = true;
				cnt--;
			}
		}
		return check;
	}
	/*
	 * boolean delete(String keyword) { boolean check = false; for (int i = 0; i <
	 * cnt; i++) { if (keyword.equals(arrPlane[i][1])) {
	 * JOptionPane.showMessageDialog(null, "항공기번호 : " + "'" + arrPlane[i][1] + "'" +
	 * " 번호에 대한 정보가 삭제되었습니다."); for (int j = 0; j < cnt - i; j++) {// 겹칠 횟수 for (int
	 * j2 = 0; j2 < arrPlane[0].length; j2++) { arrPlane[i][j2] = arrPlane[i +
	 * 1][j2]; } i++; } cnt--; check = true; } } return check; }
	 */

	// 목록보기
	String show() {

		String result = "항공사, 항공기번호, 최대승객수, 출발지, 도착지\n";
		if (cnt == 0) {
			result += "\n                     (정보가 없습니다)\n'추가하기'(을)를 통해서 정보를 입력해주세요.";
		} else {
			for (int i = 0; i < cnt; i++) {
				result += "★";
				for (int j = 0; j < cLength; j++) {
					result += j == cLength - 1 ? arrPlane[i][j] : arrPlane[i][j] + ", ";

				}
				result += "\n";
			}
		}
		return result;
	}
}
