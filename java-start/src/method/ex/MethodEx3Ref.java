// 메소드를 사용하면 좋은 점
// 1. 유지보수 수월(예: 입금과 출금 부분이 메서드로 명확하게 분리되었기 때문에 이후 변경 사항이 발생하면 관련 메서드만 수정하면 됨)
// 2. 메서드를 재사용 할 수 있음
// 3. 구조적으로 읽기 쉬움

package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 2000);
        balance = withdraw(balance, 5000);

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원을 입금. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}