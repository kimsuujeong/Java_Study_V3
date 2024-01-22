package JAVA_240118;

public class Child {
	String name;
	int age;
	float weight;
	
	Child(){
		
	}
	public Child(String name, int age, float weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public static void main(String[] args) {
		Child in = new Child("군침이", 24, (float) 972.4);
		
		System.out.println("###인적사항###");
		System.out.printf("이름 : %s \n", in.name);
		System.out.printf("나이 : %d \n", in.age);
		System.out.printf("신장 : %.1f \n", in.weight);
	}
}
