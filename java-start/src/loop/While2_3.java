package loop;

public class While2_3 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		int endNum = 100;
		
		while(i <= endNum) {
			sum = sum + i;
			System.out.println("i=" + i + ", sum=" + sum);
			i++;
		}
	}
}
// i가 endNum이 될 때까지 더하기
// While문 사용