package day22;

import java.util.Scanner;

public class Starbucks {//�͸�Ŭ����
	private String[] placeName = { "������", "������", "���빮��" };

	private String[] menu = { "�Ƹ޸�ī��", "����Ƽ", "īǪġ��" };
	private String[] menu1 = { "����Ƽ", "���̽�Ƽ", "ī���ī" };
	private String[] menu2 = { "����ֽ�", "�������ֽ�", "�����ֽ�" };

	private int[] arPrice = { 5000, 8000, 9000 }; 
	private int income = 0;
	

	public String[] getMenu() {
		return menu;
	}

	public void setMenu(String[] menu) {
		this.menu = menu;
	}

	public String[] getMenu1() {
		return menu1;
	}

	public void setMenu1(String[] menu1) {
		this.menu1 = menu1;
	}

	public String[] getMenu2() {
		return menu2;
	}

	public void setMenu2(String[] menu2) {
		this.menu2 = menu2;
	}

	public int[] getArPrice() {
		return arPrice;
	}

	public void setArPrice(int[] arPrice) {
		this.arPrice = arPrice;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public void setName() {//���� ���� ���� �޴����� ����ȭ
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < placeName.length; i++) {
			System.out.println((i + 1) + ". " + placeName[i] + "\n");
		}
		String name = s.next();// �����̸� ����
		if(this.placeName[0].equals(name)) {
			registCafe(name, new Cafe() {

				@Override
				public void setMenu(String[] menu1) {
					menu = menu1;
				}

				@Override
				public void sell(String choice) {
					for (int i = 0; i < getMenu().length; i++) {
						if (getMenu()[i].equals(choice)) {
							System.out.println(choice + " �ֹ� �Ϸ�.");
							income += arPrice[i];
						}
					}
				}

				@Override
				public String[] getMenu() {
					return menu;
				}

			});
		}
		if(this.placeName[1].equals(name)) {
			registCafe(name, new Cafe() {

				@Override
				public void setMenu(String[] menu) {
					menu1 = menu;
				}

				@Override
				public void sell(String choice) {
					for (int i = 0; i < getMenu1().length; i++) {
						if (getMenu1()[i].equals(choice)) {
							System.out.println(choice + " �ֹ� �Ϸ�.");
							income += arPrice[i];
						}
					}
				}

				@Override
				public String[] getMenu() {
					return menu1;
				}

			});
		}
		if(this.placeName[2].equals(name)) {
			registCafe(name, new Cafe() {

				@Override
				public void setMenu(String[] menu1) {
					menu2 = menu;
				}

				@Override
				public void sell(String choice) {
					for (int i = 0; i < getMenu2().length; i++) {
						if (getMenu2()[i].equals(choice)) {
							System.out.println(choice + " �ֹ� �Ϸ�.");
							income += getArPrice()[i];
						}
					}
				}

				@Override
				public String[] getMenu() {
					return menu2;
				}

			});
			
		}
	}

	public void registCafe(String placeName/* �����̸� */, Cafe c) {
		Scanner s = new Scanner(System.in);
		
		if(this.placeName[0].equals(placeName)) {
			System.out.println(placeName+ " �޴���");
			//c.setMenu(menu);
			System.out.println("----Menu----");

			for (int i = 0; i < c.getMenu().length; i++) {
				System.out.println(i + 1 + c.getMenu()[i]);//�޴��� ���
			}
		}
		if(this.placeName[1].equals(placeName)) {
			System.out.println(placeName+ " �޴���");
			//c.setMenu(menu1);
			System.out.println("----Menu----");

			for (int i = 0; i < c.getMenu().length; i++) {
				System.out.println(i + 1 + c.getMenu()[i]);//�޴��� ���
			}
		}
		if(this.placeName[2].equals(placeName)) {
			System.out.println(placeName+ " �޴���");
			//c.setMenu(menu2);
			System.out.println("----Menu----");

			for (int i = 0; i < c.getMenu().length; i++) {
				System.out.println(i + 1 + c.getMenu()[i]);//�޴��� ���
			}
		}

		System.out.println("���ϴ� �����̸��� �Է��ϼ���.\n");
		String food = s.next();
		c.sell(food);
	}

	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		gangnam.setName();
		System.out.println("���� ���� : " + gangnam.getIncome());

	}

}
