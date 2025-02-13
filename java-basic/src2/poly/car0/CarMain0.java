package poly.car0;

public class CarMain0 {

	public static void main(String[] args) {
		Driver driver = new Driver();
		K3Car k3Car = new K3Car();
		driver.setK3Car(k3Car);
		driver.drive();
		
		// 추가
		Model3Car model3Car = new Model3Car();
		driver.setK3Car(null);
		driver.setModel3Car(model3Car);
		driver.drive();
	}

}
// 의존성 주입
// 운전할 수 있는 자동차가 많아질 수록 코드를 많이 변경해야되는 불편함 존재
// 역할과 구현을 분리해야 함.