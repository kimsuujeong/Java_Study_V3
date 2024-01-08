package JAVA_240105.special_02;

public interface Main {

	public static void main(String[] args) {		
		// 마법사 객체 생성
		System.out.println("마법사아아아아아앙아ㅏㅇ아아아아아앙 루미너스1!!!!!!!!!!");
		Sorcerer sorcerer = new Sorcerer(50);
		sorcerer.learnSpell("파이어볼");
		sorcerer.castSpell("파이어볼");
		System.out.println("마법사의 마력: " + sorcerer.getMana());
		System.out.println("");
		
		

		// 기사 객체 생성
		System.out.println("마법사아아아아아앙아ㅏㅇ아아아아아앙 팬터어어엄1!!!!!!!!!!");
		Knight knight = new Knight(100);
		knight.attack();
		knight.block();
		System.out.println("기사의 체력: " + knight.getHealth());
		System.out.println("");

		// 도적 객체 생성
		System.out.println("마법사아아아아아앙아ㅏㅇ아아아아아앙 짱도어어엉!!!!!!!!!!");
		Rogue rogue = new Rogue(20);
		rogue.hide();
		rogue.addItemToBackpack("금화");
		rogue.bag();
		rogue.addItemToBackpack("은화");
		rogue.removeItemFromBackpack("금화");
		System.out.println("");
	}

}
