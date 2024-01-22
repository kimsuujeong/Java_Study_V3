package JAVA_240117;

public class PowerNoise {

	String title;
	String artist;
	int year;
	String country;

	public void show(String title, String artist, int year, String country) {
		// TODO Auto-generated method stub
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;

	}

	public static void main(String[] args) {
		PowerNoise artist1 = new PowerNoise();
		artist1.show("hwaryo han gunchim", "군침이", 2015, "대한민국");
		
		System.out.printf("%d년 %s 국적의 %s가 부른 %s",artist1.year,artist1.country,artist1.artist,artist1.title);
	}

}