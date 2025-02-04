package static1;

public class DataCountMain2 {

	public static void main(String[] args) {
		Counter counter = new Counter();
		Data2 data1 = new Data2("A", counter);
		System.out.println("A count = " + counter.count);
		
		Data2 data2 = new Data2("B", counter);
		System.out.println("B count = " + counter.count);
		
		Data2 data3 = new Data2("C", counter);
		System.out.println("C count = " + counter.count);
	}

}
// Counter랑 Data2랑 DataCountMain2랑 한 세트
// 이렇게 하면 몇 개의 객체(Data2)가 생성되었는지 확인할 수 있음.
// Counter라는 외부의 도움 없이는 생성된 객체의 수를 셀 수 없을까?