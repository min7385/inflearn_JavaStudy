package poly.basic;

public class CastingMain4 {

	// 다운캐스팅을 자동으로 하지 않는 이유
	public static void main(String[] args) {
		Parent parent1 = new Child();
		Child child1 = (Child) parent1;
		child1.childMethod(); // 문제 없음
		
		Parent parent2 = new Parent();
		Child child2 = (Child) parent2;	// 런타임 오류 - ClassCastException
										// 메모리 상에 Child가 존재하지 않음.
		child2.childMethod();	// 실행 불가
		// 다운캐스팅을 생략했다면 컴파일 오류 발생. 명시함으로써 강제로 다운캐스팅하는 것임.
	}

}
