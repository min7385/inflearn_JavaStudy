package extends1.ex1;

public class CarMain {

	public static void main(String[] args) {
		ElectricCar electricCar = new ElectricCar();
		electricCar.move();
		electricCar.charge();
		
		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
	}

}
// 차종에 따라 주유하는 방식이 다르지만
// 자동차가 이동하는 것은 똑같다. 이런 경우 상속 관계를 사용하는 것이 효과적