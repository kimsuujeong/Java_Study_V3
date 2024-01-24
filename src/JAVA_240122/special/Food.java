package JAVA_240122.special;


public class Food {
	String name;
	int price;
	
	public void getFoodInfo(String name, int price) {
		this.name=name;
		this.price=price;
	}
}
class KoreanFood extends Food{

	@Override
	public void getFoodInfo(String name, int price) {
		// TODO Auto-generated method stub
		super.getFoodInfo(name, price);
	}
	
	
}

class WesternFood extends Food{

	@Override
	public void getFoodInfo(String name, int price) {
		// TODO Auto-generated method stub
		super.getFoodInfo(name, price);
	}
	
}

//////////////////////////////////////////////////////////////////

class Menu{
	public void foodList(){ // 음식 객체 저장
		
	}
	public void addFood(Food food) { // 음식 객체를 메뉴에 추가
		
		foodList();
		
	}
	public void getFood(String name) { // 주어진 이름과 일치하는 음식 객체를 반환하는 메서드
	}
}

class Order{
	public void menu(){ // Menu 객체
		
	}
	public void addOrder(String foodName) {
		// 주문한 음식을 추가하는 리스트
		
	}
	public void calculateTotalPrice(){
		// 주문한 음식들의 총 가격을 계산하여 반환하는 메서드
		
	}
}