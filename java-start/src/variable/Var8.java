package variable;

public class Var8 {

    public static void main(String[] args) {
        // 정수
        // 정수 리터럴은 기본 int
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647(약 20억)
        long l = 9223370236854775807L; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        // 실수
        // 실수 리터럴은 기본 double
        float f = 10.0f;
        double d = 10.0;
    }
}
/*
자주 사용하는 타입: int, long, double, boolean, String
*/

/*
자바 언어의 관례
 - 클래스는 대문자로 시작, 나머지는 소문자로 시작
 - 카멜표기법 사용
 - 예외: 상수는 모두 대문자 사용하고 언더바로 구분, 패키지는 모두 소문자 사용
*/