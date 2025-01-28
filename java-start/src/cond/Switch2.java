package cond;

public class Switch2 {

	public static void main(String[] args) {
		int grade = 2;
		
		int coupon;
		switch(grade) {
		case 1:
			coupon = 1000;
			break;
		case 2:
			coupon = 2000;
			break;
		case 3:
			coupon = 3000;
			break;
		default:
			coupon = 500;
		}
		System.out.println("발급받은 쿠폰: " + coupon);
	}
}
// switch문 사용
// switch문은 조건식의 특징이 값이 같은지 확인하는 연산만 가능하다.