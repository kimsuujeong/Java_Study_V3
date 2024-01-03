package JAVA_240101.special_01;

public interface Animal {

	void sound(); // ������ �����Ҹ��� ���� �޼ҵ�

	void move(); // ������ �����̴� �޼ҵ�

	int getEnergy(); // ������ ���� �������� ��ȯ�ϴ� �޼ҵ�

	// ���ڴ� '����'�ϰ� ��� ������ 10�� �Ҹ��Ѵ�. �޸��� 20 �������� �Ҹ��Ѵ�. //Mammal ������
	// ����� '�ٿ�'�ϰ� ��� ������ 05�� �Ҹ��Ѵ�. ������ 10 �������� �Ҹ��Ѵ�. // Bird ��

	//

	/*
	 * [����] �������� �������� �ൿ�� ������
	 */

	public static void main(String[] args) {
		Penguin penguin = new Penguin();
		Lion lion = new Lion();

		for (int i = 0; i < 3; i++) {
			penguin.sound();
			penguin.move();
			lion.sound();
			lion.move();
		}
		

		System.out.println("��� ü���� : " + penguin.getEnergy());
		System.out.println("���� ü���� : " + lion.getEnergy());

	}

}
