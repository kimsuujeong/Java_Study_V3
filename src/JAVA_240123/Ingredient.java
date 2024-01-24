package JAVA_240123;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ingredient {
	String name; // 재료 이름
	int quantity; // 재료의 수량

	public Ingredient(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	void useIngredient(int amount) throws InsufficientIngredientException {
		// 재료를 사용하는 메서드.
		// 이 메서드는 주어진 양만큼 재료의 수량을 감소시킵니다.
		// 만약 재료의 수량이 부족한 경우 InsufficientIngredientException을 발생시킵니다.

	}

}

class PotionFactory{ // 포션 제조소

	Map<String, Integer> ingredients = new HashMap<String, Integer>();

	void addIngredient(String name, int quantity) {
		// 재료의 이름과 수량을 입력받아 ingredients 맵에 추가하는 메서드.
		ingredients.put(name, quantity);
	}

	void makePotion(String ingredientName, int amount) throws InsufficientIngredientException {
		// 주어진 재료와 수량에 따라 포션을 제조하는 메서드.
		// 재료의 수량이 부족한 경우 InsufficientIngredientException을 발생시킵니다.

	}

	void checkIngredientQuantity(String ingredientName) throws IngredientNotFoundException {
		// 주어진 재료의 수량을 확인하는 메서드입니다.
		// 재료가 존재하지 않는 경우 IngredientNotFoundException을 발생시킵니다.
	}

	void restockIngredient(String ingredientName, int quantity) throws IngredientNotFoundException {
		// 주어진 재료의 수량을 추가하는 메서드입니다.
		// 재료가 존재하지 않는 경우 IngredientNotFoundException을 발생시킵니다.

	}

}
