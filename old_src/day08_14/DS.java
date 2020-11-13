package day08_14;

import javax.print.DocFlavor.STRING;

public class DS {//new string 연습 클래스
	
	public static void main(String[] args) {
		String cat = new String("add");//객체 생성
		String fox = new String("add");//객체 생성
		String dog = "add";                          //변수
		String pig = "add";
		
		if(dog == cat) {//주솟값 비교
			System.out.println("성공1");
		}
		else if(cat.equals(fox)) {//문자열만 비교
			System.out.println("성공2");
		}
		else {
			System.out.println("실패");
		}
	}

}
