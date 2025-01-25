package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1);
        System.out.println("value2 = " + data.value2);
    }
}
// 변수의 값 초기화
// 멤버 변수: 자동 초기화
// 숫자 = 0, boolean = false, 참조형 = null