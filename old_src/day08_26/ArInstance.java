package day08_26;

import java.util.Scanner;


public class ArInstance { //Ŭ���� �迭 > ��ü�� ������ �����ؾ� �ϴ� ���
	                      //�迭 Ÿ������ �� ���� ���� �� ����Ѵ�.
	
	                      //����� �ص� �����ڴ� ��ӵ��� �ʴ´�.(�ݵ�� ���� �����ؾ� �ȴٴ� ��)
	                      //��� �ڽ� Ŭ������ �ν��Ͻ��� ������ �� �θ� Ŭ������ �⺻ �����ڸ� �ڵ� ȣ���ϰ� �ȴ�.
	                       
	                      //�׳� �θ� Ŭ������ �����ڸ�ŭ �ڽ� Ŭ�������� �� ��ŭ �Ȱ��� ������.
	             
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Animal[] arAni = new Animal[3];//Ŭ���� �迭 ����
		for (int i = 0; i < arAni.length; i++) {
			String name;
			int age;
			String feed;
			//arAni[i] = new Animal();//Ŭ���� i�� ° ������ ��üȭ
			
			System.out.println(i+1 + "�� ���� �̸� : ");
			//arAni[i].name = sc.next();
			name = sc.next();
			//System.out.println(arAni.name + "�� ���� : ");
			//arAni[i].age = sc.nextInt();
			System.out.println("���� : ");
			age = sc.nextInt();
			//System.out.println(arAni.name + "�� ���� : ");
			//arAni[i].feed = sc.next();
			System.out.println("���� : ");
			feed = sc.next();
			//System.out.println(a instanceof Life);
			
			Animal a = new Life(name, age, feed);
			System.out.println(arAni[0]);
		
			//arAni[i] = new Life(name, age, feed);//��üȭ 
			System.out.println(arAni[0]);
			System.out.println(arAni[0] instanceof Life);
			
		}
	
		for (int i = 0; i < arAni.length; i++) {
			System.out.println(arAni[i]);
		}
	}

}
class Life extends Animal{
	
	public Life(String name, int age, String feed) {
		// TODO Auto-generated constructor stub
		System.out.println("���쿡��");
	}
	void a2() {
		
	}
	@Override
	public void a1() {
		System.out.println("��");
	}
	
	public Life() {
		System.out.println("��[��");
		// TODO Auto-generated constructor stub
	}

	
	
	
}
class Dd{
	
}
class Animal {
	public void a1() {
		System.out.println("��");
	}
	public Animal() {
		System.out.println("�����������ˤ�");
	}
	
	/*public Animal(String name, int age, String feed) {
		
		this.name = name;
		this.age = age;
		this.feed = feed;
	}*/

	String name;
	int age;
	String feed;
	
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", feed=" + feed + "]";
	}
	
}