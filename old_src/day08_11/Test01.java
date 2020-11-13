package day08_11;

public class Test01 {
	//ctrl + space 단축키
	//sysout
	//System.out.print <- 줄바꿈 X
	//System.out.println <- 줄바꿈
	public static void main(String[] args) {
		/*
		 * 정수형 : int, long
		 * 실수형 : double, float
		 * 문자형 : char
		 * 문자열형 : String
		 * 논리형 : boolean - true/false
		 */
		int a1 = 10;
		int a2 = 20;
		double a3 = 3.14;
		double a31 = 3.14;
		String a4 = "지운";
		boolean a5 = true;
		
		System.out.println(a5);
		
		System.out.println(a1+" "+a2+" "+(a3+a31));	
		System.out.println("Hello Java World"+"\n나의 이름은 : "+a4);
		System.out.println("I'm Jiwoon");
		
	}
}
