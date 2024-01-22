package JAVA_240121;

import java.util.Scanner;

public abstract class Food {

	public String name;
	public int price;

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public static void main(String[] args) {
		Order order = new Order();
		order.menu();
		System.out.printf("총 금액은 %d 입니다.", order.calculateTotalPrice(order.addFood()));
	}

}

class Burger extends Food {
	@Override
	public void setPrice(String name, int price) {
		// TODO Auto-generated method stub
		super.setPrice(name, price);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}
	

}

class Pizza extends Food {
	@Override
	public void setPrice(String name, int price) {
		// TODO Auto-generated method stub
		super.setPrice(name, price);
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}
}

class Salad extends Food {
	@Override
	public void setPrice(String name, int price) {
		// TODO Auto-generated method stub
		super.setPrice(name, price);
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}
}

class menu {
	
}

class Order {
	
	Burger burger = new Burger();

	Pizza pizza = new Pizza();
	Salad salad = new Salad();
	
	void menu() {
		burger.name = "치즈버거";
		burger.price = 5000;
		pizza.name = "불고기피자";
		pizza.price = 12000;
		salad.name = "연어 샐러드";
		salad.price = 8900;
		
	}
	
	public int addFood() {
		
//		System.out.println(burger.name);
//		System.out.println(salad.name);
		
		System.out.println("주문 할거에오!");
		
		return calculateTotalPrice(burger.price+salad.price);
	}
	
	public int calculateTotalPrice(int n) {
		return n;
	}
	
	
}