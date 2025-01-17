package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    MemberInit(){
    }

    // 추가
    // this. >> 자기 자신의 인스턴스를 참조
    // name = name;이 되니깐 this.name해서 멤버변수 String name을 가르키기 위해 this 사용
    // 결국엔 위 변수 이름과 아래 변수 이름이 같아서 구분하기 위해 this 사용
    void initmember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
