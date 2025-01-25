package cond;

public class If1 {

	public static void main(String[] args) {
		int age = 20;
		
		if(age >= 18) {
			System.out.println("성인입니다.");
		}
		if(age < 18) {
			System.out.println("미성년자입니다.");
		}
	}
}
// if문이 true이면 {} 코드블럭 실행
// 		false이면 {} 코드블럭 미실행
