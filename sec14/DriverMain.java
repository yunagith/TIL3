package ch07_Inheritance.sec14;

public class DriverMain {

	public static void main(String[] args) {
		// �Ű����� ������ ����
		Driver driver=new Driver();
		
		Bus bus=new Bus();
		Taxi taxi=new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);

	}

}
