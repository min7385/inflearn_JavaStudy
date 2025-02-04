package static1;

public class DataCountMain1 {
	
	public static void main(String[] args) {
		Data1 data1 = new Data1("A");
		System.out.println("A count = " + data1.count);
		
		Data1 data2 = new Data1("B");
		System.out.println("B count = " + data2.count);
		
		Data1 data3 = new Data1("C");
		System.out.println("C count = " + data3.count);
	}

}
// 결과가 모두 1 나온다.
// 객체를 생성할 때마다 Data1의 인스턴스는 새로 만들어진다. 그리고 인스턴스에 포함된 count 변수도 새로 만들어지기 때문이다.