package JAVA_240114;

public class JAVA_02 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);

		System.out.println("회원 가입 정보");
		System.out.println("이름을 적어주세요 : ");
		String name = "김수정";
		System.out.println("메일을 적어주세요 : ");
		String mail = "tnwjd0103@naver.com";

		try {
			mailAndName(name, mail);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void mailAndName(String name, String mail) throws Exception {

		System.out.println(mail);
		
		try {
			// 메일 주소 길이 찾기
		if (mail == "") {
			throw new NotEmail(mail);
		}

		// @이 찾기
		if (!mail.contains("@")) {
			throw new InvalidEmailException(mail);
		}

		// admin 찾기
		if (mail.contains("admin")) {
			throw new choonsikException(name, mail);
		}

		// 없는 메일 주소 찾기
		if (!mail.contains(".com")) {
			throw new NotAdress(mail);
		}

		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		
		System.out.printf("메일 주소-> %s \n이메일 주소 -> %s \n", name, mail);

	}
	

}
