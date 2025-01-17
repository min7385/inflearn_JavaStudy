package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        // 메서드를 호출할 때 매개변수 x에 변수 a의 값을 전달한다.
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a);
    }

    static void changePrimitive(int x){
        x = 20;
    }
}

// 1. 매서드 호출
// a = 10, x = 10

// 2. 메서드 안에서 값을 변경
// a = 10, x = 20

// 3. 메서드 종료
// a = 10, x는 제거됨