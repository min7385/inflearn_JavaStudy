package poly.ex1;

public class AnimalSoundMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Caw caw = new Caw();
		
		System.out.println("동물 소리 테스트 시작");
		dog.sound();
		System.out.println("동물 소리 테스트 종료");
		
		System.out.println("동물 소리 테스트 시작");
		cat.sound();
		System.out.println("동물 소리 테스트 종료");
		
		soundCaw(caw);
		// println(~~~) 중복을 제거하기 위해 메서드를 사용하거나 배열과 for문을 사용하면 되지만,
		// Dog, Cat, Caw는 서로 완전히 다른 클래스이다.
		// soundCaw(cat); 타입이 다르기 때문에 컴파일 오류
		// Caw[] cawArr = {dog, cat, caw}; 타입이 다르기 때문에 컴파일 오류
	}
	
	private static void soundCaw(Caw caw) {
		System.out.println("동물 소리 테스트 시작");
		caw.sound();
		System.out.println("동물 소리 테스트 종료");
	}
}
