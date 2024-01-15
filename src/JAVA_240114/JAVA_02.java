package JAVA_240114;

public class JAVA_02 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);

		System.out.println("회원 가입 정보");
		System.out.println("이름을 적어주세요 : ");
		String name = "김수정";
		System.out.println("메일을 적어주세요 : ");
		String mail = "";

		mailAndName(name, mail);

	}

	public static void mailAndName(String name, String mail) {

		System.out.println(mail);

		// 메일 주소 길이 찾기
//		if (mail == null) {
//			System.out.println("메일 주소가 입력되지 않았습니다.");
//		}

		try {
			if (mail == null) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("메일 주소가 입력 되지 않았습니다.");
		}

		// @이 찾기
		if (!mail.contains("@")) {
			System.out.println("아따 메일 주소가 잘못 됐소");
		}

		// admin 찾기
		if (mail.contains("admin")) {
			System.out.printf("%s는 관리자가 아닙니다.\n", name);
		}

		// 없는 메일 주소 찾기
		if (!mail.contains(".com")) {
			System.out.println("존재하지 않는 주소 입니다.");
		}

		System.out.printf("메일 주소-> %s \n이메일 주소 -> %s \n", name, mail);

	}
	
	static void notEmilException() throws Exception{
		
	}

}
