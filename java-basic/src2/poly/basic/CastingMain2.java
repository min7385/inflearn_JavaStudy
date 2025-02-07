package poly.basic;

public class CastingMain2 {

	public static void main(String[] args) {
		// 부모 변수가 자식 인스턴스 참조(다형적 참조)
		Parent poly = new Child();
		// 단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
		// poly.childMethod();
		
		// 다운캐스팅(부모 타입 -> 자식 타입 변경)
		// Child child = poly;는 부모 타입을 자식 타입에 값을 할당하는게 불가
		// 캐스팅해도 poly 타입은 Parent로 기존과 같이 유지됨.
		// 참조값을 꺼내고 참조값이 Child 타입이 되는 것
		Child child = (Child) poly;
		child.childMethod();
		
		// 일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
		((Child)poly).childMethod();
	}

}
