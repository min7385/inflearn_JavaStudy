package static2;

// import static static2.DecoData.staticCall;
// 정적 메소드를 import하면 클래스명 생략 가능 / 예) DecoData.staticCall(); => staticCall();
public class DecoDataMain {

	public static void main(String[] args) {
		System.out.println("1. 정적 호출");
		DecoData.staticCall();
		DecoData.staticCall();
		DecoData.staticCall();
		DecoData.staticCall();
		DecoData.staticCall();
		
		System.out.println("2. 인스턴스 호출1");
		DecoData data1 = new DecoData();
		data1.instanceCall();
		
		System.out.println("3. 인스턴스 호출2");
		DecoData data2 = new DecoData();
		data2.instanceCall();
		
		DecoData.staticCall(data1);
		
		// 인스턴스를 통한 접근
		// 결국엔 클래스 소속인데 이렇게 하면, 인스턴스 소속이라 착각할 수 있음 => 비추천
		DecoData data3 = new DecoData();
		data3.staticCall();
		
		// 클래스를 통한 접근
		DecoData.staticCall();
	}

}
