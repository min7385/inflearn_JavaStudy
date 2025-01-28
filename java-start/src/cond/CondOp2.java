package cond;

public class CondOp2 {

	public static void main(String[] args) {
		int age = 17;
		String status = (age >= 18) ? "성인" : "미성년자";
		System.out.println("age= " + age + ", status= " + status);
	}
}
// 삼항 연산자 사용
// 조건식 ? 참이면 : 거짓이면