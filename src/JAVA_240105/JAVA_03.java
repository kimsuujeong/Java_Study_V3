package JAVA_240105;

import java.util.Scanner;

public class JAVA_03 {

	// 랜덤으로 구구단 출력
	// 맞추면 정답입니다.
	// 못맞추면 오답입니다. 출력

	// 정답수를 카운트도 해보세요.
	// 게임은 5회 진행.
	// null = (int)(Math.random()*9)+2;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cnt = 0;

		for (int i = 0; i < 5; i++) {
			int first = (int) (Math.random() * 9) + 1;
			int second = (int) (Math.random() * 9) + 1;

			int gob = first * second;

			System.out.printf("%d * %d = ?", first, second);

			System.out.println("정답을 써주세요");

			int a = sc.nextInt();
			if (gob == a) {

				System.out.println("\n정답입니다.");
				cnt++ ;

			} else System.out.println("틀렸습니다.");
		}
		System.out.printf("총 맞춘 갯수는 %d 입니다.", cnt);

	}

}
