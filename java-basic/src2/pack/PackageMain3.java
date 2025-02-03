package pack;

import pack.a.User;

public class PackageMain3 {

	public static void main(String[] args) {
		User user = new User();
		pack.b.User userB = new pack.b.User();
	}
}
// 클래스를 구분하는것은 패키지명을 포함한 전체임. 그래서 둘다 클래스명이 유저이지만 구분 가능
// 그런데 같이 사용할려면? 위처럼 하나는 전체 경로를 적어줄 수 밖에 없음.