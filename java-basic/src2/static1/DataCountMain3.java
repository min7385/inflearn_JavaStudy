package static1;

public class DataCountMain3 {

	public static void main(String[] args) {
		Data3 data1 = new Data3("A");
		System.out.println("A count = " + Data3.count);
		
		Data3 data2 = new Data3("B");
		System.out.println("B count = " + Data3.count);
		
		Data3 data3 = new Data3("C");
		// 클래스를 통한 접근
		System.out.println("C count = " + Data3.count);
		
		// 인스턴스를 통한 접근
		// 정적 변수의 경우 비추천하는 방법
		// 보면 count에 노란줄 떠있고, Data3.count로 수정을 추천함.
		Data3 data4 = new Data3("D");
		System.out.println(data4.count);
	}

}
