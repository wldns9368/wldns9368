package tms;
//pay() : ����� ������ �� �ִ� �޼���
//showDestMsg(String destination) : ������ "�������� �����߽��ϴ�" �޼��� ����ϴ� �޼���
//�ڽ�Ŭ���� : ����, ����ö

//VIEW
//�̿��Ͻ� ���߱����� �����ϼ���
//������� ����
//�������� ��ư���� ����(optionDialog())
//������� �������� ���� �ʵ��� ����
//������ �����⸸ ����
//����ö�� ������ ����
//���� > ���� > ���� > ����
public abstract class Public { //�߻� Ŭ���� ����
	String[] arStation = {"����", "����", "����", "����"};
	
	abstract int pay(int money);
	abstract void showDestMsg(String destination);
	abstract String go(int btnIndex, int money);
}














