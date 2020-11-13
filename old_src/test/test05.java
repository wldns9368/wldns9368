package test;

public class test05 {
	public static void main(String[] args) {
		int[][] i = new int[10][10];
		int[] j = {10,20,30};
		 i[0][0]=j[0];
		i[0][1]=j[1];
		i[0][2]=j[2];
		System.out.println(i[0][0]);
		int[][] a = new int[100][100];
	
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[1][0] = 100;
		System.out.println(a[0][0]=a[1][0]);
	}
}
