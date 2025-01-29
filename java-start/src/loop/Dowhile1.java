package loop;

public class Dowhile1 {

	public static void main(String[] args) {
		int i = 10;
		
		do {
			System.out.println("현재 숫자는 " + i);
			i++;
		}while(i < 3);
	}
}
// do-while 최초 1회 코드 블록 실행
// do {}를 실행하고  while문이 true이면 do {} 재실행, false면 빠져나감.