package JAVA_240109.OOP;

public class pishbbang {

	String name; // 이름
	String quality; // 재료
	static int n;

	pishbbang(String name, String quality) {
		this.name = name;
		this.quality = quality;
	}

	public void makefishbbang() {
		System.out.printf("%S을 넣은 %s 완성!!\n", quality, name);
	}

	public static void makefishbbang(String name, String quality) {
		System.out.printf("%S을 넣은 %s 완성!!\n", quality, name);
	}

	public static void main(String[] args) {
		
		pishbbang[] fishes = {
			new pishbbang("팥붕", "팥"),
			new pishbbang("슈붕", "슈크림"),
			new pishbbang("피붕", "피자")
		};
		
		
		
		
		for (pishbbang fish : fishes) {
			fish.makefishbbang();
		}
		
		pishbbang p1 = new pishbbang(null, null);


	}
}
