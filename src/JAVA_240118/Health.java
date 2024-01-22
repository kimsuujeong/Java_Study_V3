package JAVA_240118;

public class Health {

	char gender; //(성별)
    double tall; //(신장)
    double weight; //(체중)

	public Health() {
		
	}

	void input(char gender, double tall, double weight) {
		this.gender = gender;
		this.tall = tall;
		this.weight = weight;
	}

	void output1(Health input) {
		System.out.printf("성별(M/F) : %c \n",gender);
		System.out.printf("신장(Cm) : %.1f \n",tall);
		System.out.printf("체중(kg) : %.2f \n",weight);
	}

}

class Info extends Health{
	double s_weight=0.0; //(표준체중)
    double fat=0.0;      //(비만도)
    String result=null;   //결과값)
    
	public Info() {
		// TODO Auto-generated constructor stub
	}
	public Info(double s, double f, String r) {
		s_weight = s;
		fat = f;
		result = r;
	}
	
	public void calculate(double s, double f, String r){
		
		if(gender == 'M') {
			s_weight  = (weight-100)*0.9;
			fat = weight/s_weight*100;
		}else {
			s_weight  = (weight-100)*0.85;
			fat = weight/s_weight*100;
		}
		
//		if (fat <= 90) {
//			result = "저체중";
//		} else if (fat >= 91 || fat <= 100){
//			result = "정상(표준체중)";
//		} else if (fat >= 111 || fat <= 120){
//			result = "과체중";
//		} else if (fat >= 121 || fat <= 130){
//			result = "경도비만";
//		} else if (fat >= 131 || fat <= 150){
//			result = "중도비만";
//		} else {
//			result = "고도비만";
//		}
		
		System.out.println(gender);
		
	}
    
	public void output2(){
		System.out.printf("당신의 비만도는 %.2f 이고, %s 입니다.", fat, result);
	}
    
}
