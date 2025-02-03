package pack;

import pack.a.User;
import pack.a.User2;

public class PackageMain2 {
	
	public static void main(String[] args) {
		Data data = new Data();
		User user = new User();
		User2 user2 = new User2();
	}
}
// 다른 패키지일 때 항상 전체 경로를 적어주는 것은 불편
// 따라서 import 사용
// import pack.a.*;이라 적으면 소속된 클래스 다 불러옴. 하위는 따로 임포트해야함.