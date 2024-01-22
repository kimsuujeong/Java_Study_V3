package JAVA_240116.JAVA_03;

import java.util.Scanner;

public class SmartPhone {

	String name;
	String tel;

	public SmartPhone(String name, String tel) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.tel = tel;
	}

}

class PhoneNumList extends SmartPhone {

	public PhoneNumList(String name, String tel) {
		super(name, tel);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// 전화번호 저장부
		Scanner sc = new Scanner(System.in);

		System.out.println("인원수 입력>> ");
		int n = sc.nextInt();
		SmartPhone[] s = new SmartPhone[n];

		for (int i = 0; i < n; i++) {
			System.out.println("이름과 전화번호(이름과 번호는 빈칸없이 입력) >> ");
			String names = sc.next();
			String numbers = sc.next();

			s[i] = new PhoneNumList(names, numbers);
		}
		System.out.println("저장되었습니다...");

		String search = "";
		// 전화번호 검색부
		do {
			System.out.println("검색할 이름>>");
			search = sc.next();
			
			for (SmartPhone smartPhone : s) {
				if (smartPhone.name.equals(search)) {
					System.out.printf("%s의 번호는 %s 입니다.\n", smartPhone.name,smartPhone.tel);
					break;
					
				} else {
					System.out.printf("%s 이(가) 없습니다.\n", smartPhone.name);
				}
			}
			
		} while (search != "exit");
		

	}

}
