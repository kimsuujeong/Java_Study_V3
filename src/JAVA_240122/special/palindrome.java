package JAVA_240122.special;

public class palindrome {
	
	// 예전에 진우님? 준이언니?가 리뷰한건데 그거 참고하고 코드 분석 했어요!!

	public static int this_is_palindrome(String s) {
		for (int i = s.length(); i > 0; i--) { // 1. 받아주는 s의 길이를 i에 빼줍니다.
			for (int j = 0; j+i <= s.length(); j++) { 
				// 2. j는 뒤의 값 입니다. 또한 j은 i의 값과 같습니다.
				if (isPalindrome(s, j, j + i - 1)) 
					// 3. 앞에 값과 뒤의 값을 주지만, 겹치는 가운데 값은 빼준채로 시작!!
					// 6. -1을 하고 다시 되돌려 줍니다.
					return i; // 4. 길이 만큼 다 return해줍니다.
			}
		}

		return 0;
	}

	static boolean isPalindrome(String value, int start, int end) {
		while (start <= end) { 
			// 5-1.받아준 길이 값을 모두 빼줍니다.
			// 7. 다시 받아 온 값이 모두 없어질 때 까지 반복해 줍니다.
			if (value.charAt(start++) != value.charAt(end--))
				// 5-2. 하지만 문자열 첫과 문자열 끝이 다르다면 빼주고 다시 받아옵니다.
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		System.out.println("s			answer");
		System.out.println("abcdcba\t\t\t" + this_is_palindrome("abcdcba"));
		System.out.println("abacde\t\t\t" + this_is_palindrome("abacde"));

	}

}
