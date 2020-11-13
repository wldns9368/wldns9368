package day22;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest extends Frame{
	
	public ButtonTest() {
		super("�͸� Ŭ���� �׽�Ʈ");
		Button btn = new Button("����!");
		add(btn);
		setSize(500, 500);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {//x��ư�� ������ �� ������ ��
				System.out.println("������ ����");
				
				System.exit(0);
			}
		});
		
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getX());
				System.out.println(e.getY());
				System.out.println("��ư �������!");
			}
			/*@Override
			public void mouseReleased(
					MouseEvent e) {
				System.out.println(e.getX());
				System.out.println(e.getY());
				System.out.println("��ư �������!");
				
			}*/
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ButtonTest();
	}
	
}














