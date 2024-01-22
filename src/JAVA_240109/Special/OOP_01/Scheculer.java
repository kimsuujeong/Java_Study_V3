package JAVA_240109.Special.OOP_01;

public interface Scheculer {

	void getNaxtCall();

	void sendCallToAgent();

	public static void main(String[] args) {
		Scheculer roundRobin = new RoundRobin();
		Scheculer lestjob = new LeastJob();
		Scheculer priorityAllocation = new PriorityAllocation();

		roundRobin.getNaxtCall();
		roundRobin.sendCallToAgent();
		
		lestjob.getNaxtCall();
		lestjob.sendCallToAgent();
		
		priorityAllocation.getNaxtCall();
		priorityAllocation.sendCallToAgent();
		
	}
}
