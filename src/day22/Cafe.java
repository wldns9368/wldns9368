package day22;

public interface Cafe {//익명클래스
	
	//메뉴판
	//판매
	void setMenu(String[] menu);
	String[] getMenu();
	void sell(String choice);
}
