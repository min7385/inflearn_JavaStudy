package poly.ex2;

public class AnimalPolyMain1 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Caw caw = new Caw();
		
		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(caw);
	}
	
	private static void soundAnimal(Animal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound();
		System.out.println("동물 소리 테스트 종료");
	}
	// 1) animal 변수는 자식인 Dog, Cat, Caw의 인스턴스를 참조할 수 있다.
	// 2) 메서드 오버라이딩 덕분에 똑같은 soundAnimal()메소드이지만
	// dog, cat, caw별로 다르게 출력됨.

}
