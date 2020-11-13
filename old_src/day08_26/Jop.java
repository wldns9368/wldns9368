package day08_26;

import java.util.Random;

class Person {//������
	String name;
	int age;
	String gender;
	int money;

	public Person() {
	}

	public Person(String name, int age, String gender, int money) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.money = money;
	}
}

class Teacher extends Person {
	String subject; // ����
	String position; // ��å(����)
	private int income = 10_000_000;
	int cnt = 0;

	public Teacher(String name, int age, String gender, int money, String position) { // alt + shift + s + c ���� ������ ����Ű
		super(name, age, gender, money);// �θ� �����ڿ��� �� �Ű� ������ �޴� ��ó�� ����
		this.position = position;
		// TODO Auto-generated constructor stub
	}

	void teach(String subject) {

		cnt++;
		// if(cnt % 10 == 0) income = (income + 1.1); << ������ ������ ����.
		if (cnt % 10 == 0)
			income += 1.1; // << �� �ڵ�� ���� �ǹ����� ������ ���� �ʴ´�.
		// �� ������ +=���� ���� �����ڴ� �Ϲ������� ������ ������ ���� �������� �ڵ� ����ȯ �����ֱ� �����̴�.
		// �׷��� income += 1.1�� �ᱹ >> //if(cnt % 10 == 0) income = (int) (income + 1.1) ��
		// ����.
		money += income; // �� �� ����� ������ money���� ���� income�� ��ŭ �߰�
		System.out.println(name + " " + position + "(��)�� " + subject + " ������" + " ���� ��");
		System.out.println("�����ܰ� : " + money + "��");
	}

}

public class Jop { // ���
	public static void main(String[] args) {
		Teacher a = new Teacher("������", 18, "��", 100000, "����");
		String []arSub = {"C���", "���̽�", "JAVA"};
		Random r = new Random();
		int index;
		index = r.nextInt(3);
		
		a.teach(arSub[index]);

		
		
		
	}
}
