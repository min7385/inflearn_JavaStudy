package access.a;

public class PublicClass {

	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		DefaultClass1 class1 = new DefaultClass1();
		DefaultClass2 class2 = new DefaultClass2();
		
	}

}
// 접근제어자 default
class DefaultClass1{
	
}

class DefaultClass2{
	
}
// 클래스 레벨의 접근 제어자 규칙
// public, default만 사용 가능
// public 클래스명은 파일명과 동일해야 함.