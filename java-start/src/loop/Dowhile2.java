package loop;

public class Dowhile2 {

	public static void main(String[] args) {
		int i = 10;
		while(i < 3) {
			System.out.println("현재 숫자는 " + i);
			i++;
		}
	}

}
// while과 비슷하지만, 조건에 상관없이 무조건 한 번은 코드를 실행한다.
// i는 10으로, i < 3은 false가 되고, 코드를 실행하지 않는다.
// 그러나 do-while문은 Dowhile2 참고