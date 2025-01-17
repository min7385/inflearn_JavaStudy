package ref;

public class Method2 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        System.out.println("student1 = " + student1);
        Student student2 = createStudent("학생2", 16, 80);
        System.out.println("student2 = " + student2);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        System.out.println("student = " + student);
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student; // 만들어진 인스턴스의 참조값 반환
    }

    // 전달한 학생 객체의 필드 값을 읽어서 출력
    static void printStudent(Student student){
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
// student  = ref.Student@41629346
// student1 = ref.Student@41629346

// student  = ref.Student@404b9385
// student2 = ref.Student@404b9385