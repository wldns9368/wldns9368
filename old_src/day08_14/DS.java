package day08_14;

import javax.print.DocFlavor.STRING;

public class DS {//new string ���� Ŭ����
	
	public static void main(String[] args) {
		String cat = new String("add");//��ü ����
		String fox = new String("add");//��ü ����
		String dog = "add";                          //����
		String pig = "add";
		
		if(dog == cat) {//�ּڰ� ��
			System.out.println("����1");
		}
		else if(cat.equals(fox)) {//���ڿ��� ��
			System.out.println("����2");
		}
		else {
			System.out.println("����");
		}
	}

}
