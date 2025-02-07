package poly.basic;

public class CastingMain5 {
	
	public static void main(String[] args) {
		Parent parent1 = new Parent();
		System.out.println("parent1 호출");
		call(parent1);
		
		Parent parent2 = new Child();
		System.out.println("parent2 호출");
		call(parent2);
	}
	
	public static void call(Parent parent) {
		
		parent.parentMethod();
		// instanceof의 왼쪽의 인스턴스 타입을 오른쪽 타입에 넣을 수 있으면 true를 반환, 없으면  false를 반환 
		if(parent instanceof Child) {
			System.out.println("Child 인스턴스 맞음");
			Child child = (Child) parent;
			child.childMethod();
		}else {
			System.out.println("Child 인스턴스 아님");
		}
	}
}
// 안전한 다운캐스팅을 위한 방법
