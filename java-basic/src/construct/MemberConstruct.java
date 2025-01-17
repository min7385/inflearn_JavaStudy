package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    // grade를 받지 않음
    // this() 규칙: 첫 줄에 작성해야 함
    MemberConstruct(String name, int age){
        this(name, age, 50);    // 변경: this()를 사용하면 생성자 내부에서 다른 생성자를 호출할 수 있다. >> 중복 제거
    }

    // 생성자를 사용하면 객체를 생성하는 시점에 즉시 필요한 기능을 수행할 수 있다.
    // 메서드와 유사하지만, 다음과 같은 차이가 있음
    // 1. 생성자의 이름은 클래스 이름과 같다
    // 2. 반환 타입이 없다.
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
