package loop;

public class While2_2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		sum = sum + i;
		System.out.println("i는 " + i + ", sum은 " + sum);
		i++;
		
		sum = sum + i;
		System.out.println("i는 " + i + ", sum은 " + sum);
		i++;
		
		sum = sum + i;
		System.out.println("i는 " + i + ", sum은 " + sum);
		i++;
	}
}
// While2_1에서 공통되게 변하는 수를 i로 변경
