package cond;

public class If4 {
	
	public static void main(String[] args) {
		
		int age = 8;
		
		if(age <= 7) {
			System.out.println("미취학");
		}else if(age <= 13) {
			// 앞의 조건이 내포되어 있음. 즉, 7 초과 13 이하와 동일함
			System.out.println("초등학생");
		}else if(age <= 16){
			System.out.println("중학생");
		}else if(age <= 19) {
			System.out.println("고등학생");
		}else {
			System.out.println("성인");
		}
	}
}
//else if문은 앞선 if문의 조건이 거짓일 때 다음 조건을 검사