package JAVA_240105.Computer;

public class Computer {
	
	// 컴퓨터를 구성
	// 컴퓨터 속성
	// 속성 - 크기, 성능, 디자인
	String size = "ㅈㄴ큼";
	String performance = "ㅈㄴ빠름";
	String design = "화려";
	
	// 행동 - 데이터를 저장한다. 검색한다. 불러온다.
	void save() {
		System.out.println("데이터를 저장 합니다.");
	}
	void search() {
		System.out.println("데이터를 검색 합니다.");
	}
	void load() {
		System.out.println("데이터를 불러 옵니다.");
	}
	
	public static void main(String[] args) {
		
		Computer com1 = new Computer();
		
		System.out.println(com1.size);
		System.out.println(com1.performance);
		System.out.println(com1.design);
		
		com1.save();
		com1.search();
		com1.load();
		
	}

}
