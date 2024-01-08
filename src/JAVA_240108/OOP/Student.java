package JAVA_240108.OOP;

public class Student extends Main{
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	String name;
	int numbers;
	int year;
	
	void study() {
		System.out.println("공부를 합니다.");
	}
	
	void play() {
		System.out.println("pc방에 쥰내 갑니다.");
	}
	
	void eat() {
		System.out.println("학식 먹기이이잉ㅇ");
	}
}
