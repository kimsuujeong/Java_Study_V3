package JAVA_240109.Special.OOP_01;

public class RoundRobin implements Scheculer{
	
	// 1. 모든 상담원이 동일한 상담 건수를 처리하도록 상담원 순서대로 배분합니다.

	@Override
	public void getNaxtCall() {
		// TODO Auto-generated method stub
		System.out.println("상담원 리스트를 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("상담 건수가 가장 적은 분에게 전화를 넘깁니다.");
		
	}

}
