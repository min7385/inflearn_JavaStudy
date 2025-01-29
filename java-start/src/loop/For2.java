package loop;

public class For2 {

	public static void main(String[] args) {
		int sum = 0;
		int endNum = 3;
		
		for(int i=1; i<=endNum; i++) {
			sum = sum + i;
			System.out.println("i=" + i + ", sum=" + sum);
		}
	}
}
// for문은 while문에 비해 초기식, 조건식, 증감식이 한 눈에 들어온다.