package cond;

public class If3 {

	public static void main(String[] args) {

		int age = 14;
		
		if(age <= 7) {
			System.out.println("미취학");
		}
		if(age >= 8 && age <= 13) {
			System.out.println("초등학생");
		}if(age >= 14 && age <= 16) {
			System.out.println("중학생");
		}if(age >= 17 && age >= 19) {
			System.out.println("고등학생");
		}if(age >= 20) {
			System.out.println("성인");
		}
	}
}
// 이미 조건을 만족했지만, 불필요한 다음 조건을 계속 검사함.
// 코드효율성 낮음. 예를 들어 첫번째 조건에서 적어도 8살 이상이겠구나 검증되지만, 아래 age >= 8 조건이 있음.