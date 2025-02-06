package extends1.super2;

public class ClassC extends ClassB{
	
	public ClassC() {
		// 기본 생성자가 아니기 때문에 직접 만들어줘야 함.
		// 자식 생성자의 첫줄에서 부모의 생성자를 호출해야 함.
		// ClassC()의 생성자가 먼저 호출되는 것은 맞다.
		// 하지만 ClassC()의 생성자는 가장 먼저 super를 통해 ClassB()의 생성자를 호출한다.
		// ClassB()도 마찬가지
		super(10, 20);
		System.out.println("ClassC 생성자");
	}

}
