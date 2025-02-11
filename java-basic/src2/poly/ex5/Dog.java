package poly.ex5;

public class Dog implements InterfaceAnimal{
	// class를 상속 받을 땐 extends, interface를 구현(상속)할 땐 implements
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	@Override
	public void move() {
		System.out.println("개 이동");
	}

}
