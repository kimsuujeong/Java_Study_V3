package JAVA_240109.Special.OOP_01;

public class PriorityAllocation implements Scheculer{
	
	// 3. 고객의 등급에 따라 등급이 높은 고객은 업무능력이 우수한 상담원에게 배분합니다.
	
	
	@Override
	public void getNaxtCall() {
		// TODO Auto-generated method stub
		System.out.println("등급이 높은 고객님 전화가 들어왔습니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("제일 우수한 상담원에게 전화를 넘깁니다.");
	}

}
