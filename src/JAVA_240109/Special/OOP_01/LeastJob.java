package JAVA_240109.Special.OOP_01;

public class LeastJob implements Scheculer{
	// 2. 쉬고 있거나 상담원에게 할당된 통화 수가 가장 적은 상담원에게 배분합니다.
	
	@Override
	public void getNaxtCall() {
		// TODO Auto-generated method stub
		System.out.println("쉬고있거나 건수가 가장 적은 상담원을 불러옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("쉬고있는 상담원에게 통화를 넘깁니다.");
		System.out.println("쉬고있는 상담원이 없다면 건수가 가장 적은 상담원을 불러옵니다.");
		
	}

}
