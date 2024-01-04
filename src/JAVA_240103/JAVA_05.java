package JAVA_240103;

import java.util.Arrays;
/*
 * 
 * 
 * 
 *                   주석 달아오기 숙제에에ㅔ에에에에에ㅔㅇ에에
 * 
 * 
 * 
 * */
public class JAVA_05 {
	
	// 입국심사를 기다리는 사람은 1명 이상 1,000,000,000명 이하라서 int형
	
	int jolra_gine(int n, int[] times){
//		int n = 10;
//		int[] times = {3,15,7,11,31}; main에서 받아주는데 왜 굳이 여기에서 또 받아줄려고함? 지움
		int answer = 0;
		int timeslength = times.length;
		while(n!=0) { // 대기하고 있는 사람이 0이 되면 종료
			answer ++;
		for(int i=0; i<timeslength; i++) {
				if(answer%times[i]==0) {  // 만약 심사대에 자리가 비어있다면
					n--; // 사람을 하나 씩 빼주는 것
				}
			}			
		}
		
		return answer;		
	}	
	

	    public long solution(int n, int[] times) {
	    	
	        long answer = 0;
	        Arrays.sort(times); //배열 오름차순 정렬
	        long left = 0; // 왼쪽에 있는 심사대
	        long right = (long) n * times[times.length - 1]; // 오른쪽에 있는 심사대 
	        
	        while (left <= right) {
	            long mid = (left + right) / 2;
	            long sum = 0; // 심사위원 수 구하기
	            
	            for (int i = 0; i < times.length; i++) { 
	                sum += mid / times[i];  // 심사 빨리 하는 심사원 순서대로 출력                      
	            }
	            if (sum < n) {
	                left = mid + 1; // 심사위원 수가 N보다 많다면 +1
	            } else { 
	                right = mid - 1; // 심사위원 수가 N보다 적다면 -1
	                answer = mid;
	            }
	        }
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		
		int n = 10;
		int[] times = {3,15,7,11,31};
		
		JAVA_05 immigration = new JAVA_05(); // 현재 파일이 JAVA_05라서 임의로 바꿔줬어용
		long answer = immigration.solution(n, times); //immigration에 n과 time 할당
		System.out.println(answer); //answer 호출
		
	}

}
