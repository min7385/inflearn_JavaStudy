package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        System.out.println("dataA = " + dataA);
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
        System.out.println("dataA = " + dataA);
    }

    static void changeReference(Data dataX){
        dataX.value = 20;
    }
}

// 1. 메서드 호출
// 메서드를 호출할 때, 매개변수 dataX에 변수 dataA의 값을 전달(참조값을 복사해서 전달)

// 2. 메서드 안에서 값 변경
// dataA.value와 dataX.value 둘다 20이라는 값을 가진다.

// 3. 메서드 종료
// dataA.value가 20인 것을 확인할 수 있음.