package oop1;
// 클래스는 데이터인 멤버 변수뿐 아니라, 기능 역할을 하는 메서드도 포함할 수 있다.
public class ValueObject {
    int value;

    // static이 붙으면 객체를 생성하지 않고도 메서드를 호출할 수 있다.
    // 메서드는 객체를 생성해야 호출할 수 있기 때문에 static을 뺀다.
    void add(){
        // 기본적으로 본인 인스턴스에 있는 멤버 변수에 접근한다.
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
