package loop.Ex;

public class NestedEx2 {

	public static void main(String[] args) {
		int rows = 5;
		
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
// 정해진 횟수만큼 반복을 수행해야 하면 for문, 그렇지 않으면 while문을 사용