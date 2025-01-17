package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;   // Data data = new Data(); 로 고치면 됨.
        data.value = 10;
        System.out.println("data = " + data.value);
    }
}
// NullPointerException: 참조값(주소)이 없는 곳을 찾아갈 때 발생하는 예외