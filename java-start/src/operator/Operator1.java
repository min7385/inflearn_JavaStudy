package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b = " + sum);

        int diff = a - b;
        System.out.println("a - b = " + diff);

        int multi = a * b;
        System.out.println("a * b = " + multi);

        int div = a / b;
        System.out.println("a / b = " + div); // int 형끼리의 계산이라 소수점 계산이 안됨

        // 나머지 계산
        int mod = a % b;
        System.out.println("a % b = " + mod);

        // 주의! 숫자는 0으로 나눌 수 없다.
    }
}
