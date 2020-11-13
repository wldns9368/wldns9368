package test;

import javax.swing.JOptionPane;



public class Test1 {
	String [][] main = new String[100][5];
	 
	int cnt;
	void a(String[] are) {
		main[cnt] = are;
		cnt++;
	}
	void c(int a) {
		JOptionPane.showMessageDialog(null, main[a]);
	}

}
