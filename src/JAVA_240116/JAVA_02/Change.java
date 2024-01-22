package JAVA_240116.JAVA_02;

import java.util.Scanner;

public interface Change {
	double changeMethod(double src);

	String getSrc();

	String getDest();

	public static final double rate = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		run Run = new run();
		

		System.out.println(Run.getSrc()+"을 "+Run.getDest()+" 로 변환");
		System.out.print(Run.getSrc()+"을 입력하세요>> ");
		double val = sc.nextDouble();
		double res = Run.changeMethod(val);
		System.out.printf("변환 결과: %.2f %s입니다", res, Run.getDest());
		sc.close();

	}
}

class run implements Change {

	@Override
	public double changeMethod(double src) {
		return src/1339.00; // 현재 240119/16:19 기준 환율 1,339.00원
	}

	@Override
	public String getSrc() {
		return "원";
	}

	@Override
	public String getDest() {
		return "달러";
	}


}