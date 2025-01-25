package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter;
        // 이 경우 매개변수와 멤버변수의 이름이 다르기 때문에 this를 생략할 수 있음
        // 과거에는 이 경우에도 this.을 붙였음. 지금은 IDE가 발전하면서 색상으로 구분해주기 때문에 굳이 안씀.
    }
}
