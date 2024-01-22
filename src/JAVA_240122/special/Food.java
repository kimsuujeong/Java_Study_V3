package JAVA_240122.special;

public class Food {

	String name;
	int price;
	
	void getFoodInfo(String name, int price){ // 음식 정보
		
	}
}

class KoreanFood extends Food{

	@Override
	void getFoodInfo(String name, int price) {
		// TODO Auto-generated method stub
		super.getFoodInfo(name, price);
	}
	
}

class WesternFood extends Food{

	@Override
	void getFoodInfo(String name, int price) {
		// TODO Auto-generated method stub
		super.getFoodInfo(name, price);
	}
	
}

class Menu{
	void foodList(){ // 음식 객체를 저장하는 리스트
		
	}
	void addFood(Food food){ // 음식 객체를 메뉴에 추가하는 메서드
		
	}
	void getFood(String name) { 
		// 주어진 이름과 일치하는 음식 객체를 반환
		// Menu 클래스를 이용하여 메뉴를 생성하고, 여러 음식들을 추가하세요.
		
	}
}

class Order{
	void menu(Menu menu){
		
	}
	void orderList(String foodName) { // 주문한 음식들을 저장하는 리스트
		
	}
	void addOrder(String foodNmae) { // 주문한 음식을 추가하는 메서드
		
	}
	void calculateTotalPrice() {
		//주문한 음식들의 총 가격을 계산하여 반환하는 메서드
		//Order 클래스를 이용하여 음식을 주문하고, 주문한 음식들의 총 가격을 출력하세요.
		//이러한 요구사항을 충족하는 클래스들을 작성하여 음식 주문 시스템을 구현해보세요. 
		//필요한 경우 클래스의 속성과 메서드를 추가할 수 있습니다.
	}
}

class Main{
	public static void main(String[] args) {
		
	}
}
