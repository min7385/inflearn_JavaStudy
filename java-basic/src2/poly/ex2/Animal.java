package poly.ex2;

public class Animal {
	public void sound() {
		System.out.println("동물 울음 소리");
	}
}
// 1. 다형성을 위해서 필요한 것이지 직접 생성해서 사용할 일은 없음.
// 2. Animal 클래스를 상속 받은 곳에서 sound() 메서드를 오버라이딩 하지 않을 가능성 있음.
// 추상 클래스와 추상 메서드 사용하면 1,2번 문제를 해결 할 수 있음.