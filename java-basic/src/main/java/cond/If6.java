package cond;

public class If6 {
	
	public static void main(String[] args) {
		int price = 10000;
		int age = 10;
		int discount = 0;
		
		if(price >= 10000) {
			discount = discount + 1000;
			System.out.println("10000원 이상 구매는 1000원 할인");
		}else if(age <= 10) {
			discount = discount + 1000;
			System.out.println("어린이는 1000원 할인");
		}
		System.out.println("총 할인금액: " + discount + "원");

		// 실행하는 문장이 하나이면  {} 코드블록 없어도 됨. 대신 한 문장만 코드를 실행하니 권장안함. → 가독성과 유지보수 차원에서 {} 써주길 권장
		// 아래 코드에서 {}로 하나로 묶었다면 둘 다 실행안되어야 함.
		if(false)
			System.out.println("if문에서 실행됨");
			System.out.println("if문에서 실행안됨");
	}
}
// If5와 비교
// if - else if: 하나로 묶여 둘 중 하나만 코드 수행