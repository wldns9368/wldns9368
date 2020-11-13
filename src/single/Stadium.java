package single;

import java.awt.Desktop;

public class Stadium {
	public static void main(String[] args) {
//		IronMan i = new IronMan();
		IronMan i = IronMan.getInstance();
		IronMan.fight();
		i.walk();
		IronMan.fight();
		Desktop d = Desktop.getDesktop();
		
	}
}
