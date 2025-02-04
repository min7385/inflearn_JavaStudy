package static2.ex;

public class Car {
	private static int totalCars;
	private String name;
	
	public Car(String name) {
		System.out.println("차량 구입, 이름: " + name);
		this.name = name;
		totalCars++;
	}
	
	public static void showTotalCars() {
		System.out.println("구매한 차량 수: " + totalCars);
	}
	
}
// totalCars은 공통으로 사용하는 변수(정적 변수)
// name은 인스턴스 변수
