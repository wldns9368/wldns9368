package Car;

public class MainCar {
	
	public static void main(String[] args) {
		
		int i = 1;
		Car mycar = new Car();
		mycar.Brand = "����";
		mycar.Color = "��ȫ";
		mycar.Price = 100;
		mycar.Speed = 120;
		mycar.info();
		
		
		while(i<10) {
			i++;
			mycar.speedup();
		}
	}
}
