package JAVA_240116.JAVA_01;

public class UserInfoClient {

	public static void main(String[] args) {

		UserInfo user1 = new UserInfo();

		user1.setPassWd(1234);
		user1.setUserId("KIMSUJEONG1234");
		user1.setUserName("KIMSUJEONG");

		UserInfoDao userInfoDao = null;

		String DBType = "Oracle"; // 만약 DBType이 Mysql이면 Mysql에서 실행된다.

		if (DBType == "Oracle") {
			userInfoDao = new UserInfoOracleDao();
		} else if (DBType == "Mysql") {
			userInfoDao = new UserInfoMySqlDao();
		} else {
			System.out.println("없는 DB프로그램 입니다.");
		}

		userInfoDao.deleteUserInfo(user1);
		userInfoDao.insertUserInfo(user1);

//		UserInfoDao Mysql_userInfoDao = new UserInfoMySqlDao();
//		
//		Mysql_userInfoDao.deleteUserInfo(user1);

	}

}
