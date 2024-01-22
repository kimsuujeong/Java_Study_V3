package JAVA_240117;

public class JAVA_01 {

	public static int bus_calculator(int a, transportation bus ) {
		return a - bus.charge();
	}
	
	public static int subway_calculator(int a, transportation subway) {
		return a - subway.charge();
	}

	public static void main(String[] args) {
		Freinds freinds_Ruppy = new Freinds("루피", 5000);
		Freinds freinds_Proro = new Freinds("뽀로로", 10000);
		
		transportation bus = new Bus();
		transportation subway = new Subway();
		
		System.out.println("루피는 버스를 탑승 합니다.");
		System.out.println(bus_calculator(freinds_Ruppy.money, bus));
		System.out.println("뽀로로는 지하철을 탑승 합니다.");
		System.out.println(subway_calculator(freinds_Proro.money, subway));

	}

}

class Freinds {

	String name;
	int money;

	public Freinds(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}

abstract class transportation {
	abstract int charge();
}

class Bus extends transportation {

	@Override
	int charge() {
		// TODO Auto-generated method stub
		return 1000;
	}

}

class Subway extends transportation {

	@Override
	int charge() {
		// TODO Auto-generated method stub
		return 1200;
	}

}