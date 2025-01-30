package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇 개의 숫자를 입력하시겠습니까?");
		int count = scanner.nextInt();
		
		int[] numbers = new int[count];
		int sum = 0;
		double average;
		
		System.out.println(count + "개의 정수를 입력하세요.");
		for(int i=0; i<count; i++) {
			numbers[i] = scanner.nextInt();
			sum += numbers[i];
		}
		average = sum / numbers.length;
		System.out.println("입력한 정수의 총합: " + sum);
		System.out.println("입력한 정수의 평균: " + average);
	}
}
