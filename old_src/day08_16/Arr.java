package day08_16;

import javax.swing.JOptionPane;

public class Arr {
	public static void main(String[] args) {
		int[][] arrincom = new int[2][3];// 값을 입력받아 저장
		String[][] arrname = { { "강남점A", "신촌점A", "분당점A" }, { "강남점B", "신촌점B", "분당점B" } };
		int[] aSum = new int[2]; // 연령별 총합
		int[] bSum = new int[3]; // 지점별 총합
		int Asum = 0; // 전체 총합

		double[] aAvg = new double[2];// 연령별 평균
		double[] bAvg = new double[3];// 지점별 평균
		double AAvg = 0.0; // 전체 평균
		String[] name1 = { "키즈", "성인" };
		String[] name2 = { "강남점", "신촌점", "분당점" };
		String result = "";// 결과값 출력을 위한 변수

		int rLength = arrincom.length;
		int cLength = arrincom[0].length;
		for (int i = 0; i < rLength; i++) {// (연령별, 지점별, 전체) 총합 구하는 반복문
			for (int j = 0; j < cLength; j++) {
				arrincom[i][j] = Integer.parseInt(JOptionPane.showInputDialog(arrname[i][j] + " " + "매출액을 입력하세요."));
				aSum[i] += arrincom[i][j];//입력 값을 연령별 합계 변수에 반복해서 저장
				bSum[j] += arrincom[i][j];//입력 값을 지점별 합계 변수에 반복해서 저장
				Asum += arrincom[i][j];//입력 값을 전체 합계 변수에 반복해서 저장
			}
		}
		
		for (int i = 0; i < aAvg.length; i++) {// 연령별 평균 구하기
			aAvg[i] = Double.parseDouble(String.format("%.2f", (double) aSum[i] / bSum.length));
		}
		for (int i = 0; i < bAvg.length; i++) {// 지점별 평균 구하기
			bAvg[i] = Double.parseDouble(String.format("%.2f", (double) bSum[i] / aSum.length));
		}
		AAvg = Double.parseDouble(String.format("%.2f", (double) Asum / (rLength * cLength)));// 전체 평균 구하기
		for (int i = 0; i < rLength; i++) {// 연령별 매출액 출력
			for (int j = 0; j < cLength; j++) {
				result += arrname[i][j] + " 매출액 : " + arrincom[i][j] + " 만원\n";
			}
			result += name1[i] + " 총 매출액 : " + aSum[i] + " 만원\n";
			result += name1[i] + " 평균 매출액 : " + aAvg[i] + " 만원\n";
		}

		for (int i = 0; i < bSum.length; i++) {// 지점별 매출액 출력
			result += name2[i] + " 총 매출액 : " + bSum[i] + " 만원\n";
			result += name2[i] + " 평균 매출액 : " + bAvg[i] + " 만원\n";
		}
		result += " 전체 총 매출액 : " + Asum + " 만원\n";
		result += " 전체 평균 매출액 : " + AAvg + " 만원\n";
		JOptionPane.showMessageDialog(null, result);

	}

}
