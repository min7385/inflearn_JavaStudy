package access;

public class Speaker {
	private int volume;
	
	Speaker(int volume){
		this.volume = volume;
	}
	
	void volumeUp() {
		if(volume >= 100) {
			System.out.println("음량을 늘릴 수 없습니다. 최대 음량입니다.");
		}else {
			volume += 10;
			System.out.println("음량 10 증가");
		}
	}
	
	void volumeDown() {
		if(volume <= 0) {
			System.out.println("음량을 줄일 수 없습니다. 최소 음량입니다.");
		}else {
			volume -= 10;
			System.out.println("음량 10 감소");
		}
	}
	
	void showVolume() {
		System.out.println("현재 음량: " + volume);
	}
}
// 1. 접근제어자의 종류
// private: 모든 외부 호출을 막는다.
// default(package-private): 같은 패키지 안에서 호출은 허용한다.
// protected: 같은 패키지 안에서 호출은 허용한다. 패키지가 달라도 상속 관계의 호출은 허용한다.
// public: 모든 외부 호출을 허용한다.
// 2. 허용 차단하는 정도: private > default > protected > public
// 3. 접근제어자는 클래스, 필드, 생성자, 메서드에 사용된다.
