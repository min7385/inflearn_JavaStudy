package loop;

public class Continue1 {

	public static void main(String[] args) {
		int i = 1;
		
		while(i <= 5) {
			if(i == 3) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}
// continue: 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행