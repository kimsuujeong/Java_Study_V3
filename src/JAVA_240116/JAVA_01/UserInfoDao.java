package JAVA_240116.JAVA_01;

public interface UserInfoDao {
	
	public void insertUserInfo(UserInfo userInfo); // 삽입
	public void updateUserInfo(UserInfo userInfo); // 수정
	public void deleteUserInfo(UserInfo userInfo); // 삭제

}

class UserInfoMySqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("MySql에서 insert 되었습니다."+ userInfo);
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("MySql에서 update 되었습니다."+ userInfo);
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("MySql에서 delete 되었습니다."+ userInfo);
		
	}
	
}

class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Oracle에서 insert 되었습니다."+ userInfo);
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Oracle에서 update 되었습니다."+ userInfo);
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Oracle에서 delete 되었습니다."+ userInfo);
		
	}
	
}