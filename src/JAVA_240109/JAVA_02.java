package JAVA_240109;

import java.util.Random;
import java.util.Scanner;

public class JAVA_02 { // 문1

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		String c = "";

		while (true) {

			int ran_num = ran.nextInt(100);
			System.out.println(ran_num);

			while (true) {
				System.out.println("숫자 입력 : ");
				int n = sc.nextInt();
				cnt++;

				if (ran_num > n) {

					System.out.println("작다");

				} else if (ran_num < n) {

					System.out.println("크다");

				} else {

					System.out.printf("맞았다 (%d)", cnt);

				}

			}

		}

	}
}
