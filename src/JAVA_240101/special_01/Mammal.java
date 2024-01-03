package JAVA_240101.special_01;

public interface Mammal extends Animal{
	
	// ���ڴ� '����'�ϰ� ��� ������ 10�� �Ҹ��Ѵ�. �޸��� 20 �������� �Ҹ��Ѵ�. //Mammal ������

	
	@Override
	default void sound() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	default void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	default int getEnergy() {
		// TODO Auto-generated method stub

		return 100;
	}
	
	void breastfeed(); // ���� ����
	
	 //	 * "Lion" Ŭ������ "Mammal" �������̽���,
	

}
